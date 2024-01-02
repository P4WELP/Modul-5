package AppFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderClass {
    public static void readFromFile(String fileName) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));
            System.out.println("File content " + fileName + ":");
            System.out.println(content);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
