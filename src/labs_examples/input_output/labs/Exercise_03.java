package labs_examples.input_output.labs;
import java.io.FileInputStream;
import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class BufferedByteArrayInputStream {
    public static void main(String[] args) {
        byte[] array = {11, 22, 33, 44, 55, 127};

        try (BufferedInputStream input = new BufferedInputStream(new ByteArrayInputStream(array), 3)) {
            System.out.print("Bytes read: \n");

            for (int i = 0; i < array.length; i++) {
                int data = input.read();
                System.out.println(data);
            }
        } catch (IOException exc) {
            exc.getStackTrace();
        }
    }
}

class FileInputStreamExample {
    public static void main(String[] args) {

        String filePath = "src/labs_examples/input_output/labs/files/text_file_to_read.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                System.out.println((char) byteRead);
            }
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}

class StringReaderExample {
    public static void main(String[] args) {

        String file = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.";

        try (BufferedReader str = new BufferedReader(new StringReader(file), 5)) {
            String line;
            while((line = str.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException exc) {
            exc.getStackTrace();
        }
    }
}

class FileWriterExample {
    public static void main(String[] args) {

        String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua.";
        String filePath = "src/labs_examples/input_output/labs/files/text_file_to_write.txt";

        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(text);
        } catch (IOException exc) {
            exc.getStackTrace();
        }
    }
}

class DataIOStreamExample {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/files/text_file_to_read.txt";
        String newFilePath = "src/labs_examples/input_output/labs/files/text_file_to_write.txt";

        try (DataInputStream input = new DataInputStream(new FileInputStream(filePath));
             DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(newFilePath))) {
            int i;
            while ((i = input.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException exc) {
            exc.getStackTrace();
        }
    }
}