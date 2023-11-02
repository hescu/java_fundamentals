package labs_examples.lambdas.labs;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 */

@FunctionalInterface
interface MyInterface {
    void doSomething();
}

@FunctionalInterface
interface OneParamInterface {
    double calculate(double x);
}

@FunctionalInterface
interface TwoParaInterface {
    String doStringThings(String s1, String s2);
}

class Exercise_01 {
    public static <IntConsumer> void main(String[] args) {
        // 1 & 2
        MyInterface action = () -> System.out.println("Doing something!");
        action.doSomething();
        MyInterface anon = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Doing something anonymously");
            }
        };
        anon.doSomething();

        // 3 & 4
        OneParamInterface square = (x) -> x * x;
        System.out.println(square.calculate(354.75));
        OneParamInterface anonSquare = new OneParamInterface() {
            @Override
            public double calculate(double x) {
                return x * x;
            }
        };
        System.out.println(anonSquare.calculate(444.44));

        // 5 & 6
        TwoParaInterface concat = (s1, s2) -> s1.concat(s2);
        System.out.println(concat.doStringThings("Jambalaya", "is yummy!"));
        TwoParaInterface concat2 = new TwoParaInterface() {
            @Override
            public String doStringThings(String s1, String s2) {
                return s1.concat(s2);
            }
        };
        System.out.println(concat2.doStringThings("ABCD", "EFGH"));

        BiPredicate<String, String> isPartOf = String::contains;
        System.out.println(isPartOf.test("Jambalaya", "mba"));
        Consumer<Integer> myAge = (i) -> System.out.println("My age: " + i);
        myAge.accept(36);
    }
}