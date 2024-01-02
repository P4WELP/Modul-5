package FileInverter;

public class FileInverterMain {
    public static void main(String[] args) {
        String filepath = "file6.txt";

        FileInverter fileInverter = new FileInverter();

        if (fileInverter.invertFile(filepath)) {
            System.out.println("The file contents have been reversed.");
        } else {
            System.out.println("An error occurred while reversing the contents of the file.");
        }
    }
}

