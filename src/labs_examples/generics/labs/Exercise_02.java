package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;
import java.util.Arrays;

class Exercise_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Demo myDemo = new Demo();
        System.out.println(myDemo.sumOfAllNumbers(arrayList));
    }
}

class Demo{
    public <N extends Number> double sumOfAllNumbers(ArrayList<N> arrList) {
        double sum = 0;
        for (N num : arrList) {
            sum += num.doubleValue();
        }
        return sum;
    }
}