package org.code.mapInterface;

import java.util.TreeMap;

/**
 * TreeMap is an implementation of the Map interface.
 * It is part of the Java Collection Framework and extends AbstractMap.
 * It is a generic class that takes two type parameters (key and value).
 * It stores key-value pairs and does not allow duplicate keys.
 * It maintains the natural ordering of keys.
 * It is not synchronized and is not thread-safe.
 * It is suitable for storing key-value pairs in sorted order.
 * It is recommended to use when the keys need to be sorted.
 */

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Value for Banana: " + map.get("Banana")); // 20

        // Using TreeMap methods
        System.out.println("First key: " + map.firstKey()); // Apple
        System.out.println("Last key: " + map.lastKey());   // Cherry
    }
}