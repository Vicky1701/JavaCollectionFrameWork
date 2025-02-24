package org.code.iterableconcepts;
/**
 * 1. Iterable Interface
 * The Iterable interface is the root interface for all collections in Java.
 * It provides a way to iterate over the elements of a collection using the iterator() method.
 *
 */
import java.util.Iterator;

public class MyIterable<T> implements Iterable<T> {
    private T[] elements;

    // Constructor to initialize the array
    public MyIterable(T[] elements) {
        this.elements = elements;
    }

    // Implementing the iterator() method from the Iterable interface
    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    // Inner class implementing the Iterator interface
    private class MyIterator implements Iterator<T> {
        private int index = 0;

        // Check if there are more elements to iterate over
        @Override
        public boolean hasNext() {
            return index < elements.length;
        }

        // Return the next element in the iteration
        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            return elements[index++];
        }

        // Optional: Remove the current element (not implemented here)
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove operation is not supported.");
        }
    }

    public static void main(String[] args) {
        String[] data = {"Java", "Python", "C++"};
        MyIterable<String> myIterable = new MyIterable<>(data);

        // Using enhanced for-loop (for-each) which relies on Iterable
        for (String language : myIterable) {
            System.out.println(language);
        }
    }
}
