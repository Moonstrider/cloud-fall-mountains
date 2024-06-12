package com.cloud.fall.mountains.notebook.compare;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public class ReadFilename {


    public static void main(String[] args) throws IOException {

        String folderPath = "/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa";
        listFilesForFolder(folderPath);

        final File folder = new File("/Users/xzhu54/work/global/lab/dragonite-gitops/app/internet/volvoid/account-api/overlays/cn.c3.qa");
        listFilesForFolder(folder);
    }

    public static void listFilesForFolder(String folderPath) throws IOException {
        try (Stream<Path> paths = Files.walk(Paths.get(folderPath))) {
            paths.filter(Files::isRegularFile).forEach(file -> {
                System.out.println(file.getFileName());
            });
        }
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }
}
