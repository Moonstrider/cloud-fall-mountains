package com.cloud.fall.mountains.notebook.compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public class ReadGithub {
    public static void main(String... args) throws Exception {

        URL url;
        String username = "xzhu54";
        String password = "3yeheVjqEiKgzymieoEN";
        String file = "";
        try {
            url = new URL("https://gitlab.oss.volvoc3.com/CONNCARCLOUD/volvoid-test-automation/-/blob/master/README.md");
            URLConnection uc;
            uc = url.openConnection();

            uc.setRequestProperty("X-Requested-With", "Curl");
            List<String> list = new ArrayList<>();
            String userpass = username + ":" + password;
            String basicAuth = "Basic " + new String(Base64.getEncoder().encode(userpass.getBytes()));//needs Base64 encoder, apache.commons.codec
            uc.setRequestProperty("Authorization", basicAuth);

            BufferedReader reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line = null;
            while ((line = reader.readLine()) != null)
                file = file + line + "\n";
            System.out.println(file);

        } catch (IOException e) {
            System.out.println("Wrong username and password");
        }
    }
}
