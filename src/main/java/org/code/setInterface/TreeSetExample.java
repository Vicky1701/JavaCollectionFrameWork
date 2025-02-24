package org.code.setInterface;

import java.util.TreeSet;

/**
 * TreeSet is an implementation of the SortedSet interface.
 * It is part of the Java Collection Framework and extends AbstractSet.
 * It is a generic class that takes a type parameter.
 * It maintains the elements in sorted order.
 * It does not allow duplicate elements.
 * It provides methods to access the first and last elements.
 * It is suitable for maintaining the elements in sorted order.
 * It is recommended to use when the elements need to be sorted.
 */

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Adding a duplicate element (ignored)
        set.add("Apple");

        // Iterating through the set
        for (String fruit : set) {
            System.out.println(fruit); // Apple, Banana, Cherry (sorted order)
        }

        // Using TreeSet methods
        System.out.println("First element: " + set.first()); // Apple
        System.out.println("Last element: " + set.last());   // Cherry
    }
}