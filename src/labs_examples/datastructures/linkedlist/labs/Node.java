package labs_examples.datastructures.linkedlist.labs;

public class Node<Number> {
    Number data;
    Node next;
    Node prev;

    public Node(Number data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
