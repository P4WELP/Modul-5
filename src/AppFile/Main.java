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

        // Zapisz tekst do pliku
        boolean writeSuccess = FileWriterClass.writeUserInputToFile(fileName);

        // Jeśli zapis się powiódł odczytuje i wyświetla zawartość pliku
        if (writeSuccess) {
            FileReaderClass.readFromFile(fileName);
        }
    }
}