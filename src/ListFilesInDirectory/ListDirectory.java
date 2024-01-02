package ListFilesInDirectory;

import java.io.File;

public class ListDirectory {
    public static void printDirectory(String directoryPath) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The folder is empty");
            }
        } else {
            System.out.println("The path provided does not lead to an existing folder.");
        }
    }
}
