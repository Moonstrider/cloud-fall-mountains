package com.cloud.fall.mountains.notebook.compare;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class ReadGithub2 {

    public static void main(String[] args) {
        getTextFromGithub("https://gitlab.oss.volvoc3.com/CONNCARCLOUD/volvoid-test-automation/-/blob/master/README.md");
    }


    public static String getTextFromGithub(String link) {
        URL Url = null;
        try {
            Url = new URL(link);
        } catch (MalformedURLException e1) {
            e1.printStackTrace();
        }
        HttpURLConnection Http = null;
        try {
            Http = (HttpURLConnection) Url.openConnection();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        Map<String, List<String>> Header = Http.getHeaderFields();

        for (String header : Header.get(null)) {
            if (header.contains(" 302 ") || header.contains(" 301 ")) {
                link = Header.get("Location").get(0);
                try {
                    Url = new URL(link);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                try {
                    Http = (HttpURLConnection) Url.openConnection();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Header = Http.getHeaderFields();
            }
        }
        InputStream Stream = null;
        try {
            Stream = Http.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String Response = null;
        try {
            Response = GetStringFromStream(Stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Response;
    }

    private static String GetStringFromStream(InputStream Stream) throws IOException {
        if (Stream != null) {
            Writer Writer = new StringWriter();

            char[] Buffer = new char[2048];
            try (Stream) {
                BufferedReader br = new BufferedReader(new InputStreamReader(Stream, StandardCharsets.UTF_8));
//                int counter;
//                while ((counter = br.read(Buffer)) != -1) {
//                    Writer.write(Buffer, 0, counter);
//                }
                String line;
                while ((line = br.readLine()) != null) {
                    // process the line.
                    System.out.println(line);
                }
            }
            return Writer.toString();
        } else {
            return "No Contents";
        }
    }
}
