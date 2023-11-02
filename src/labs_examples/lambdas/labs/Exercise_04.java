package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demonstrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          then print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Exercise_04 {
    public static void main(String[] args) {
        // 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
        IntStream.range(1, 16).forEach(System.out::println);

        // 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
        int sum = IntStream.range(4, 65).sum();
        System.out.println(sum);

        int[] arr = new int[] {23, 34, 22, 4, 1, 6, 77, 56};
        // 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function to get the sum of the modified list
        int sum2 = Arrays.stream(arr)
                .map(x -> x * x)
                .sum();
        System.out.println(sum2);

        // 4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
        // *  function to average the remaining numbers, assign this result to an int variable.
        int average = (int) Arrays.stream(arr).filter(x -> x >= 10).average().orElse(0.0);
        System.out.println(average);

        // 5) Demonstrate the reduce() function to determine the sum of a list of Integers
        int result = Arrays.stream(arr).reduce(0, Integer::sum);
        System.out.println(result);

        // 6) Demonstrate how to Stream a text file and print out each line
        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        try {
            Stream<String> stringies = Files.lines(Paths.get(csvFile));
            stringies.forEach(System.out::println);
            stringies.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
        // *  then print out the element at the 1 index for each array.
        try (Stream<String> rows = Files.lines(Paths.get(csvFile));) {
            rows.map(x -> x.split(","))
                .map(y -> {
                    if (y.length > 1) {
                        return y[1];
                    } else {
                        return "";
                    }
                })
                .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        // 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
        // then print out the sum of all elements at index 2.
        try (Stream<String> rows = Files.lines(Paths.get(csvFile));) {
            double result2 = rows.map(x -> x.split(","))
                                .filter(a -> a.length > 2)
                                .mapToDouble(a -> Double.parseDouble(a[2]))
                                .sum();
            System.out.println("Sum of elements at index 2: " + result2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 9) Demonstrate the anyMatch() function.
        String[] anotherArr = new String[] {"Jambalaya", "Hallo", "Pause", "Sause"};
        boolean hasMatch = Arrays.stream(anotherArr).anyMatch(x -> x.contains("au"));
        System.out.println(hasMatch);

        // 10) Demonstrate the allMatch() function.
        boolean allMatch = Arrays.stream(anotherArr).allMatch(x -> x.contains("a"));
        System.out.println(allMatch);

        // 11) Demonstrate the collect() terminal operation to store resulting values into a List
        List<String> resultList = Arrays.stream(anotherArr).map(String::toLowerCase).collect(Collectors.toList());
        resultList.forEach(System.out::println);
    }
}
