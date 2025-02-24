Set Interface in Java
The Set interface is part of the java.util package and represents a collection of unique elements (no duplicates). It does not maintain any order of elements unless explicitly implemented (e.g., TreeSet).

Key Methods in Set
add(E e): Adds an element to the set if it is not already present.

remove(Object o): Removes the specified element from the set.

contains(Object o): Checks if the set contains the specified element.

size(): Returns the number of elements in the set.

isEmpty(): Checks if the set is empty.

Set Implementations
1. HashSet
   Unordered Set: Stores elements in a hash table.

Underlying Data Structure: Hash table.

Best Use Case: When you need a collection of unique elements with no specific order.

Key Features
Fast operations (O(1) for add, remove, and contains).

Does not maintain insertion order.

Allows one null element.


2. LinkedHashSet
   Ordered Set: Maintains insertion order.

Underlying Data Structure: Hash table + Linked list.

Best Use Case: When you need a collection of unique elements with insertion order preserved.

Key Features
Maintains insertion order.

Slightly slower than HashSet due to the linked list overhead.

Allows one null element.


3. SortedSet
   Sorted Set: A set that maintains elements in sorted order.

Underlying Data Structure: Balanced tree (e.g., Red-Black Tree).

Best Use Case: When you need a collection of unique elements in sorted order.

Key Features
Elements are sorted in natural order or by a custom comparator.

Provides additional methods for range views (e.g., subSet, headSet, tailSet).


4. NavigableSet
   Extended SortedSet: Provides additional navigation methods.

Underlying Data Structure: Balanced tree (e.g., Red-Black Tree).

Best Use Case: When you need a sorted set with navigation capabilities.

Key Features
Extends SortedSet with methods like lower, floor, ceiling, and higher.

Allows efficient retrieval of elements relative to a given element.


5. TreeSet
   Sorted and Navigable Set: Implements SortedSet and NavigableSet.

Underlying Data Structure: Red-Black Tree.

Best Use Case: When you need a collection of unique elements in sorted order with navigation capabilities.

Key Features
Elements are sorted in natural order or by a custom comparator.

Provides all methods of SortedSet and NavigableSet.

Does not allow null elements.


Comparison of Set Implementations
Feature	HashSet	LinkedHashSet	TreeSet
Ordering	Unordered	Insertion order	Sorted order
Underlying DS	Hash table	Hash table + Linked list	Red-Black Tree
Null Elements	Allowed (one null)	Allowed (one null)	Not allowed
Performance	O(1) for add/remove/contains	Slightly slower than HashSet	O(log n) for add/remove/contains
Use Case	General-purpose set	Preserve insertion order	Sorted set with navigation
When to Use Which?
HashSet:

Use when you need a collection of unique elements with no specific order.

Example: Removing duplicates from a list.

LinkedHashSet:

Use when you need a collection of unique elements with insertion order preserved.

Example: Maintaining a cache of unique elements in insertion order.

TreeSet:

Use when you need a collection of unique elements in sorted order with navigation capabilities.

Example: Storing and retrieving elements in sorted order.

Summary
Set: Collection of unique elements.

HashSet: Unordered, fast operations.

LinkedHashSet: Maintains insertion order.

SortedSet: Maintains sorted order.

NavigableSet: Extends SortedSet with navigation methods.

TreeSet: Sorted and navigable set.