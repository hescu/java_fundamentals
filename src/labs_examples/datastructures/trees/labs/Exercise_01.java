package labs_examples.datastructures.trees.labs;

/**
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements
        3.) Retrieve elements
        4.) Update elements
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well-balanced

 **/

public class Exercise_01 {
    public static void main(String[] args) {
        CustomBinarySearchTree<Integer> bst = new CustomBinarySearchTree<>();

        bst.insert(87);
        bst.insert(51);
        bst.insert(32);
        bst.insert(23);
        bst.insert(44);
        bst.insert(75);
        bst.insert(66);


        bst.printInOrder();
        bst.printPreOrder();
        bst.printPostOrder();

        System.out.println("Contains 30: " + bst.contains(32));
        System.out.println("Contains 45: " + bst.contains(45));

        bst.update(32, 35);
        bst.printInOrder();

        bst.delete(44);
        bst.printInOrder();
    }
}