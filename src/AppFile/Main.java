package AppFile;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the file to save:");
        String fileName = scanner.nextLine();

        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }

        boolean writeSuccess = FileWriterClass.writeUserInputToFile(fileName);

        if (writeSuccess) {
            FileReaderClass.readFromFile(fileName);
        }
    }
}