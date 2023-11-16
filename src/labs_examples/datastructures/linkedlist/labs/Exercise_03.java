package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */

public class Exercise_03 {
    public static void main(String[] args) {
        MyCustomDoublyLinkedList myNumbers = new MyCustomDoublyLinkedList();
        myNumbers.append(44.4);
        myNumbers.append(91273.4);
        myNumbers.append(134.9);
        myNumbers.append(666);
        myNumbers.append(8);

        System.out.println("Original List:");
        myNumbers.displayForward();

        myNumbers.removeByIndex(2);
        System.out.println("List after removing from the end:");
        myNumbers.displayBackward();
    }
}