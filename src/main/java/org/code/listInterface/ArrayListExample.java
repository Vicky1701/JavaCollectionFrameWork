package org.code.listInterface;

import java.util.ArrayList;

/**
 * ArrayList is a resizable array implementation of the List interface.
 * It is part of the Java Collection Framework and extends AbstractList.
 * It is a generic class that takes a type parameter.
 * It is similar to an array but provides dynamic resizing, fast retrieval, and insertion.
 * It is not synchronized and is not thread-safe.
 * It allows duplicate elements and maintains the insertion order.
 * It is not suitable for frequent insertions and deletions.
 * It is recommended to use when the number of elements is known.
 */

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // Updating elements
        list.set(1, "Blueberry");

        // Removing elements
        list.remove(2);

        // Iterating through the list
        for (String fruit : list) {
            System.out.println(fruit); // Apple, Blueberry
        }
    }
}