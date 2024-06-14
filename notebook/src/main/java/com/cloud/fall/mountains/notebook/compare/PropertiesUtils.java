package com.cloud.fall.mountains.notebook.compare;

import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static java.util.Collections.singletonMap;
import static org.apache.commons.lang3.StringUtils.isBlank;

public class PropertiesUtils {

    public static void main(String[] args) {

        String dragonPath = "/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa/kustomization.yaml";
        String globalPath = "/Users/xzhu54/work/global/lab/identity-access-management-gitops/app/internet/volvoid/account-api/overlays/eu.qa.volvoc3.com/kustomization.yaml";

        compare(dragonPath, globalPath);
    }

    private static void compare(String dragonFilePath, String globalFilePath) {
        System.out.println("Starting to check dragon file:[" + dragonFilePath + "]");
        System.out.println("Comparing with global file:[" + globalFilePath + "]");
        Properties dragon = loadProperties(dragonFilePath);
        Properties global = loadProperties(globalFilePath);
        Set<Object> dragonKeySet = dragon.keySet();
        Set<Object> globalKeySet = global.keySet();
        dragonKeySet.forEach(key -> {
            if (globalKeySet.contains(key)) {
                if (dragon.getProperty((String) key).equals(global.getProperty((String) key))) {
                    System.out.println("Both sides have key:[" + key + "] value:[" + dragon.getProperty((String) key) + "]");
                } else {
                    System.out.println("Same Key:[" + key + "] different value detected");
                    System.out.println("Dragon value [" + dragon.getProperty((String) key) + "]");
                    System.out.println("Global value [" + global.getProperty((String) key) + "]");
                }
            } else {
                System.out.println("Dragon has key but global doesn't [" + key + "]");
                System.out.println("Value is [" + dragon.getProperty((String) key) + "]");
            }
        });
        globalKeySet.forEach(key -> {
            if (!dragonKeySet.contains(key)) {
                System.out.println("Global has key but dragon doesn't [" + key + "]");
                System.out.println("Value is [" + global.getProperty((String) key) + "]");
            }
        });
    }

    public static Properties loadProperties(String yamlPath) {
        try {
            Yaml yaml = new Yaml();
            Properties properties = new Properties();
            properties.putAll(getFlattenedMap(yaml.load(new FileReader(yamlPath))));
            return properties;
        } catch (IOException e) {
            throw new Error("Cannot load properties", e);
        }
    }

    private static Map<String, Object> getFlattenedMap(Map<String, Object> source) {
        Map<String, Object> result = new LinkedHashMap<>();
        buildFlattenedMap(result, source, null);
        return result;
    }

    @SuppressWarnings("unchecked")
    private static void buildFlattenedMap(Map<String, Object> result, Map<String, Object> source, String path) {
        source.forEach((key, value) -> {
            if (!isBlank(path)) key = path + (key.startsWith("[") ? key : '.' + key);
            if (value instanceof String) {
                result.put(key, value);
            } else if (value instanceof Map) {
                buildFlattenedMap(result, (Map<String, Object>) value, key);
            } else if (value instanceof Collection) {
                int count = 0;
                for (Object object : (Collection<?>) value)
                    buildFlattenedMap(result, singletonMap("[" + (count++) + "]", object), key);
            } else {
                result.put(key, value != null ? "" + value : "");
            }
        });
    }
}
