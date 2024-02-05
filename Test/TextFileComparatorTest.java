package TextFileComparator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextFileComparatorTest {

    @Test
    public void testAreTextFilesEqual_SameFiles() {
        TextFileComparator comparator = new TextFileComparator();
        boolean result = comparator.areTextFilesEqual("file1.txt", "file1.txt");
        assertTrue(result, "Expected the same files to be equal.");
    }

    @Test
    public void testAreTextFilesEqual_DifferentFiles() {
        TextFileComparator comparator = new TextFileComparator();
        boolean result = comparator.areTextFilesEqual("file1.txt", "file2.txt");
        assertFalse(result, "Expected different files to not be equal.");
    }

    @Test
    public void testAreTextFilesEqual_OneEmptyFile() {
        TextFileComparator comparator = new TextFileComparator();
        boolean result = comparator.areTextFilesEqual("emptyFile.txt", "file1.txt");
        assertFalse(result, "Expected an empty file to not be equal to a non-empty file.");
    }

    @Test
    public void testAreTextFilesEqual_BothEmptyFiles() {
        TextFileComparator comparator = new TextFileComparator();
        boolean result = comparator.areTextFilesEqual("emptyFile.txt", "emptyFile.txt");
        assertTrue(result, "Expected two empty files to be equal.");
    }
}
