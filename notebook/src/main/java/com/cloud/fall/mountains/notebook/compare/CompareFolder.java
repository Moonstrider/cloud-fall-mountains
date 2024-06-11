package com.cloud.fall.mountains.notebook.compare;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;

public class CompareFolder {
    public static void diff(Path one, Path other) throws IOException {
        Files.walkFileTree(one, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
                FileVisitResult result = super.visitFile(filePath, attrs);
                // get the relative file name from path "one"
                Path relativize = one.relativize(filePath);
                // construct the path for the counterpart file in "other"
                Path fileInOther = other.resolve(relativize);
                String dragon = filePath.toString();
                String[] splitFirst = dragon.split("dragonite-gitops");
                splitFirst[0] = splitFirst[0] + "dragonite-gitops                 ";
                dragon = splitFirst[0] + splitFirst[1];

                if (dragon.contains("overlays")) {
                    String[] splitSecond = dragon.split("cn.c3.qa");
                    splitSecond[0] = splitSecond[0] + "cn.c3.qa     ";
                    dragon = splitSecond[0] + splitSecond[1];
                }

                String global = fileInOther.toString();
                dragon = dragon.split("/Users/xzhu54/work/global/lab/")[1];
                global = global.split("/Users/xzhu54/work/global/lab/")[1];
                print(dragon, global);

                byte[] otherBytes = Files.readAllBytes(fileInOther);
                byte[] theseBytes = Files.readAllBytes(filePath);
                if (!Arrays.equals(otherBytes, theseBytes)) {
                    System.out.println("******************************diff******************************");
                    System.out.println(dragon + "\n" + global);
                    System.out.println("******************************diff******************************");
                }
                return result;
            }
        });
    }

    public static void print(String dragon, String global) {
//        System.out.println("start comparing: \n" + dragon + " \n" + global);
    }
}
