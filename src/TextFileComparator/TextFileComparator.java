package TextFileComparator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileComparator {
    public boolean areTextFilesEqual(String filePath1, String filePath2) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
             BufferedReader reader2 = new BufferedReader(new FileReader(filePath2))) {

            String line1;
            String line2;

            while ((line1 = reader1.readLine()) != null && (line2 = reader2.readLine()) != null) {
                // Porównanie linii z obu plików
                if (!line1.equals(line2)) {
                    return false;
                }
            }

            // Sprawdzenie czy oba pliki mają taką samą ilość linii
            return reader1.readLine() == null && reader2.readLine() == null;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}