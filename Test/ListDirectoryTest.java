import ListFilesInDirectory.ListDirectory;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListDirectoryTest {

    @Test
    public void testPrintDirectory() {
        // Ustawienie katalogu testowego
        String testDirectoryPath = "D:\\Documents\\Modul5\\Test\\ListDirectoryTest";
        File testDirectory = new File(testDirectoryPath);
        testDirectory.mkdirs();

        // Tworzenie kilku plików w katalogu testowym
        File file1 = new File(testDirectoryPath + File.separator + "file1.txt");
        File file2 = new File(testDirectoryPath + File.separator + "file2.txt");
        File file3 = new File(testDirectoryPath + File.separator + "file3.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Przechwytywanie wyjścia konsoli
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Wywołanie metody printDirectory() z katalogiem testowym
        ListDirectory.printDirectory(testDirectoryPath);

        // Oczekiwane wyniki - nazwy plików
        String expectedOutput = "file1.txt" + System.lineSeparator() +
                "file2.txt" + System.lineSeparator() +
                "file3.txt" + System.lineSeparator();

        // Porównanie oczekiwanego wyjścia z rzeczywistym
        assertEquals(expectedOutput, outputStreamCaptor.toString());

        // Usunięcie plików i katalogu testowego
        file1.delete();
        file2.delete();
        file3.delete();
        testDirectory.delete();
    }
}
