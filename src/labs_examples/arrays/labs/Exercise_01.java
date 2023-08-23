package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int avg;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Please enter a number: ");
            arr[i] = scanner.nextInt();
        }

        for (int x : arr) {
            sum += x;
        }
        avg = sum / 10;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}