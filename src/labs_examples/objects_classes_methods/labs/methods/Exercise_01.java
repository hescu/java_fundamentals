package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int result = multiply(66, 77);
        double result2 = divide(100, 6);
        long result3 = yearsToSeconds(6);
        int result4 = varargsLength("nope", "yes", "oki", "doki", "kleiner", "joki");

        System.out.println(result);
        System.out.println(result2);
        printJoke();
        System.out.println(result3);
        System.out.println(result4);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void printJoke() {
        System.out.println("What’s the best thing about Switzerland?\n" +
                "I don’t know, but the flag is a big plus.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long yearsToSeconds(int years) {
        return (long) years * 365 * 24 * 60 * 60;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varargsLength(String... varargs) {
        return varargs.length;
    }





}
