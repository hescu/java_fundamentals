package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


class Exercise_02 {
    public static void main(String[] args) {
        int[] intArr = {5, 0, 33, 87, 1, 7};
        try {
            for (int i = 0; i <= intArr.length; i++) {
                System.out.println(intArr[i] / intArr[i+1]);
            }
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero! " + exc);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Array out of bounds. " + exc);
        }
    }
}