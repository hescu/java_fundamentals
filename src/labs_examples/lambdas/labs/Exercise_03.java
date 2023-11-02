package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class FunWithNumbers {
    public static int square(int num) {
        return num * num;
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Exercise_03 {
    public static void main(String[] args) {
        Function<Integer, Integer> sqrFunction = FunWithNumbers::square;
        System.out.println(sqrFunction.apply(6));

        Person person = new Person("Hendrik");
        Supplier<String> getNameSupplier = person::getName;
        String name = getNameSupplier.get();
        System.out.println("Person's name: " + name);

        Function<String, Person> personConstructor = Person::new;
        Person person2 = personConstructor.apply("Nathalie");
        System.out.println("Created a person with name: " + person2.getName());
    }
}