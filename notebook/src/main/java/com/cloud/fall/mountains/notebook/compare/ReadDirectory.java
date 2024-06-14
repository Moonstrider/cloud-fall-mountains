package com.cloud.fall.mountains.notebook.compare;

import java.io.File;
import java.util.Arrays;

public class ReadDirectory {
    public static void main(String[] args) {

        read("/Users/xzhu54/work/global/lab/identity-access-management-gitops/app");
    }

    public static void read(String dirPath) {
        File file = new File(dirPath);
        String[] directories = file.list(
                (current, name) -> new File(current, name).isDirectory()
        );
        System.out.println(Arrays.toString(directories));
        assert directories != null;
        for (String directory : directories) {
            file = new File(dirPath + "/" + directory);
            String[] subDirArr = file.list(
                    (current, name) -> new File(current, name).isDirectory()
            );
            System.out.println(Arrays.toString(subDirArr));
        }
    }
}
