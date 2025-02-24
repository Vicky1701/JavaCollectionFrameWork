package org.code.QueueInterface;

import java.util.ArrayDeque;

/**
 * Deque is a linear collection that supports element insertion and removal at both ends.
 * The name deque is short for "double ended queue" and is usually pronounced "deck".
 * Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.
 * Deques can be used both as FIFO (First In First Out) and LIFO (Last In First Out).
 * Deques support element insertion and removal at both ends.
 * Deques can be used as a stack (Last In First Out) and as a queue (First In First Out).
 * Deques are faster than Stack when used as a stack and faster than LinkedList when used as a queue.
 * Deques are not thread-safe; in the absence of external synchronization, they do not support concurrent access by multiple threads.
 * Deques do not accept null elements.
 * Deques are likely to be faster than Stack when used as a stack and faster than LinkedList when used as a queue.
 */

public class Deque {
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
