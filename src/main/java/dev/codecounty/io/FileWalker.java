package dev.codecounty.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWalker {

    static void main() throws IOException {
        try (var stream = Files.walk(Paths.get("C:/projects"), 3)) { // Walk 3 levels deep
            stream.filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".txt"))
                    .forEach(System.out::println);
        }
    }
}
