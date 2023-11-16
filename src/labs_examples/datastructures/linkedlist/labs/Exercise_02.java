package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index.
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyCustomLinkedList<Number> customList = new MyCustomLinkedList<>();

        customList.addToEnd(1);
        customList.addToEnd(2.6);
        customList.addToEnd(33333);
        customList.addToFront(0.123);
        customList.addToFront(-1);

        System.out.print("Original List: ");
        customList.display();

        customList.remove(2.6);
        customList.remove(-1);

        System.out.print("List after removal: ");
        customList.display();

        Node<Number> node = customList.get(0.123);
        if (node != null) {
            System.out.println("Found node with value 0.123");
        } else {
            System.out.println("Node with value 0.123 not found");
        }

        customList.removeFromEnd();
        customList.display();
        customList.removeFromFront();
        customList.display();
    }
}