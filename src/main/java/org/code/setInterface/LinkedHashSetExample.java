package org.code.setInterface;

import java.util.LinkedHashSet;
/**
 * LinkedHashSet is an implementation of the Set interface.
 * It is part of the Java Collection Framework and extends HashSet.
 * It is a generic class that takes a type parameter.
 * It is similar to a HashSet but maintains the insertion order.
 * It is not synchronized and is not thread-safe.
 * It does not allow duplicate elements.
 * It is suitable for maintaining the order of elements.
 * It is recommended to use when the order of elements is important.
 */

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Adding a duplicate element (ignored)
        set.add("Apple");

        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit); // Apple, Banana, Cherry (insertion order)
        }
    }
}

