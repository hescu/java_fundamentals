package labs_examples.datastructures.linkedlist.labs;

public class MyCustomDoublyLinkedList {
    private Node<Number> head;
    private Node<Number> tail;

    public MyCustomDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add a node to the end of the list
    public void append(Number data) {
        Node<Number> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
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
            if (head != null) {
                head.prev = null;
            }
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
            current.next.prev = current;
            if (current.next == null) {
                tail = current; // Update tail if the last element is removed
            }
        }
    }

    public void removeByIndex(int index) {
        if (isEmpty() || index < 0) {
            return;
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }

        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            // Index out of bounds
            return;
        }

        // Adjust the next and prev pointers to remove the node
        current.prev.next = current.next;
        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            // Removing the last node
            tail = current.prev;
        }
    }

    public void displayForward() {
        Node<Number> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward() {
        Node<Number> current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
