package org.code.setInterface;

import java.util.HashSet;

/**
 * HashSet is an implementation of the Set interface.
 * It is part of the Java Collection Framework and extends AbstractSet.
 * It is a generic class that takes a type parameter.
 * It is similar to a HashMap but only stores keys (no values).
 * It is not synchronized and is not thread-safe.
 * It does not allow duplicate elements and does not maintain the insertion order.
 * It is suitable for checking the presence of an element.
 * It is recommended to use when the order of elements is not important.
 */


public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Adding a duplicate element (ignored)
        set.add("Apple");

        // Checking if an element exists
        System.out.println("Contains Banana: " + set.contains("Banana")); // true

        // Removing an element
        set.remove("Cherry");

        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit); // Apple, Banana (order not guaranteed)
        }
    }
}
