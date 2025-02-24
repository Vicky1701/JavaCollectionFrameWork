Comparable Interface
The Comparable interface is used to define the natural ordering of objects. It is implemented by the class whose objects need to be sorted.

Key Features of Comparable
Single Sorting Sequence: Defines one natural ordering for the class.

Method: Requires implementing the compareTo method.

Usage: Used by sorting methods like Collections.sort or Arrays.sort.

Comparator Interface
The Comparator interface is used to define custom ordering for objects. It is implemented by a separate class or as an anonymous class.

Key Features of Comparator
Multiple Sorting Sequences: Allows defining multiple ways to sort objects.

Method: Requires implementing the compare method.

Usage: Passed as an argument to sorting methods like Collections.sort or Arrays.sort.

Comparison of Comparable and Comparator
Feature	Comparable	Comparator
Purpose	Defines natural ordering	Defines custom ordering
Method	compareTo	compare
Sorting Sequence	Single	Multiple
Class Modification	Requires modifying the class	Does not require modifying the class
Usage	Collections.sort(list)	Collections.sort(list, comparator)
Lambda Support	No	Yes (Java 8+)
When to Use Which?
Comparable:

Use when the class has a natural ordering.

Example: Sorting students by age.

Comparator:

Use when you need multiple ways to sort objects.

Example: Sorting students by name, age, or grade.

Summary
Comparable: Defines natural ordering for a class.

Comparator: Defines custom ordering for objects.

Lambda Expressions: Simplify the creation of comparators in Java 8+.