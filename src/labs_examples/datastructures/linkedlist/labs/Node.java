package labs_examples.datastructures.linkedlist.labs;

public class Node<Number> {
    Number data;
    Node next;

    public Node(Number data) {
        this.data = data;
        this.next = null;
    }

    public Node(Number data, Node next) {
        this.data = data;
        this.next = next;
    }
}
