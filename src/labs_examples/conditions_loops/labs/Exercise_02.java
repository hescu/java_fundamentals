package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number to print the respective Weekday: ");
        // assign input to variable as int
        int number = scanner.nextInt();

        if (number > 0 && number <= 7) {
            if (number == 1) {
                System.out.println("Monday");
            }
            if (number == 2) {
                System.out.println("Tuesday");
            }
            if (number == 3) {
                System.out.println("Wednesday");
            }
            if (number == 4) {
                System.out.println("Thursday");
            }
            if (number == 5) {
                System.out.println("Friday");
            }
            if (number == 6) {
                System.out.println("Saturday");
            }
            if (number == 7) {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("Other");
        }
    }
}
