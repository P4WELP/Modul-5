package TextFileComparator;

import java.util.Scanner;

public class FileComparisonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        filePath1 = "D:\\Documents\\Modul5\\file1";
//        filePath2 = "D:\\Documents\\Modul5\\file2";

        System.out.println("Provide the path to the first file:");
        String filePath1 = scanner.nextLine();
        filePath1 = addTxtExtensionIfNeeded(filePath1);

        System.out.println("Provide the path to the second file:");
        String filePath2 = scanner.nextLine();
        filePath2 = addTxtExtensionIfNeeded(filePath2);

        scanner.close();

        TextFileComparator comparer = new TextFileComparator();
        if (comparer.areTextFilesEqual(filePath1, filePath2)) {
            System.out.println("The text files are the same.");
        } else {
            System.out.println("The text files are not the same.");
        }
    }
    private static String addTxtExtensionIfNeeded(String filePath) {
        if (!filePath.toLowerCase().endsWith(".txt")) {
            filePath += ".txt";
        }
        return filePath;
    }
}