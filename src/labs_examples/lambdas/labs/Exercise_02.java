package labs_examples.lambdas.labs;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
class Exercise_02 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));

        Function<String, Integer> strLength = String::length;
        System.out.println(strLength.apply("Jambalaya"));

        Consumer<String> str = x -> System.out.println(x.toLowerCase());
        str.accept("SSADDSASDsaas");

        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());

        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(5));

        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(23, 4));

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(44, 66));

        BiConsumer<String, Integer> printPair = (key, value) -> System.out.println(key + ": " + value);
        printPair.accept("Age", 30);

        IntPredicate isPositive = n -> n > 0;
        System.out.println(isPositive.test(7));

        ToDoubleFunction<String> strToDouble = Double::parseDouble;
        double result = strToDouble.applyAsDouble("3.14");
        System.out.println(result);
    }
}