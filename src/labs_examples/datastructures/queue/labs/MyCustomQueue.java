package labs_examples.datastructures.queue.labs;

import java.lang.reflect.Array;
import labs_examples.datastructures.stack.labs.IsEmptyException;

public class MyCustomQueue<T> {
    private T[] array;
    private int size;

    private static final double LOAD_FACTOR_BIGGER = 0.75;
    private static final double LOAD_FACTOR_SMALLER = 0.25;

    public MyCustomQueue(Class<T> type, int capacity) {
        this.array = (T[]) Array.newInstance(type, capacity);
        this.size = 0;
    }

    public void add(T item) {
        if (size == array.length) {
            System.out.println("Array is full. Cannot push the item.");
            return;
        }

        if (size + 1 > LOAD_FACTOR_BIGGER * array.length) {
            makeArrayBigger();
        }

        array[size] = item;
        size++;
    }

    public T pop() throws IsEmptyException {
        if (size == 0) {
            throw new IsEmptyException("Stack is empty! Cannot pop.");
        }

        T poppedItem = array[0];

        if (size == 1) {
            array[0] = null;
            size--;
            return poppedItem;
        }

        for (int i = 1; i < size - 1; i++) {
            array[i - 1] = array[i];
        }
        array[size - 1] = null;
        size--;

        if (size < LOAD_FACTOR_SMALLER * array.length) {
            makeArraySmaller();
        }

        return poppedItem;
    }
    public T peekFirst() {
        return array[0];
    }
    public T peekLast() {
        return array[size - 1];
    }

    private void makeArrayBigger() {
        int newCapacity = array.length * 2;
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), newCapacity);
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        System.out.println("New array size: " + array.length);
    }

    private void makeArraySmaller() {
        int newCapacity = Math.max(1, array.length / 2);
        T[] newArray = (T[]) Array.newInstance(array.getClass().getComponentType(), newCapacity);
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        System.out.println("New array size: " + array.length);
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if(size == 0) {
            System.out.println("Queue is empty.");
        }
        System.out.print("Printing queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}
