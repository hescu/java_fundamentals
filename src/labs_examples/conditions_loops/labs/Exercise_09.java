package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

        int num = 0;
        int breakNum = 66;

        while (num < 100) {
            System.out.println(num);
            if (num == breakNum) {
                System.out.println("Take a break");
                break;
            }
            num++;
        }
    }
}
