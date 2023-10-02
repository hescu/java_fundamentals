package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
        }
    }
}