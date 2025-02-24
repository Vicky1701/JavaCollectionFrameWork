package org.code.mapInterface;

import java.util.HashMap;

/**
 * HashMap is an implementation of the Map interface.
 * It is part of the Java Collection Framework and extends AbstractMap.
 * It is a generic class that takes two type parameters (key and value).
 * It stores key-value pairs and does not allow duplicate keys.
 * It is not synchronized and is not thread-safe.
 * It does not maintain the insertion order of elements.
 * It is suitable for storing key-value pairs.
 * It is recommended to use when the order of elements is not important.
 */



public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        // Accessing values
        System.out.println("Value for Banana: " + map.get("Banana")); // 20

        // Removing a key-value pair
        map.remove("Cherry");

        // Iterating through the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key)); // Apple: 10, Banana: 20
        }
    }
}
