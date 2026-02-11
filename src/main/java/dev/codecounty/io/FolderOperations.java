package dev.codecounty.io;

import java.io.File;
import java.util.Arrays;

public class FolderOperations {

    public static void main(String... args) {

        File path = new File(FilePaths.SAMPLE_FOLDER_ABSOLUTE_PATH);

        if (path.exists() && path.isDirectory()) {
            System.out.println("File exists");
            System.out.println("Folder ?" + path.isDirectory());
            System.out.println("File ? " + path.isFile());
            System.out.println(Arrays.toString(path.list()));
        }



    }
}
