package com.cloud.fall.mountains.notebook.compare.gen.html;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.FileUtils;

public class GenHtml {

    public static void main(String[] args) throws IOException {
        String classpath = System.getProperty("user.dir");
        File htmlTemplateFile = new File(classpath
            + "/src/main/java/com/cloud/fall/mountains/notebook/compare/gen/html/table.html");
        FileUtils.writeStringToFile(htmlTemplateFile, htmlString, StandardCharsets.UTF_8);
    }

    private static final String htmlString = "123";

}
