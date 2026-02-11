package dev.codecounty.io;

import java.io.*;

public class DeSerialization {

    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FILE_ABSOLUTE_PATH);

        if (path.exists() && path.isFile()) {

            try (FileInputStream fis = new FileInputStream(path);
                 ObjectInputStream ois = new ObjectInputStream(fis);

            ) {
                Student st = (Student) ois.readObject();
                System.out.println(st);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } else {
            System.out.println("Invalid Path");
        }


    }
}

