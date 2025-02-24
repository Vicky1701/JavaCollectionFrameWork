package org.code.QueueInterface;

import java.util.ArrayDeque;

/**
 * ArrayDeque is a resizable-array implementation of the Deque interface.
 * Array deques have no capacity restrictions and they grow as necessary to support usage.
 * They are not thread-safe; in the absence of external synchronization, they do not support concurrent access by multiple threads.
 * Null elements are prohibited.
 * ArrayDeque is faster than Stack when used as a stack and faster than LinkedList when used as a queue.
 * ArrayDeque is a good choice if you want a deque with no capacity restrictions.
 * ArrayDeque is faster than LinkedList when used as a queue.
 * ArrayDeque is faster than Stack when used as a stack.
 */


public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10); // Add to front
        deque.addLast(20);  // Add to rear

        System.out.println("First element: " + deque.getFirst()); // 10
        System.out.println("Last element: " + deque.getLast());   // 20

        deque.removeFirst(); // Remove from front
        deque.removeLast();  // Remove from rear
    }
}