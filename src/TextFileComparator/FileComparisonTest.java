package TextFileComparator;

public class FileComparisonTest {

    public static void main(String[] args) {

        String filePath1 = "plik1.txt";
        String filePath2 = "plik2.txt";

        TextFileComparator comparer = new TextFileComparator();
        if (comparer.areTextFilesEqual(filePath1, filePath2)) {
            System.out.println("The text files are the same.");
        } else {
            System.out.println("The text files are not the same.");
        }
    }
}