Map Interface in Java
The Map interface is part of the java.util package and represents a collection of key-value pairs. Each key in a map is unique, and it maps to exactly one value.

Key Methods in Map
put(K key, V value): Adds a key-value pair to the map.

get(K key): Returns the value associated with the specified key.

remove(K key): Removes the key-value pair for the specified key.

containsKey(K key): Checks if the map contains the specified key.

containsValue(V value): Checks if the map contains the specified value.

size(): Returns the number of key-value pairs in the map.

isEmpty(): Checks if the map is empty.

Map Implementations
1. HashMap
   Unordered Map: Stores key-value pairs in a hash table.

Underlying Data Structure: Hash table.

Best Use Case: When you need a collection of key-value pairs with no specific order.

Key Features
Fast operations (O(1) for put, get, and remove).

Does not maintain insertion order.

Allows one null key and multiple null values.

Not thread-safe.


2. LinkedHashMap
   Ordered Map: Maintains insertion order or access order (if configured).

Underlying Data Structure: Hash table + Linked list.

Best Use Case: When you need a collection of key-value pairs with insertion order preserved.

Key Features
Maintains insertion order or access order.

Slightly slower than HashMap due to the linked list overhead.

Allows one null key and multiple null values.

Not thread-safe.

3. SortedMap
   Sorted Map: A map that maintains keys in sorted order.

Underlying Data Structure: Balanced tree (e.g., Red-Black Tree).

Best Use Case: When you need a collection of key-value pairs in sorted order.

Key Features
Keys are sorted in natural order or by a custom comparator.

Provides additional methods for range views (e.g., subMap, headMap, tailMap).

4. TreeMap
   Sorted and Navigable Map: Implements SortedMap and NavigableMap.

Underlying Data Structure: Red-Black Tree.

Best Use Case: When you need a collection of key-value pairs in sorted order with navigation capabilities.

Key Features
Keys are sorted in natural order or by a custom comparator.

Provides all methods of SortedMap and NavigableMap.

Does not allow null keys.

5. Hashtable
   Synchronized Map: Legacy implementation of the Map interface.

Underlying Data Structure: Hash table.

Best Use Case: When thread safety is required (rarely used in modern Java).

Key Features
Synchronized (thread-safe).

Slower than HashMap due to synchronization overhead.

Does not allow null keys or values.


Comparison of Map Implementations
Feature	HashMap	LinkedHashMap	TreeMap	Hashtable
Ordering	Unordered	Insertion order	Sorted order	Unordered
Underlying DS	Hash table	Hash table + Linked list	Red-Black Tree	Hash table
Null Keys/Values	Allowed	Allowed	No null keys	Not allowed
Thread Safety	Not thread-safe	Not thread-safe	Not thread-safe	Thread-safe
Performance	O(1) for put/get/remove	Slightly slower than HashMap	O(log n) for put/get/remove	Slower than HashMap
Use Case	General-purpose map	Preserve insertion order	Sorted map with navigation	Legacy thread-safe map
When to Use Which?
HashMap:

Use when you need a collection of key-value pairs with no specific order.

Example: General-purpose key-value storage.

LinkedHashMap:

Use when you need a collection of key-value pairs with insertion order preserved.

Example: Maintaining a cache of key-value pairs in insertion order.

TreeMap:

Use when you need a collection of key-value pairs in sorted order with navigation capabilities.

Example: Storing and retrieving key-value pairs in sorted order.

Hashtable:

Use when thread safety is required (rarely used in modern Java).

Example: Legacy applications.

Summary
Map: Collection of key-value pairs.

HashMap: Unordered, fast operations.

LinkedHashMap: Maintains insertion order.

SortedMap: Maintains sorted order.

TreeMap: Sorted and navigable map.

Hashtable: Legacy thread-safe map.