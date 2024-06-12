package com.cloud.fall.mountains.notebook.compare;


import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadGithub3 {

    public static void main(String[] args) throws GitLabApiException, IOException {
        // Replace "https://gitlab.com" with your GitLab URL
        String gitlabUrl = "https://gitlab.oss.volvoc3.com/CONNCARCLOUD/volvoid-test-automation/-/blob/master/README.md";

        // Replace "YOUR_ACCESS_TOKEN" with your actual personal access token
        String accessToken = "3yeheVjqEiKgzymieoEN";

        GitLabApi gitLabApi = new GitLabApi(gitlabUrl, accessToken);

        // Project ID or path (can be group path or project path)
        Long projectId = 1234L; // Replace with actual project ID

        // Branch name or commit SHA
        String ref = "master";

        // File path within the repository
        String filePath = "path/to/your/file.txt";

        try {
            InputStream inputStream = gitLabApi.getRepositoryFileApi().getRawFile(projectId, ref, filePath);

            // Process the InputStream to read the content (e.g., convert to String)
            String fileContent = new Scanner(inputStream).useDelimiter("\\A").next();
            System.out.println(fileContent);

            inputStream.close();
        } catch (GitLabApiException e) {
            e.printStackTrace();
        }
    }

}
