package org.code.mapInterface;

import java.util.Hashtable;

/**
 * Hashtable is an implementation of the Map interface.
 * It is part of the Java Collection Framework and extends Dictionary.
 * It is a generic class that takes two type parameters (key and value).
 * It stores key-value pairs and does not allow null keys or values.
 * It is synchronized and is thread-safe.
 * It does not maintain the insertion order of elements.
 * It is suitable for storing key-value pairs.
 * It is recommended to use when thread safety is required.
 */



public class HashtableExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Value for Banana: " + map.get("Banana")); // 20

        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key)); // Apple: 10, Banana: 20, Cherry: 30
        }
    }
}