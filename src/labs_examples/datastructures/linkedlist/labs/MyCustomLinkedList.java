package labs_examples.datastructures.linkedlist.labs;

public class MyCustomLinkedList<Number> {
    private Node<Number> head;
    private Node<Number> tail;

    public MyCustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addToFront(Number data) {
        Node<Number> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToEnd(Number data) {
        Node<Number> newNode = new Node<>(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void remove(Number value) {
        if (isEmpty()) {
            return;
        }

        if (head.data.equals(value)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node<Number> current = head;
        while (current.next != null && !current.next.data.equals(value)) {
            current = current.next;
        }

        // If found, remove the element
        if (current.next != null) {
            current.next = current.next.next;
            if (current.next == null) {
                tail = current; // Update tail if the last element is removed
            }
        }
    }

    public void removeFromFront() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void removeFromEnd() {
        if (isEmpty()) {
            return;
        }
        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        assert previous != null;
        previous.next = null;
    }

    // Get element with a specific value
    public Node<Number> get(Number value) {
        Node<Number> current = head;
        while (current != null) {
            if (current.data.equals(value)) {
                return current;
            }
            current = current.next;
        }
        return null; // Element not found
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node<Number> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
