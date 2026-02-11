package dev.codecounty.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadContentsOfATextFile {

    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (path.exists() && path.isFile()) {
            try (Scanner scanner = new Scanner(path);) {

                while (scanner.hasNext()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }


        } else {
            System.out.println("File doesnt exist");
        }


    }
}
