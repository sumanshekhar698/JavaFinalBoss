package dev.codecounty.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteATextFileRobust {

    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        String msg = """
                Be Ready for tests on Friday
                This is gonna be Fun 🙌
                """;

        if (path.exists() && path.isFile()) {
            try (FileOutputStream fos = new FileOutputStream(path);) {
                fos.write(msg.getBytes());


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("File doesnt exist");
        }


    }
}
