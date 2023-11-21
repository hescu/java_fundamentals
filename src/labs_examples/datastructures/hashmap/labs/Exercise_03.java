package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 *      HashMaps Exercise_03
 *
 *      Create a new class that does the following:
 *
 *      1) create a LinkedList
 *      2) create a Stack
 *      3) create a Queue
 *      4) create a HashMap
 *
 *      Then, add millisecond timers before and after each data structure above and print out
 *      how long it takes for each to complete EACH the following tasks, and the total time for
 *      each data structure:
 *
 *      1) add 100 elements
 *      2) update 100 elements
 *      3) search for 100 elements
 *      4) delete 100 elements
 */

public class Exercise_03 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        LinkedList<Integer> linkedList = new LinkedList<>();
        measureTime("LinkedList creation", startTime);

        startTime = System.nanoTime();
        Stack<Integer> stack = new Stack<>();
        measureTime("Stack creation", startTime);

        startTime = System.nanoTime();
        Queue<Integer> queue = new PriorityQueue<>();
        measureTime("Queue creation", startTime);

        startTime = System.nanoTime();
        HashMap<String, Integer> hashMap = new HashMap<>();
        measureTime("HashMap creation", startTime);

        performTasks(linkedList, "LinkedList");
        performTasks(stack, "Stack");
        performTasks(queue, "Queue");
        performTasksonHashMap(hashMap, "HashMap");
    }

    private static void measureTime(String task, long startTime) {
        long endTime = System.nanoTime();
        System.out.println(task + " took " + (endTime - startTime) + " nanoseconds.");
    }

    private static void performTasks(Collection<Integer> collection, String collectionType) {
        long startTime = System.nanoTime();
        addElements(collection, 100);
        measureTime("Add elements to " + collectionType, startTime);

        startTime = System.nanoTime();
        updateElements(collection, 100);
        measureTime("Update elements in " + collectionType, startTime);

        startTime = System.nanoTime();
        searchElements(collection, 100);
        measureTime("Search elements in " + collectionType, startTime);

        startTime = System.nanoTime();
        deleteElements(collection, 100);
        measureTime("Delete elements from " + collectionType, startTime);
    }

    private static void performTasksonHashMap(Map<String, Integer> map, String mapType) {
        // Add 100 elements
        long startTime = System.currentTimeMillis();
        addElements(map, 100);
        measureTime("Add elements to " + mapType, startTime);

        // Update 100 elements
        startTime = System.currentTimeMillis();
        updateElements(map, 100);
        measureTime("Update elements in " + mapType, startTime);

        // Search for 100 elements
        startTime = System.currentTimeMillis();
        searchElements(map, 100);
        measureTime("Search elements in " + mapType, startTime);

        // Delete 100 elements
        startTime = System.currentTimeMillis();
        deleteElements(map, 100);
        measureTime("Delete elements from " + mapType, startTime);

        // Total time for all tasks on the map
        measureTime("Total time for all tasks on " + mapType, startTime);
    }

    private static void addElements(Collection<Integer> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.add(i);
        }
    }

    private static void updateElements(Collection<Integer> collection, int count) {
        for (int i = 0; i < count; i++) {
            if (collection instanceof List) {
                // For List implementations
                ((List<Integer>) collection).set(i, i + 1);
            } else if (collection instanceof Map) {
                // For Map implementations
                ((Map<Integer, Integer>) collection).put(i, i + 1);
            }
        }
    }

    private static void searchElements(Collection<Integer> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.contains(i);
        }
    }

    private static void deleteElements(Collection<Integer> collection, int count) {
        for (int i = 0; i < count; i++) {
            collection.remove(i);
        }
    }

    private static void addElements(Map<String, Integer> map, int count) {
        for (int i = 0; i < count; i++) {
            map.put("Key" + i, i);
        }
    }

    private static void updateElements(Map<String, Integer> map, int count) {
        for (int i = 0; i < count; i++) {
            map.put("Key" + i, i + 1);
        }
    }

    private static void searchElements(Map<String, Integer> map, int count) {
        for (int i = 0; i < count; i++) {
            map.containsKey("Key" + i);
        }
    }

    private static void deleteElements(Map<String, Integer> map, int count) {
        for (int i = 0; i < count; i++) {
            map.remove("Key" + i);
        }
    }
}