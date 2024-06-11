package com.cloud.fall.mountains.notebook.compare;

import java.io.IOException;

public class GitClone {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Replace with the actual repository URL you want to clone
        String repositoryURL = "https://gitlab.oss.volvoc3.com/CONNCARCLOUD/dragonite-gitops.git";

        // Replace with the desired local directory to clone into
        String localDirectory = "/Users/xzhu54/work/global/dragonite-gitops/";

        // Create the command to execute
        String command = "git clone " + repositoryURL + " " + localDirectory;

        // Execute the command using Runtime
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        // Handle the process output and errors (if any)
        int exitCode = process.waitFor();
        if (exitCode == 0) {
            System.out.println("Repository cloned successfully!");
        } else {
            System.err.println("Failed to clone repository. Exit code: " + exitCode);
        }
    }
}
