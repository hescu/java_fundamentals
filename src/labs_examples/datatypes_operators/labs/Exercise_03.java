package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int num1 = 44;
        int num2 = 33;

        int result = num1 + num2;
        System.out.println("addition: " + num1 + " + " + num2 + " = " + result);

        result = num1 - num2;
        System.out.println("subtraction: " + num1 + " - " + num2 + " = " + result);

        result = num1 * num2;
        System.out.println("multiplication: " + num1 + " * " + num2 + " = " + result);

        result = num1 / num2;
        System.out.println("division: " + num1 + " / " + num2 + " = " + result);

        result = num1 % num2;
        System.out.println("modulus: " + num1 + " % " + num2 + " = " + result);
    }

}
