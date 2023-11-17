package labs_examples.datastructures.stack.labs;

import java.lang.reflect.Array;

public class MyOwnCustomStack<V> {
    private static final double LOAD_FACTOR_BIGGER = 0.75;
    private static final double LOAD_FACTOR_SMALLER = 0.25;
    private V[] array;
    private int size;

    public MyOwnCustomStack(Class<V> clazz, int capacity) {
        this.array = (V[]) Array.newInstance(clazz, capacity);
        this.size = 0;
    }

    public void push(V item) {
        if (size == array.length) {
            System.out.println("Array is full. Cannot push the item.");
            return;
        }

        if (size + 1 > LOAD_FACTOR_BIGGER * array.length) {
            makeArrayBigger();
        }

        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        array[0] = item;
        size++;
    }

    public V pop() throws IsEmptyException {
        if (size == 0) {
            throw new IsEmptyException("Stack is empty! Cannot pop.");
        }

        V poppedItem = array[0];

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

    public V peekLast() {
        return array[0];
    }

    public V peekFirst() {
        return array[size - 1];
    }

    private void makeArrayBigger() {
        int newCapacity = array.length * 2;
        V[] newArray = (V[]) Array.newInstance(array.getClass().getComponentType(), newCapacity);
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        System.out.println("New array size: " + array.length);
    }

    private void makeArraySmaller() {
        int newCapacity = Math.max(1, array.length / 2);
        V[] newArray = (V[]) Array.newInstance(array.getClass().getComponentType(), newCapacity);
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        System.out.println("New array size: " + array.length);
    }

    public int size() {
        return size;
    }

    public void printStack() {
        if(size == 0) {
            System.out.println("Stack is empty.");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

}
