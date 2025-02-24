package org.code.mapInterface;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SortedMap is an interface that extends the Map interface.
 * It is part of the Java Collection Framework.
 * It is a generic interface that takes two type parameters (key and value).
 * It stores key-value pairs and does not allow duplicate keys.
 * It maintains the natural ordering of keys.
 * It is not synchronized and is not thread-safe.
 * It is suitable for storing key-value pairs in sorted order.
 * It is recommended to use when the keys need to be sorted.
 */

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Value for Banana: " + map.get("Banana")); // 20

        // Using SortedMap methods
        System.out.println("First key: " + map.firstKey()); // Apple
        System.out.println("Last key: " + map.lastKey());   // Cherry
    }
}