package labs_examples.datastructures.queue.labs;

import labs_examples.datastructures.stack.labs.IsEmptyException;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyCustomQueue<Integer> myQueue = new MyCustomQueue<>(Integer.class, 8);

        myQueue.add(88);
        myQueue.add(789);
        myQueue.add(22);
        myQueue.add(17);
        myQueue.add(19);
        myQueue.add(55555);
        myQueue.add(18545);
        myQueue.add(741);

        System.out.println("Peek first: " + myQueue.peekFirst());
        System.out.println("Peek last: " + myQueue.peekLast());
        System.out.println("Queue size: " + myQueue.size());
        myQueue.printQueue();

        try {
            System.out.println("Popped element: " + myQueue.pop());
            System.out.println("Popped element: " + myQueue.pop());
            System.out.println("Popped element: " + myQueue.pop());
            System.out.println("Popped element: " + myQueue.pop());
            System.out.println("Popped element: " + myQueue.pop());
            System.out.println("Popped element: " + myQueue.pop());
        } catch (IsEmptyException e) {
            throw new RuntimeException(e);
        }
    }
}