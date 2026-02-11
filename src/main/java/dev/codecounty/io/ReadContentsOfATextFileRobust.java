package dev.codecounty.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadContentsOfATextFileRobust {

    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (path.exists() && path.isFile()) {
            try (FileInputStream fis = new FileInputStream(path);) {

                int num;
                while ((num = fis.read()) != -1) {
                    System.out.print((char)num);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("File doesnt exist");
        }


    }
}
