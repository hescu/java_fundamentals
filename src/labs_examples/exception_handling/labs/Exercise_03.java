package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class Exercise_03 {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
        } finally {
            System.out.println("I will print no matter what happens above");
        }
    }
}