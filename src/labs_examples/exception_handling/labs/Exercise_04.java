package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class Exercise_04 {
    public static void main(String[] args) {
        int[] intArr = {5, 0, 33, 87, 1, 7};
        try {
            try {
                for (int i = 0; i <= intArr.length; i++) {
                    System.out.println(intArr[i] / intArr[i+1]);
                }
                System.out.println(intArr[10]);
            } catch (ArithmeticException exc) {
                System.out.println(exc);
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
    }
}