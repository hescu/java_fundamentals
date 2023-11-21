package labs_examples.datastructures.hashmap.labs;

import java.util.LinkedList;
import java.util.Map;

public class MyCustomHashMap<K, V> {

    private Entry<K, V>[] hashMap = new Entry[10];

    private int getHash(K key) {
        int index = Math.abs(key.hashCode() % hashMap.length);
        return index;
    }

    public void add(K key, V value) {
        int index = getHash(key);
        Entry<K, V> entry = new Entry<>(key, value);

        if (hashMap[index] == null) {
            hashMap[index] = entry;
        } else {
            entry.next = hashMap[index];
            hashMap[index] = entry;
        }
        if (getValuesInHashMap().size() > hashMap.length * .5) {
            resizeArray();
        }
    }

    private void resizeArray() {
        Entry<K, V>[] oldHashMap = hashMap;
        hashMap = new Entry[oldHashMap.length * 3];

        for (int i = 0; i < oldHashMap.length; i++) {
            try {
                Entry<K, V> entry = oldHashMap[i];
                add(entry.getKey(), entry.getValue());

                while (entry.next != null) {
                    entry = entry.next;
                    add(entry.getKey(), entry.getValue());
                }
            } catch (Exception ignored) {}
        }
        System.out.println("Array resized. New size: " + hashMap.length);
    }

    public void remove(K key) {
        if (getValue(key) == null) {
            System.out.println("The element does not exist.");
            return;
        }
        int index = getHash(key);
        Entry<K, V> entry = hashMap[index];

        if (entry.getKey().equals(key)) {
            hashMap[index] = null;
        }

        while (entry.next != null) {
            if (entry.next.getKey() != key) {
                entry = entry.next;
            }
        }

        if (entry.next.next != null) {
            entry.next = entry.next.next;
        } else {
            entry.next = null;
        }
    }

    public V getValue(K key) {
        int index = getHash(key);

        if (hashMap[index] == null) {
            System.out.println("The element does not exist.");
            return null;
        }

        Entry<K, V> entry = hashMap[index];

        while (entry.getKey() != key) {
            if (entry.next == null) {
                System.out.println("The element does not exist.");
                return null;
            }
            entry = entry.next;
        }
        return entry.getValue();
    }

    public boolean updateElement(K key, V value) {
        if (getValue(key) == null) {
            System.out.println("The element does not exist.");
            return false;
        }
        int index = getHash(key);
        Entry<K, V> entry = hashMap[index];

        if (entry.getKey().equals(key)) {
            hashMap[index].setValue(value);
            return true;
        }

        while (entry.next.getKey() != key) {
            entry = entry.next;
        }
        entry.next.setValue(value);
        return true;
    }

    public int getArraySize() {
        return hashMap.length;
    }

    public boolean isEmpty() {
        return getValuesInHashMap().isEmpty();
    }

    public LinkedList<K> getKeysInHashMap() {
        LinkedList<K> keysInHashMap = new LinkedList<>();

        for (Entry<K, V> kvEntry : hashMap) {
            if (kvEntry != null) {
                Entry<K, V> e = kvEntry;

                while (e != null) {
                    keysInHashMap.add(e.getKey());
                    e = e.next;
                }
            }
        }
        return keysInHashMap;
    }

    public LinkedList<V> getValuesInHashMap() {
        LinkedList<V> valuesInHashMap = new LinkedList<>();

        for (Entry<K, V> kvEntry : hashMap) {
            if (kvEntry != null) {
                Entry<K, V> e = kvEntry;

                while (e != null) {
                    valuesInHashMap.add(e.getValue());
                    e = e.next;
                }
            }
        }
        return valuesInHashMap;
    }

    public void printHashMap() {
        for (Entry<K, V> entry : hashMap) {
            while (entry != null) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                entry = entry.next;
            }
        }
    }

}

 class Entry<K, V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry<K, V> next = null;

    Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
