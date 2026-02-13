package dev.codecounty.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopier {


    public static void main(String... args) {

        String sourcePath = "C:\\Users\\suman\\Downloads\\code\\SpringFramework\\spring-data-jpa-advanced\\JavaRevisit\\src\\main\\resources\\collections_and_map.png";
        String destinationPath = "C:\\Users\\suman\\Downloads\\code\\SpringFramework\\spring-data-jpa-advanced\\JavaRevisit\\src\\main\\resources\\collections_copy.png";
        try (
                InputStream in = new FileInputStream(sourcePath);
                OutputStream out = new FileOutputStream(destinationPath);
        ) {
            byte[] buffer = new byte[1024];
            int read;
            while ((read = in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
            }
            System.out.println("Copied");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
