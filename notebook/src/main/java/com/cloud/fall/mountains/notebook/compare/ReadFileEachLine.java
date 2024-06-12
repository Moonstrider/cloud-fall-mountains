package com.cloud.fall.mountains.notebook.compare;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEachLine {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa/kustomization.yaml");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                System.out.println(line);
            }
        }
    }
}
