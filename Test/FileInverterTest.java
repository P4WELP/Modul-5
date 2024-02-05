package FileInverter;

import java.io.*;

public class FileInverterTest {
    public static void main(String[] args) {
        String testFilepath = "test_file.txt";

        String originalContent = "This is a test file. It contains some text.";

        FileInverter fileInverter = new FileInverter();

        // Zapisanie treści pliku testowego
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(testFilepath));
            writer.write(originalContent);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occurred while creating the test file.");
            return;
        }

        // Testowanie odwracania zawartości pliku
        if (fileInverter.invertFile(testFilepath)) {
            System.out.println("File contents have been successfully reversed.");

            // Wczytanie odwróconej zawartości pliku
            try {
                BufferedReader reader = new BufferedReader(new FileReader("inverted_" + testFilepath));
                String invertedContent = reader.readLine();
                reader.close();

                // Wyświetlenie odwróconej zawartości pliku
                System.out.println("Inverted Content:");
                System.out.println(invertedContent);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("An error occurred while reading the inverted file.");
            }
        } else {
            System.out.println("An error occurred while reversing the contents of the file.");
        }
    }
}
