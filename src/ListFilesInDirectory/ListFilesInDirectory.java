package ListFilesInDirectory;

public class ListFilesInDirectory {

    public static void main(String[] args) {
        String directoryPath = "D:\\Documents\\Modul5";

        ListDirectory listDirectory = new ListDirectory();
        listDirectory.printDirectory(directoryPath);
    }
}
