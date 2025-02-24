package org.code.mapInterface;

import java.util.LinkedHashMap;

/**
 * LinkedHashMap is an implementation of the Map interface.
 * It is part of the Java Collection Framework and extends HashMap.
 * It is a generic class that takes two type parameters (key and value).
 * It stores key-value pairs and does not allow duplicate keys.
 * It maintains the insertion order of elements.
 * It is not synchronized and is not thread-safe.
 * It is suitable for maintaining the order of elements.
 * It is recommended to use when the order of elements is important.
 */



public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

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