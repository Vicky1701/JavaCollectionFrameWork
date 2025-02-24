List Interface in Java
The List interface is part of the java.util package and represents an ordered collection of elements. It allows duplicate elements and provides positional access to elements (via indices).

Key Methods in List
add(E e): Adds an element to the end of the list.

add(int index, E e): Inserts an element at the specified index.

get(int index): Returns the element at the specified index.

remove(int index): Removes the element at the specified index.

set(int index, E e): Replaces the element at the specified index.

size(): Returns the number of elements in the list.

List Implementations
1. ArrayList
   Dynamic Array: Resizable array implementation of the List interface.

Underlying Data Structure: Array.

Best Use Case: When frequent access to elements by index is required.

Key Features
Fast random access (O(1)).

Slow insertions/removals in the middle (O(n)).

Not thread-safe.

Example
java
Copy
import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1)); // Banana

        // Updating elements
        list.set(1, "Blueberry");

        // Removing elements
        list.remove(2);

        // Iterating through the list
        for (String fruit : list) {
            System.out.println(fruit); // Apple, Blueberry
        }
    }
}
2. Vector
   Synchronized Dynamic Array: Similar to ArrayList but thread-safe.

Underlying Data Structure: Array.

Best Use Case: When thread safety is required.

Key Features
Synchronized (thread-safe).

Slower than ArrayList due to synchronization overhead.

Legacy class (mostly replaced by ArrayList).

Example
java
Copy
import java.util.Vector;

public class VectorExample {
public static void main(String[] args) {
Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1)); // Banana

        // Iterating through the vector
        for (String fruit : vector) {
            System.out.println(fruit); // Apple, Banana, Cherry
        }
    }
}
3. Stack
   LIFO Data Structure: Extends Vector to implement a last-in-first-out stack.

Underlying Data Structure: Array.

Best Use Case: When LIFO behavior is required (e.g., undo operations, recursion).

Key Features
Inherits all methods from Vector.

Provides additional stack-specific methods:

push(E e): Adds an element to the top of the stack.

pop(): Removes and returns the top element.

peek(): Returns the top element without removing it.

Example
java
Copy
import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
Stack<String> stack = new Stack<>();

        // Pushing elements
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Peeking at the top element
        System.out.println("Top element: " + stack.peek()); // Cherry

        // Popping elements
        System.out.println("Popped element: " + stack.pop()); // Cherry

        // Iterating through the stack
        while (!stack.isEmpty()) {
            System.out.println(stack.pop()); // Banana, Apple
        }
    }
}
4. LinkedList
   Doubly-Linked List: Implements both List and Deque interfaces.

Underlying Data Structure: Doubly-linked list.

Best Use Case: When frequent insertions/removals are required.

Key Features
Fast insertions/removals (O(1)) at both ends.

Slow random access (O(n)).

Can be used as a list, queue, or deque.

Example
java
Copy
import java.util.LinkedList;

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
Comparison of List Implementations
Feature	ArrayList	Vector	Stack	LinkedList
Underlying DS	Array	Array	Array	Doubly-linked list
Thread Safety	Not thread-safe	Thread-safe	Thread-safe	Not thread-safe
Random Access	O(1)	O(1)	O(1)	O(n)
Insertions/Removals	O(n)	O(n)	O(n)	O(1)
Use Case	Frequent access	Thread-safe list	LIFO operations	Frequent modifications
When to Use Which?
ArrayList:

Use when frequent access to elements by index is required.

Example: Storing and accessing data in a list.

Vector:

Use when thread safety is required (rarely used in modern Java).

Example: Legacy applications.

Stack:

Use when LIFO behavior is required.

Example: Undo operations, recursion.

LinkedList:

Use when frequent insertions/removals are required.

Example: Implementing queues or deques.

Summary
List: Ordered collection with duplicate elements.

ArrayList: Fast random access, not thread-safe.

Vector: Thread-safe version of ArrayList.

Stack: LIFO data structure.

LinkedList: Fast insertions/removals, can be used as a list, queue, or deque.