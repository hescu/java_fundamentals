package labs_examples.input_output.labs;

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

class Exercise_03 {
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

class DataStream {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new (System.in))) {
            String sentence = input.readLine();
        } catch (IOException exc) {
            exc.getStackTrace();
        }
    }
}