package labs_examples.generics.labs;

import java.util.*;

import static java.lang.Double.sum;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise_03 {
    public static void main(String[] args) {
        System.out.println("1) " + Generika.sumNumbers(44f, 77.5));

        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("java");
        stringList.add("programming");
        stringList.add("example");
        stringList.add("computer");
        // Add 4 palindromes
        stringList.add("level");
        stringList.add("deified");
        stringList.add("racecar");
        stringList.add("madam");

        System.out.println("2) How many palindromes are in my collection? " + Generika.countPalindromes(stringList));

        String[] stringArray = {"Batman", "Rorschach", "Deadpool", "Wonder Woman", "Jinx", "Bill Murray", "Krach-Bumm-Ente"};
        System.out.println("3) " + Arrays.toString(Generika.switchElements(stringArray, 2, 5)));

        System.out.println("4) " + Generika.findLargestElement(stringList));
    }
}

class Generika {

    public static <N extends Number, M extends Number> double sumNumbers(N x, M y) {
        return sum(x.doubleValue(), y.doubleValue());
    }

    public static <T extends Collection<String>> int countPalindromes(T coll) {
        int count = 0;
        for (String str : coll) {
           if (isPalindrome(str)) count++;
        }
        return count;
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static <T> T[] switchElements(T[] arr, int i, int j) {
        T val;
        val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
        return arr;
    }

    public static <T extends Comparable<T>> Optional<T> findLargestElement(List<T> list) {
        return list.stream().max(Comparator.naturalOrder());
    }
}