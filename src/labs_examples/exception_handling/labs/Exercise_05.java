package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            System.out.println(divideNumbers(6.8, 0));
        } catch (ArithmeticException exc) {
            System.out.println("Handle exception here! " + exc);
        }
    }

    public static double divideNumbers(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Can't divide by zero!");
        } else {
            return x / y;
        }
    }
}