package labs_examples.input_output.labs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_02 {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/files/message.txt";
        String newFilePath = "src/labs_examples/input_output/labs/files/encrypted_message.txt";

        try (BufferedReader inputReader = new BufferedReader(new FileReader(filePath));
                FileWriter outputWriter = new FileWriter(newFilePath)) {
            int i;
            while ((i = inputReader.read()) != -1) {
                if ((char) i == 'a') {
                    outputWriter.write('x');
                } else {
                    outputWriter.write(i+1);
                }
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}