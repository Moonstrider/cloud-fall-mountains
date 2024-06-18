package com.cloud.fall.mountains.notebook.compare;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.flipkart.zjsonpatch.JsonDiff;
import org.apache.commons.lang3.StringUtils;

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

public class CompareGitops {

    // this base_dir will be a hard coded path on jenkins server
    public static final String base_dir = "/Users/xzhu54/work/global/lab/";
    public static final String global_gitops = "identity-access-management-gitops";
    public static final String dragon_gitops = "dragonite-gitops";
    public static final String app = "/app";

    public static final List<String> globalAppList = new ArrayList<>(30);
    public static final List<String> dragonAppList = new ArrayList<>(30);
    public static final List<String> sameAppList = new ArrayList<>(30);
    public static final List<String> globalAllFiles = new ArrayList<>();
    public static final List<String> dragonAllFiles = new ArrayList<>();
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
    public static final String separateLine = "-------------------------------------------";


    public static void main(String[] args) throws Exception {

        // todo read base_dir from jenkins server or hardcode it
        String globalAppDir = base_dir + global_gitops + app;
        String dragonAppDir = base_dir + dragon_gitops + app;

        // app level diff
        List<String> allGlobalDirs = convertFileListToStringList(getSubDirs(new File(globalAppDir)));
        List<String> allDragonDirs = convertFileListToStringList(getSubDirs(new File(dragonAppDir)));
        compareAppDirLevel(allGlobalDirs, allDragonDirs);

        // each app's file diff
        prepareFilesForBothSides(globalAppDir, dragonAppDir);
        compareAppFileLevel();

        // file content diff will be checked in each app's file diff
        // when there is a same file, will check content diff

        System.out.println("...");

    }


    public static List<File> getSubDirs(File file) {

        List<File> subDirs = Arrays.asList(Objects.requireNonNull(file.listFiles(File::isDirectory)));
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

    public static void compareAppDirLevel(List<String> allGlobalDirs, List<String> allDragonDirs) {
        System.out.println(separateLine);
        System.out.println("Compare app level");
        for (String dir : allGlobalDirs) {
            if (dir.contains("base")) {
                String[] splitFirst = dir.split(global_gitops);
                String[] appName = splitFirst[1].split("/base");
                globalAppList.add(appName[0]);
            }
        }
        for (String dir : allDragonDirs) {
            if (dir.contains("base")) {
                String[] splitFirst = dir.split(dragon_gitops);
                String[] appName = splitFirst[1].split("/base");
                dragonAppList.add(appName[0]);
            }
        }

        for (String g : globalAppList) {
            if (dragonAppList.contains(g)) {
                String[] split = g.split("/app");
                sameAppList.add(split[1]);
//                System.out.println("both have " + g);
            } else {
                System.out.println("Exists in EU but not in CN:" + g);
            }
        }
        for (String d : dragonAppList) {
            if (!globalAppList.contains(d)) {
                System.out.println("Exists in CN but not in EU:" + d);
            }
        }
    }


    public static void compareAppFileLevel() throws Exception {
        System.out.println(separateLine);
        System.out.println("Compare app files");

//        for (String app : sameAppList) {
//            System.out.println("compare qa files for " + app);
//            compareAppFileOfBothSide(app, euQaFileList, cnQaFileList);
//        }
        System.out.println("compare base files");
        compareAppFileOfBothSide(euBaseFileList, cnBaseFileList);
        System.out.println("compare qa files");
        compareAppFileOfBothSide(replaceFolder(euQaFileList, "eu.qa.volvoc3.com", "cn.c3.qa"), cnQaFileList);
        System.out.println("compare prod files");
        compareAppFileOfBothSide(replaceFolder(euProdFileList, "eu.prod.volvoc3.com", "cn.c3.prod"), cnProdFileList);
        System.out.println("compare component files");
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

    public static void compareAppFileOfBothSide(List<String> global, List<String> dragon) throws Exception {
        // g is a file path of global gitops
        for (String g : global) {
            if (!dragon.contains(g)) {
                if (g.contains("cn.c3.qa")) {
                    g = g.replace("cn.c3.qa", "eu.qa.volvoc3.com");
                }
                if (g.contains("cn.c3.prod")) {
                    g = g.replace("cn.c3.prod", "eu.prod.volvoc3.com");
                }
                // doing replace only to print
                System.out.println("Exists in EU but not in CN:" + g);
            } else {
                // these yaml has duplicate keys
//                if (g.contains("prometheus-patch.yaml")
//                        || g.contains("service-entry-external.yaml")
//                        || g.contains("service-internal-communication.yaml")
//                        || g.contains("service-http-patch.yaml")
//                        || g.contains("permissive-dr.yaml")
//                        || g.contains("apollo-gw.yaml")
//                        || g.contains("service-entry-internal.yaml")
//                ) {
//                    continue;
//                }
                String dd = "";
                for (String d : dragon) {
                    // find the same yaml file in dragonite-gitops
                    if (d.equals(g)) {
                        dd = d;
                    }
                }
                // doing replace only to print
                if (g.contains("cn.c3.qa")) {
                    g = g.replace("cn.c3.qa", "eu.qa.volvoc3.com");
                }
                if (g.contains("cn.c3.prod")) {
                    g = g.replace("cn.c3.prod", "eu.prod.volvoc3.com");
                }
                // these yaml has duplicate keys
//                if (g.contains("ping-datasync/overlays/eu.qa.volvoc3.com/patch.yaml")
//                        || g.contains("user-message-dispatcher/overlays/eu.qa.volvoc3.com/patch.yaml")
//                        || g.contains("volvoid-portal-external/overlays/eu.qa.volvoc3.com/qa_patch.yaml")
//                        || g.contains("account-api/overlays/eu.qa.volvoc3.com/qa_patch.yaml")
//                        || g.contains("user-message-dispatcher/overlays/eu.prod.volvoc3.com/patch.yaml")
//                        || g.contains("volvoid-portal-external/overlays/eu.prod.volvoc3.com/prod_patch.yaml")
//                        || g.contains("account-api/overlays/eu.prod.volvoc3.com/prod_patch.yaml")
//                ) {
//                    continue;
//                }
                String s1 = base_dir + global_gitops + g;
                String s2 = base_dir + dragon_gitops + dd;
                compareYamlContent(s2, s1);
            }
        }
        for (String d : dragon) {
            if (!global.contains(d)) {
                System.out.println("Exists in CN but not in EU:" + d);
            }
        }
    }

    public static void prepareFilesForBothSides(String globalAppDir, String dragonAppDir) throws IOException {
        for (String e : sameAppList) {
            String g = globalAppDir + e;
            String d = dragonAppDir + e;
            Path gAppPath = Paths.get(g);
            listAllFiles(gAppPath, globalAllFiles);
            Path dAppPath = Paths.get(d);
            listAllFiles(dAppPath, dragonAllFiles);
        }

        for (String gFile : globalAllFiles) {
            if (gFile.contains("eu.qa.volvoc3.com")) {
                euQaFileList.add(gFile);
            } else if (gFile.contains("eu.prod.volvoc3.com")) {
                euProdFileList.add(gFile);
            } else if (gFile.contains("base")) {
                euBaseFileList.add(gFile);
            } else if (gFile.contains("components")) {
                euComponentFileList.add(gFile);
            } else {
                euUnknownFileList.add(gFile);
            }
        }

        for (String dFile : dragonAllFiles) {
            if (dFile.contains("cn.c3.qa")) {
                cnQaFileList.add(dFile);
            } else if (dFile.contains("cn.c3.prod")) {
                cnProdFileList.add(dFile);
            } else if (dFile.contains("base")) {
                cnBaseFileList.add(dFile);
            } else if (dFile.contains("components")) {
                cnComponentFileList.add(dFile);
            } else {
                cnUnknownFileList.add(dFile);
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

    public static void compareYamlContent(String eu, String cn) throws Exception {

        System.out.println("checking yaml diff");
        System.out.println(eu);
        System.out.println(cn);
        String euDiff = yamlDiff(eu, cn);
        if (StringUtils.isNoneBlank(euDiff)) {
            System.out.println("diff from EU to CN:" + euDiff);
        }
        String cnDiff = yamlDiff(cn, eu);
        if (StringUtils.isNotBlank(cnDiff)) {
            System.out.println("diff from CN to EU:" + cnDiff);
        }
        System.out.println("checking complete");
    }

    public static String yamlDiff(String path1, String path2) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        JsonNode file1 = objectMapper.readTree(new File(path1));
        JsonNode file2 = objectMapper.readTree(new File(path2));
        JsonNode patch = JsonDiff.asJson(file1, file2);
        return patch.isEmpty() ? "" : patch.toString();
    }


//        dirAppLevelCompare(globalAppDir, dragonAppDir);
//        for (String e : oldSameAppList) {
//            String g = globalAppDir + e;
//            String d = dragonAppDir + e;
//            Path gAppPath = Paths.get(g);
//            listAllFiles(gAppPath, globalAllFiles);
//            Path dAppPath = Paths.get(d);
//            listAllFiles(dAppPath, dragonAllFiles);
//        }


//    public static void dirAppLevelCompare(String globalAppPath, String dragonAppPath) {
//        File globalFile = new File(globalAppPath);
//        File dragonFile = new File(dragonAppPath);
//        String[] globalDirs = globalFile.list((current, name) -> new File(current, name).isDirectory());
//        String[] dragonDirs = dragonFile.list((current, name) -> new File(current, name).isDirectory());
//        System.out.println("global: app level " + Arrays.toString(globalDirs));
//        System.out.println("快龙   ：app level " + Arrays.toString(dragonDirs));
//
//        Map<String, String[]> globalMap = new HashMap<>();
//        Map<String, String[]> dragonMap = new HashMap<>();
//
//        assert globalDirs != null;
//        assert dragonDirs != null;
//        for (String globalDir : globalDirs) {
//            globalFile = new File(globalAppPath + "/" + globalDir);
//            String[] subDirArr = globalFile.list(
//                    (current, name) -> new File(current, name).isDirectory()
//            );
//            globalMap.put(globalDir, subDirArr);
//        }
//        for (String dragonDir : dragonDirs) {
//            dragonFile = new File(dragonAppPath + "/" + dragonDir);
//            String[] subDirArr = dragonFile.list(
//                    (current, name) -> new File(current, name).isDirectory()
//            );
//            dragonMap.put(dragonDir, subDirArr);
//        }
//
//        globalMap.forEach((k, globalArr) -> {
//            if (dragonMap.containsKey(k)) {
//                String[] dragonArr = dragonMap.get(k);
//                System.out.println("global [" + app + "/" + k + "] has:" + Arrays.toString(globalArr));
//                System.out.println("快龙  ：[" + app + "/" + k + "] has:" + Arrays.toString(dragonArr));
//
//                getSameApp(k, globalArr, dragonArr);
//
//            } else {
//                System.out.println("Warning!!! global has [" + k + "] but dragon doesn't");
//            }
//        });
//    }


//    public static void getSameApp(String appPath, String[] globalApps, String[] dragonApps) {
//
//        List<String> globalAppList = List.of(globalApps);
//        List<String> dragonAppList = List.of(dragonApps);
//        globalAppList.forEach(app -> {
//            if (dragonAppList.contains(app)) {
//                String sameApp = "/" + appPath + "/" + app;
////                System.out.println("!!!!!!!!" + sameApp);
//                oldSameAppList.add(sameApp);
//            }
//        });
//    }
}
