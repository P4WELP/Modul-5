package AppFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterClass {
    public static boolean writeUserInputToFile(String fileName) {
        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter the text to save to the file:");
            String userInput = scanner.nextLine();
            writer.write(userInput);
            System.out.println("The file has been successfully saved.");
            return true;
        } catch (IOException e) {
            System.err.println("Error saving the file: " + e.getMessage());
            return false;
        }
    }
}
