package org.code.listInterface;

import java.util.LinkedList;

/**
 * LinkedList is a doubly-linked list implementation of the List interface.
 * It is part of the Java Collection Framework and implements the Deque interface.
 * It is a generic class that takes a type parameter.
 * It is similar to an array but provides dynamic resizing, fast insertion, and deletion.
 * It is not synchronized and is not thread-safe.
 * It allows duplicate elements and maintains the insertion order.
 * It is suitable for frequent insertions and deletions.
 * It is recommended to use when the number of elements is unknown.
 */

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Adding elements at the beginning and end
        list.addFirst("Apricot");
        list.addLast("Dragonfruit");

        // Accessing elements
        System.out.println("First element: " + list.getFirst()); // Apricot
        System.out.println("Last element: " + list.getLast());   // Dragonfruit

        // Removing elements
        list.removeFirst();
        list.removeLast();

        // Iterating through the list
        for (String fruit : list) {
            System.out.println(fruit); // Apple, Banana, Cherry
        }
    }
}
