package org.code.QueueInterface;

import java.util.PriorityQueue;

/**
 * PriorityQueue is an unbounded queue based on a priority heap and the elements are ordered based on their natural ordering or by a Comparator provided at queue construction time.
 * A priority queue does not permit null elements.
 * A priority queue relying on natural ordering also does not permit insertion of non-comparable objects.
 * The head of this queue is the least element with respect to the specified ordering.
 * If multiple elements are tied for least value, the head is one of those elements — ties are broken arbitrarily.
 * The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
 * It provides O(log(n)) time for the enqueuing and dequeuing methods (offer, poll, remove() and add);
 * linear time for the remove(Object) and contains(Object) methods; and constant time for the retrieval methods (peek, element, and size).
 */

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("Head of the queue: " + pq.peek()); // 5
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // 5, 10, 20
        }
    }
}
