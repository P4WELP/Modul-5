package FileInverter;
import java.io.*;

public class FileInverter {
    public boolean invertFile(String filepath) {
        try {
            // Wczytnie zawartości pliku
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            reader.close();

            // Dzielnie na słowa uwzględniając znaki interpunkcyjne na końcu słów
            String[] words = content.toString().split("\\b");

            // Odwrócenie kolejności słów
            StringBuilder invertedContent = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                invertedContent.append(words[i]);
            }

            // Zapisanie do nowego pliku
            BufferedWriter writer = new BufferedWriter(new FileWriter("inverted_" + filepath));
            writer.write(invertedContent.toString());
            writer.close();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
