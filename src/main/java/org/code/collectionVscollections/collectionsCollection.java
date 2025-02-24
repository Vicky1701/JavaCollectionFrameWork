package org.code.collectionVscollections;

import java.util.*;

public class collectionsCollection {
    public static void main(String[] args) {
        // Collection is an interface (parent of List, Set, Queue, etc.)

        Collection<String> myCollection = new ArrayList<>(); // Using ArrayList (a List implementation)

        myCollection.add("Apple");
        myCollection.add("Banana");
        myCollection.add("Cherry");

        System.out.println("Collection elements: " + myCollection);

        // Collections is a utility class that provides methods for working with collections
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        System.out.println("Before sorting: " + numbers);

        // Sorting the list using Collections utility class
        Collections.sort(numbers);

        System.out.println("After sorting: " + numbers);

        // Finding the minimum and maximum values
        System.out.println("Minimum value: " + Collections.min(numbers));
        System.out.println("Maximum value: " + Collections.max(numbers));
    }
    }
}
