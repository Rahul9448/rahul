import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        // Use try-with-resources to ensure proper closing of streams
        try (FileReader fr = new FileReader("C:\\aa1.txt");
             FileWriter fw = new FileWriter("C:\\bb1.txt")) {

            int i;
            // Read and write the file content character by character
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }

            System.out.println("File copied successfully");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
