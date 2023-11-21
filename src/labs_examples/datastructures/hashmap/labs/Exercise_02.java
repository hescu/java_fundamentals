package labs_examples.datastructures.hashmap.labs;

/**
 *      HashMaps Exercise_02
 *
 *      Rewrite the CustomHashMap class to meet the following requirements:
 *      1) no method has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      2) no variable has the same name as any in CustomHashMap
 *          (do not use refactor - do it manually)
 *      3) resize the HashMap when the underlying array is more than half full
 *      4) triple the size of the underlying array on resize()
 *      5) instead of checking the number of keys to resize, check the number of values
 *      6) on collisions, add new elements to the front of the LinkedList, not the end
 *      7) anytime someone tries to get/update/remove an element that does not exist, print
 *          out a message indicating that the element does not exist
 *      8) add at least one more method that you think could be useful to the HashMap
 *          review Java's built-in HashMap for inspiration
 */

public class Exercise_02 {
    public static void main(String[] args) {
        MyCustomHashMap<Integer, String> myCustomHashMap = new MyCustomHashMap<>();
        myCustomHashMap.add(1, "Mgla");
        myCustomHashMap.add(2, "Bathory");
        myCustomHashMap.add(3, "Blackbraid");
        myCustomHashMap.add(4, "Darkthrone");
        myCustomHashMap.add(5, "Emperor");
        myCustomHashMap.add(6, "Burzum");

        myCustomHashMap.isEmpty();
        myCustomHashMap.printHashMap();
        System.out.println("Get value: " + myCustomHashMap.getValue(4));
        System.out.println("Update element: " + myCustomHashMap.updateElement(1, "Ulver"));

    }
}