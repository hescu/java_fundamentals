package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/files/text_file_to_read.txt";
        String newFilePath = "src/labs_examples/input_output/files/labs/text_file_to_write.txt";

        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath), 5);
                FileOutputStream outputStream = new FileOutputStream(newFilePath)) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}