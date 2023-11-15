package labs_examples.datastructures.linkedlist.labs;

import java.util.*;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */

public class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(213213);

        Collection<Integer> collectionOfNumbers = new ArrayList<>();
        collectionOfNumbers.add(42123);
        collectionOfNumbers.add(4645);
        collectionOfNumbers.add(8979841);
        collectionOfNumbers.add(21);
        numbers.addAll(1, collectionOfNumbers);

        numbers.addFirst(1);

        numbers.addLast(999);

        System.out.println("First: " + numbers.getFirst());
        System.out.println("Last: " + numbers.getLast());
        System.out.println("Index 4: " + numbers.get(4));

        numbers.set(0, 888);
        numbers.push(42);
        System.out.println("Pop: " + numbers.pop());
        System.out.println("Remove at index 3: " + numbers.remove(3));
        System.out.println("Does it contain 999? " + numbers.contains(999));

        ListIterator<Integer> listIterator = numbers.listIterator(1);
        System.out.println("ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        numbers.clear();
        System.out.println("Size after clear(): " + numbers.size());

    }
}