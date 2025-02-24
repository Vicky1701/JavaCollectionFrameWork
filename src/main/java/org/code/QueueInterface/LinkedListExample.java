package org.code.QueueInterface;

import java.util.LinkedList;

/**
 * LinkedList is a doubly-linked list implementation of the List and Deque interfaces.
 * Implements all optional list operations, and permits all elements (including null).
 * All of the operations perform as could be expected for a doubly-linked list.
 * Operations that index into the list will traverse the list from the beginning or the end, whichever is closer to the specified index.
 * LinkedList has O(1) time complexity for add, remove, get and contains operations.
 * LinkedList has O(n) time complexity for search operations.
 * LinkedList has O(n) time complexity for adding elements to the middle of the list.
 */

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10); // Add to front
        list.addLast(20);  // Add to rear

        System.out.println("First element: " + list.getFirst()); // 10
        System.out.println("Last element: " + list.getLast());   // 20

        list.removeFirst(); // Remove from front
        list.removeLast();  // Remove from rear
    }
}