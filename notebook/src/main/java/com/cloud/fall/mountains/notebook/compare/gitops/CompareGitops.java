package com.cloud.fall.mountains.notebook.compare.gitops;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.flipkart.zjsonpatch.JsonDiff;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

// java -cp .:commons-lang3-3.14.0.jar:jackson-dataformat-yaml-2.15.4.jar:jackson-annotations-2.15.4.jar:json-20240303.jar:jackson-core-2.15.4.jar:zjsonpatch-0.4.16.jar:jackson-databind-2.15.4.jar:snakeyaml-2.2.jar:commons-collections4-4.4.jar -Dbase_dir=/Users/xzhu54/work/global/lab/ CompareGitops.java
public class CompareGitops {

    // this base_dir will be a hard coded path on jenkins server
    public static String base_dir = "";
    public static final String eu_gitops = "identity-access-management-gitops";
    public static final String cn_gitops = "dragonite-gitops";
    public static final String app = "/app";

    public static final List<String> euAppList = new ArrayList<>(30);
    public static final List<String> cnAppList = new ArrayList<>(30);
    public static final List<String> sameAppList = new ArrayList<>(30);
    public static final List<String> euAllFiles = new ArrayList<>();
    public static final List<String> cnAllFiles = new ArrayList<>();
    public static final List<String> euQaFileList = new ArrayList<>();
    public static final List<String> cnQaFileList = new ArrayList<>();
    public static final List<String> euProdFileList = new ArrayList<>();
    public static final List<String> cnProdFileList = new ArrayList<>();
    public static final List<String> euBaseFileList = new ArrayList<>();
    public static final List<String> cnBaseFileList = new ArrayList<>();
    public static final List<String> euComponentFileList = new ArrayList<>();
    public static final List<String> cnComponentFileList = new ArrayList<>();
    public static final List<String> euUnknownFileList = new ArrayList<>();
    public static final List<String> cnUnknownFileList = new ArrayList<>();
    public static final String separateLine = "--------------------";


    public static void main(String[] args) throws Exception {

        String baseDir = System.getProperty("base_dir");
        System.out.println("Value of baseDir: " + baseDir);

        if (StringUtils.isBlank(baseDir)) {
            base_dir = "/Users/xzhu54/work/global/lab/";
        } else {
            base_dir = baseDir;
        }

        // todo read base_dir from jenkins server or hardcode it
        String euAppDir = base_dir + eu_gitops + app;
        String cnAppDir = base_dir + cn_gitops + app;

        // app level diff
        List<String> allEuDirs = convertFileListToStringList(
            getSubDirs(new File(euAppDir)));
        List<String> allCnDirs = convertFileListToStringList(
            getSubDirs(new File(cnAppDir)));
        compareAppDirLevel(allEuDirs, allCnDirs);

        // each app's file diff
        prepareFilesOfBothSides(euAppDir, cnAppDir);
        compareAppFileLevel();

        // file content diff will be checked in each app's file diff
        // when there is a same file, will check content diff

        System.out.println("Finish");
    }


    public static List<File> getSubDirs(File file) {

        List<File> subDirs = Arrays.asList(
            Objects.requireNonNull(file.listFiles(File::isDirectory)));
        subDirs = new ArrayList<>(subDirs);

        List<File> deepSubDirs = new ArrayList<>();
        for (File subDir : subDirs) {
            deepSubDirs.addAll(getSubDirs(subDir));
        }
        subDirs.addAll(deepSubDirs);
        return subDirs;
    }

    public static List<String> convertFileListToStringList(List<File> fileList) {
        List<String> result = new ArrayList<>(fileList.size());
        for (File file : fileList) {
            result.add(file.toString());
        }
        return result;
    }

    public static void compareAppDirLevel(List<String> allEuDirs, List<String> allCnDirs) {
        System.out.println(separateLine + "Compare app level" + separateLine);
        for (String dir : allEuDirs) {
            if (dir.contains("base")) {
                String[] splitFirst = dir.split(eu_gitops);
                String[] appName = splitFirst[1].split("/base");
                euAppList.add(appName[0]);
            }
        }
        for (String dir : allCnDirs) {
            if (dir.contains("base")) {
                String[] splitFirst = dir.split(cn_gitops);
                String[] appName = splitFirst[1].split("/base");
                cnAppList.add(appName[0]);
            }
        }

        for (String euApp : euAppList) {
            if (cnAppList.contains(euApp)) {
                String[] split = euApp.split("/app");
                sameAppList.add(split[1]);
//                System.out.println("both have " + g);
            } else {
                System.out.println("Exists in EU but not in CN:" + euApp);
            }
        }
        for (String cnApp : cnAppList) {
            if (!euAppList.contains(cnApp)) {
                System.out.println("Exists in CN but not in EU:" + cnApp);
            }
        }
    }

    public static void prepareFilesOfBothSides(String euAppDir, String cnAppDir)
        throws IOException {
        for (String app : sameAppList) {
            String eu = euAppDir + app;
            String cn = cnAppDir + app;
            Path euAppPath = Paths.get(eu);
            listAllFiles(euAppPath, euAllFiles);
            Path cnAppPath = Paths.get(cn);
            listAllFiles(cnAppPath, cnAllFiles);
        }

        for (String euFile : euAllFiles) {
            if (euFile.contains("eu.qa.volvoc3.com")) {
                euQaFileList.add(euFile);
            } else if (euFile.contains("eu.prod.volvoc3.com")) {
                euProdFileList.add(euFile);
            } else if (euFile.contains("base")) {
                euBaseFileList.add(euFile);
            } else if (euFile.contains("components")) {
                euComponentFileList.add(euFile);
            } else {
                euUnknownFileList.add(euFile);
            }
        }

        for (String cnFile : cnAllFiles) {
            if (cnFile.contains("cn.c3.qa")) {
                cnQaFileList.add(cnFile);
            } else if (cnFile.contains("cn.c3.prod")) {
                cnProdFileList.add(cnFile);
            } else if (cnFile.contains("base")) {
                cnBaseFileList.add(cnFile);
            } else if (cnFile.contains("components")) {
                cnComponentFileList.add(cnFile);
            } else {
                cnUnknownFileList.add(cnFile);
            }
        }
    }

    public static void listAllFiles(Path currentPath, List<String> allFiles) throws IOException {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentPath)) {
            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    listAllFiles(entry, allFiles);
                } else {
                    String path = entry.toString();
                    if (path.contains("identity-access-management-gitops")) {
                        String[] split = path.split("identity-access-management-gitops");
                        allFiles.add(split[1]);
                    } else if (path.contains("dragonite-gitops")) {
                        String[] split = path.split("dragonite-gitops");
                        allFiles.add(split[1]);
                    } else {
                        System.out.println("error path:" + path);
                    }
//                    allFiles.add(entry.toString());
                }
            }
        }
    }

    public static void compareAppFileLevel() throws Exception {
        System.out.println(separateLine + "Compare app files level" + separateLine);

        System.out.println(separateLine + "compare base files" + separateLine);
        compareAppFileOfBothSide(euBaseFileList, cnBaseFileList);

        System.out.println(separateLine + "compare qa files" + separateLine);
        compareAppFileOfBothSide(replaceFolder(euQaFileList, "eu.qa.volvoc3.com", "cn.c3.qa"),
            cnQaFileList);

        System.out.println(separateLine + "compare prod files" + separateLine);
        compareAppFileOfBothSide(replaceFolder(euProdFileList, "eu.prod.volvoc3.com", "cn.c3.prod"),
            cnProdFileList);

        System.out.println(separateLine + "compare component files" + separateLine);
        compareAppFileOfBothSide(euComponentFileList, cnComponentFileList);

//        System.out.println("compare unknown files");
//        compareAppFileOfBothSide(euUnknownFileList, cnUnknownFileList);
    }

    public static List<String> replaceFolder(List<String> list, String from, String to) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            String n = s.replace(from, to);
            newList.add(n);
        }
        return newList;
    }

    public static void compareAppFileOfBothSide(List<String> euList, List<String> cnList)
        throws Exception {
        ObjectMapper prettyJsonMapper = new ObjectMapper();
        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        // eu is a file path of eu gitops
        for (String eu : euList) {
            if (!cnList.contains(eu)) {
                if (eu.contains("cn.c3.qa")) {
                    eu = eu.replace("cn.c3.qa", "eu.qa.volvoc3.com");
                }
                if (eu.contains("cn.c3.prod")) {
                    eu = eu.replace("cn.c3.prod", "eu.prod.volvoc3.com");
                }
                // doing replace only to print
                System.out.println("Exists in EU but not in CN:" + eu);
            } else {
                String cn = "";
                for (String c : cnList) {
                    // find the same yaml file in cn gitops
                    if (c.equals(eu)) {
                        cn = c;
                    }
                }
                // doing replace only to print
                if (eu.contains("cn.c3.qa")) {
                    eu = eu.replace("cn.c3.qa", "eu.qa.volvoc3.com");
                }
                if (eu.contains("cn.c3.prod")) {
                    eu = eu.replace("cn.c3.prod", "eu.prod.volvoc3.com");
                }

                String euFilePath = base_dir + eu_gitops + eu;
                String cnFilePath = base_dir + cn_gitops + cn;

                compareYamlContent(euFilePath, cnFilePath, prettyJsonMapper, yamlMapper);
            }
        }
        for (String d : cnList) {
            if (!euList.contains(d)) {
                System.out.println("Exists in CN but not in EU:" + d);
            }
        }
    }

    public static void compareYamlContent(String eu, String cn,
        ObjectMapper prettyJsonMapper, ObjectMapper yamlMapper)
        throws Exception {

        // compare eu to cn diff
        String euDiffCn = yamlDiff(eu, cn, yamlMapper);
        String cnDiffEu = yamlDiff(cn, eu, yamlMapper);

        if (StringUtils.isNotBlank(euDiffCn)) {
            System.out.println("checking yaml diff");
            System.out.println(eu);

            printPrettyJson(euDiffCn, cnDiffEu, prettyJsonMapper);

            System.out.println("checking complete");
        }
    }

    public static String yamlDiff(String file1, String file2, ObjectMapper yamlMapper)
        throws Exception {
//        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        JsonNode jsonNode1 = yamlMapper.readTree(new File(file1));
        JsonNode jsonNode2 = yamlMapper.readTree(new File(file2));
        JsonNode patch = JsonDiff.asJson(jsonNode1, jsonNode2);
        return patch.isEmpty() ? "" : patch.toString();
    }

    public static void printPrettyJson(String euDiffCn, String cnDiffEu, ObjectMapper mapper)
        throws JsonProcessingException {
        JSONArray euJsonArr = new JSONArray(euDiffCn);
        for (int i = 0; i < euJsonArr.length(); i++) {
            JSONObject jsonObj = euJsonArr.getJSONObject(i);
            Object jsonObject = mapper.readValue(jsonObj.toString(), Object.class);
            String prettyJson = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonObject);

            // euDiffCN has "op":"remove", should print cnDiffEu's "op":"add"
            // because in this case, "remove" means eu has it but cn doesn't
            // and "op":"remove" it will not print the value
            // in cnDiffEu's "op":"add" which means cn doesn't have, will print what it doesn't have
            // when euDiffCn catches op remove, jump out the current loop and continue next one
            if (prettyJson.contains("\"op\" : \"remove\"")) {
                continue;
            }
            prettyJson = prettyJson.replace("\"op\"", "\"type\"");
            prettyJson = prettyJson.replace("\"replace\"", "\"diff\"");
            prettyJson = prettyJson.replace("\"add\"", "\"missing\"");
//            prettyJson = prettyJson.replace("\"remove\"", "\"new\"");
            prettyJson = prettyJson.replace("\"move\"", "\"different location\"");
            System.out.println(prettyJson);
        }

        JSONArray cnJsonArr = new JSONArray(cnDiffEu);
        for (int i = 0; i < cnJsonArr.length(); i++) {
            JSONObject jsonObj = cnJsonArr.getJSONObject(i);
            Object jsonObject = mapper.readValue(jsonObj.toString(), Object.class);
            String prettyJson = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonObject);

            // euDiffCN has "op":"remove", should print cnDiffEu's "op":"add"
            // because in this case, "remove" means eu has it but cn doesn't
            // and "op":"remove" it will not print the value
            // in cnDiffEu's "op":"add" which means cn doesn't have, will print what it doesn't have
            // when cnDiffEu catches add missing, print it as eu's new
            if (prettyJson.contains("\"op\" : \"add\"")) {
                prettyJson = prettyJson.replace("\"op\"", "\"type\"");
                prettyJson = prettyJson.replace("\"add\"", "\"new\"");
                System.out.println(prettyJson);
            }
        }


    }
}

// these yaml have duplicate keys
// prometheus-patch.yaml
// service-entry-external.yaml
// service-internal-communication.yaml
// service-http-patch.yaml
// permissive-dr.yaml
// apollo-gw.yaml
// service-entry-internal.yaml
// ping-datasync/overlays/eu.qa.volvoc3.com/patch.yaml
// user-message-dispatcher/overlays/eu.qa.volvoc3.com/patch.yaml
// volvoid-portal-external/overlays/eu.qa.volvoc3.com/qa_patch.yaml
// account-api/overlays/eu.qa.volvoc3.com/qa_patch.yaml
// user-message-dispatcher/overlays/eu.prod.volvoc3.com/patch.yaml
// volvoid-portal-external/overlays/eu.prod.volvoc3.com/prod_patch.yaml
// account-api/overlays/eu.prod.volvoc3.com/prod_patch.yaml