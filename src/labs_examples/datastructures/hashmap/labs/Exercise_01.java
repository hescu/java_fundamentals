package labs_examples.datastructures.hashmap.labs;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Baldur's Gate 2");
        hashMap.put(2, "Dota 2");
        hashMap.put(3, "Skyrim");
        hashMap.put(4, "Age of Empires 2");
        hashMap.put(5, "Hearts of Iron IV");
        hashMap.put(6, "Diablo 2");

        System.out.println(hashMap.get(4));
        HashMap<Integer, String> newHashMap = new HashMap<>();
        newHashMap.putAll(hashMap);
        System.out.println(newHashMap.size());
        System.out.println("contains: " + newHashMap.containsValue("Diablo 2"));
        System.out.println("keySet: " + newHashMap.keySet());
        System.out.println("entrySet" + newHashMap.entrySet());
        System.out.println("putIfAbsent: " + hashMap.putIfAbsent(7, "Oblivion"));
        System.out.println("removed: " + hashMap.remove(1));
        System.out.println("replace: " + hashMap.replace(5, "Hearts of Iron IV", "Cities: Skyline"));
        hashMap.forEach((key, value) -> {
            value = value.toLowerCase();
            System.out.println(key + " = " + value + " ");
        });
        hashMap.clear();
        System.out.println(hashMap.isEmpty());
    }
}