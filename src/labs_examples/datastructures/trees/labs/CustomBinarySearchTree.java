package labs_examples.datastructures.trees.labs;

public class CustomBinarySearchTree<T extends Comparable<T>> {

    Node root;
    int size;

    public CustomBinarySearchTree(T ... data) {
        if (data.length < 1) {
            root = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                insert(data[i]);
            }
        }
    }

    private class Node {
        Node leftChild;
        Node rightChild;
        T data;
        int height;


        Node (T data) {
            this.data = data;
            this.height = 1;
        }
    }

    public void insert(T data) {
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node node, T data) {
        if (node == null) {
            return new Node(data);
        }

        if (data.compareTo(node.data) < 0) {
            node.leftChild = insertRecursive(node.leftChild, data);
        } else if (data.compareTo(node.data) > 0) {
            node.rightChild = insertRecursive(node.rightChild, data);
        }
        return node;
    }

    public boolean contains(T data) {
        return containsRecursive(root, data);
    }

    private boolean containsRecursive(Node node, T data) {
        if (node == null) {
            return false;
        }

        int compareResult = data.compareTo(node.data);
        if (compareResult < 0) {
            return containsRecursive(node.leftChild, data);
        } else if (compareResult > 0) {
            return containsRecursive(node.rightChild, data);
        } else {
            return true;
        }
    }

    public void update(T oldData, T newData) {
        root = updateRecursive(root, oldData, newData);
    }

    private Node updateRecursive(Node node, T oldData, T newData) {
        if (node == null) {
            return null;
        }

        int compareResult = oldData.compareTo(node.data);
        if (compareResult < 0) {
            node.leftChild = updateRecursive(node.leftChild, oldData, newData);
        } else if (compareResult > 0) {
            node.rightChild = updateRecursive(node.rightChild, oldData, newData);
        } else {
            node.data = newData;
        }

        return node;
    }

    public void delete(T data) {
        root = deleteRecursive(root, data);
    }

    private Node deleteRecursive(Node node, T data) {
        if (node == null) {
            return null;
        }

        int compareResult = data.compareTo(node.data);
        if (compareResult < 0) {
            node.leftChild = deleteRecursive(node.leftChild, data);
        } else if (compareResult > 0) {
            node.rightChild = deleteRecursive(node.rightChild, data);
        } else {

            if (node.leftChild == null) {
                return node.rightChild;
            } else if (node.rightChild == null) {
                return node.leftChild;
            }

            node.data = findMin(node.rightChild).data;
            node.rightChild = deleteRecursive(node.rightChild, node.data);
        }

        return node;
    }

    private Node findMin(Node node) {
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public void printInOrder() {
        System.out.print("In-Order Traversal: ");
        printInOrderRecursive(root);
        System.out.println();
    }

    private void printInOrderRecursive(Node node) {
        if (node != null) {
            printInOrderRecursive(node.leftChild);
            System.out.print(node.data + " ");
            printInOrderRecursive(node.rightChild);
        }
    }

    public void printPreOrder() {
        System.out.print("Pre-Order Traversal: ");
        printPreOrderRecursive(root);
        System.out.println();
    }

    private void printPreOrderRecursive(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrderRecursive(node.leftChild);
            printPreOrderRecursive(node.rightChild);
        }
    }

    public void printPostOrder() {
        System.out.print("Post-Order Traversal: ");
        printPostOrderRecursive(root);
        System.out.println();
    }

    private void printPostOrderRecursive(Node node) {
        if (node != null) {
            printPostOrderRecursive(node.leftChild);
            printPostOrderRecursive(node.rightChild);
            System.out.print(node.data + " ");
        }
    }
}
