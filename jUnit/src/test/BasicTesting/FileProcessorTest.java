package BasicTesting;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {
    // Filename to be used for testing
    String filName = "testfile.txt";

    @Test
    void writeToFile() throws IOException {
        // Write content to the file
        String content =  "Hello, this is a test file!";

        FileProcessor.writeToFile(filName, content);
        // Read content from the file and check if it matches the written content
        assertEquals(content, FileProcessor.readFromFile(filName));
    }

    @Test
    void readFromFile() throws IOException{
        String content = "Testing file reading.";

        // Write content to the file
        FileProcessor.writeToFile(filName, content);

        // Verify that the content read from the file matches the expected content
        assertEquals(content, FileProcessor.readFromFile(content));
    }

    // Test case to check if an IOException is thrown when trying to read a non-existent file.
    @Test
    void readFromNonExistentFile(){
        assertThrows(IOException.class, ()-> FileProcessor.readFromFile("non-existent.txt"),   "Should " +
                "throw IOException when trying to read a non-existent file");
    }
}