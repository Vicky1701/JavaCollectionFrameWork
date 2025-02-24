package org.code.setInterface;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * NavigableSet is an interface that extends the SortedSet interface.
 * It is part of the Java Collection Framework.
 * It is a generic interface that takes a type parameter.
 * It provides methods to navigate the elements in a set.
 * It is suitable for navigating the elements in a sorted set.
 * It is recommended to use when the elements need to be navigated.
 */

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);

        // Using NavigableSet methods
        System.out.println("Lower than 20: " + set.lower(20)); // 10
        System.out.println("Floor of 25: " + set.floor(25));   // 20
        System.out.println("Ceiling of 25: " + set.ceiling(25)); // 30
        System.out.println("Higher than 20: " + set.higher(20)); // 30
    }
}