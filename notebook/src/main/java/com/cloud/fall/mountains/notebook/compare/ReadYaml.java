package com.cloud.fall.mountains.notebook.compare;

import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadYaml {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws FileNotFoundException {
        // Create a YAML object
        Yaml yaml = new Yaml();

        // Load the YAML file
        Map<String, Object> data = yaml.load(new FileReader(
                "/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa/kustomization.yaml"));

        // Access data using Java objects or Map (depending on YAML structure)

        // Example: Assuming data is a Map
        String name = (String) data.get("namespace");
        System.out.println("Name: " + name);

        List<LinkedHashMap<String, String>> images = (List<LinkedHashMap<String, String>>) data.get("images");
        LinkedHashMap<String, String> map = images.get(0);
        String newTag = map.get("newTag");
        System.out.println("newTag:" + newTag);

    }
}
