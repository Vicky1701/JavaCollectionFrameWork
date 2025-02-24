package org.code.iterableconcepts;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/*
 * 2. Iterator Interface
    The Iterator interface provides methods to traverse a collection:

        hasNext(): Checks if there are more elements.

        next(): Returns the next element.

        remove(): Removes the current element (optional).
 *
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Get an iterator for the list
        Iterator<String> iterator = fruits.iterator();

        // Traverse the list using the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            // Optional: Remove an element during iteration
            if (fruit.equals("Banana")) {
                iterator.remove(); // Removes "Banana" from the list
            }
        }

        System.out.println("List after removal: " + fruits);
    }
}