package BasicTesting;

import java.io.*;

public class FileProcessor {
    public static void main(String[] args) {

    }

    public static void writeToFile(String filename, String content) throws IOException {
        // Using try-with-resources to ensure the writer is closed automatically
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            // Writing content to the file
            writer.write(content);
        }
    }

    public static String readFromFile(String filename) throws IOException{
        StringBuilder content = new StringBuilder();

        // Using try-with-resources to ensure the reader is closed automatically
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;

            // Read each line from the file and append it to the StringBuilder
            while((line = reader.readLine()) != null){
                content.append(line).append("\n");
            }
        }

        // Trim the trailing newline and return the final content
        return content.toString().trim();
    }
}
