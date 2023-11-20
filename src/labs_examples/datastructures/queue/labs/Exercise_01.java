package labs_examples.datastructures.queue.labs;

import java.util.LinkedList;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Bill Murray");
        queue.offer("Woody Harrelson");
        queue.offer("Tilda Swinton");
        queue.offer("James McAvoy");

        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        String polledElement = queue.poll();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Queue after poll(): " + queue);

        String element = queue.element();
        System.out.println("Element at the head: " + element);

        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Queue after remove(): " + queue);

        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}