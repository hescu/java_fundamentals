package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize a new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

public class Exercise_02 {
    public static void main(String[] args) throws IsEmptyException {
        MyOwnCustomStack<String> myStack = new MyOwnCustomStack<>(String.class, 10);
        myStack.push("Batman");
        myStack.push("Rorschach");
        myStack.push("Deadpool");
        myStack.push("Wolverine");
        myStack.push("Jean Grey");
        myStack.push("Superman");
        myStack.push("Catwoman");
        myStack.push("Joker");
        myStack.push("Wonder Woman");
        myStack.push("Rogue");
        myStack.push("Bill Murray");

        myStack.printStack();
        System.out.println("Size: " + myStack.size());
        System.out.println("First element: " + myStack.peekFirst());
        System.out.println("Last element: " + myStack.peekLast());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        System.out.println("Size: " + myStack.size());
        System.out.println("First element: " + myStack.peekFirst());
        System.out.println("Last element: " + myStack.peekLast());
    }
}
