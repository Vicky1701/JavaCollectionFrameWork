package org.code.setInterface;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * SortedSet is an interface that extends the Set interface.
 * It is part of the Java Collection Framework.
 * It is a generic interface that takes a type parameter.
 * It maintains the elements in sorted order.
 * It does not allow duplicate elements.
 * It provides methods to access the first and last elements.
 * It is suitable for maintaining the elements in sorted order.
 * It is recommended to use when the elements need to be sorted.
 */

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();

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

        // Using SortedSet methods
        System.out.println("First element: " + set.first()); // Apple
        System.out.println("Last element: " + set.last());   // Cherry
    }
}