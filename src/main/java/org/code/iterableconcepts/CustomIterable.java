package org.code.iterableconcepts;

import java.util.Iterator;

/**
 * Custom Iterable and Iterator
 * This example demonstrates how to create a custom iterable class in Java.
 * We define a CustomIterable class that implements the Iterable interface.
 * The CustomIterable class contains an inner class CustomIterator that implements the Iterator interface.
 * The CustomIterator class provides the implementation for the hasNext() and next() methods.
 * The CustomIterable class provides an iterator() method that returns an instance of the CustomIterator class.
 * We can use the enhanced for-loop to iterate over the elements of the CustomIterable class.
 */


public class CustomIterable implements Iterable<Integer> {
    private int[] data;

    // Constructor to initialize the data
    public CustomIterable(int[] data) {
        this.data = data;
    }

    // Implementing the iterator() method
    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    // Inner class implementing the Iterator interface
    private class CustomIterator implements Iterator<Integer> {
        private int index = 0;

        // Check if there are more elements
        @Override
        public boolean hasNext() {
            return index < data.length;
        }

        // Return the next element
        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return data[index++];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        CustomIterable iterable = new CustomIterable(numbers);

        // Using enhanced for-loop to iterate
        for (Integer number : iterable) {
            System.out.println(number);
        }
    }
}