package AppFile;

public class FileWriterReaderTest {
    public static void main(String[] args) {
        System.out.println("Test 1: Writing to File");
        boolean writeSuccess = FileWriterClass.writeUserInputToFile("testFile.txt");
        if (writeSuccess) {
            System.out.println("Write to file test passed.");
        } else {
            System.out.println("Write to file test failed.");
        }

        System.out.println("Test 2: Reading from File");
        String content = FileReaderClass.readFromFile("testFile.txt");
        if (!content.isEmpty()) {
            System.out.println("Read from file test passed.");
        } else {
            System.out.println("Read from file test failed.");
        }

        System.out.println("End of test.");
    }
}

