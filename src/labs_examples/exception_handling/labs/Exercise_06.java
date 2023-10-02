package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class Exercise_06 {

    public static void main(String[] args) {
        try {
            System.out.println(divideNumbers(6.8, 2));
        } catch (ArithmeticException exc) {
            System.out.println("Handle exception here! " + exc);
        }
    }

    public static double divideNumbers(double x, double y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("Can't divide by zero!");
        } else {
            return x / y;
        }
    }
}