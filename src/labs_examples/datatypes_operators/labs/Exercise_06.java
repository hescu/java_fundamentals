package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14;
        double height = 5.0;
        double volume = 3.14159 * (radius * radius) * height;
        double surface = (2 * 3.14159) * ((radius * height) + (radius * radius));

        System.out.println("Volume ≈ " + volume);
        System.out.println("Surface ≈ " + surface);
    }
}