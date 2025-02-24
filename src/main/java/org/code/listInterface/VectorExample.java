package org.code.listInterface;

import java.util.Vector;

/**
 * Vector is a resizable array implementation of the List interface.
 * It is part of the Java Collection Framework and extends AbstractList.
 * It is a generic class that takes a type parameter.
 * It is similar to an array but provides dynamic resizing, fast retrieval, and insertion.
 * It is synchronized and is thread-safe.
 * It allows duplicate elements and maintains the insertion order.
 * It is suitable for frequent insertions and deletions.
 * It is recommended to use when the number of elements is unknown.
 */

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1)); // Banana

        // Iterating through the vector
        for (String fruit : vector) {
            System.out.println(fruit); // Apple, Banana, Cherry
        }
    }
}