package org.code.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Comparator interface is used to define a custom way of sorting objects.
 * The Comparator interface is used to define a custom ordering of objects.
 * The Comparator interface is used to define a custom way of comparing objects.
 * The Comparator interface is defined in the java.util package.
 * The Comparator interface has two methods: compare() and equals().
 * The compare() method is used to compare two objects.
 * The compare() method returns an integer value.
 * The compare() method returns a negative integer, zero, or a positive integer.
 * The compare() method returns a negative integer if the first object is less than the second object.
 * The compare() method returns zero if the first object is equal to the second object.
 * The compare() method returns a positive integer if the first object is greater than the second object.
 * The equals() method is used to compare the Comparator with another object.
 * The equals() method returns true if the Comparator is equal to the specified object.
 * The equals() method returns false if the Comparator is not equal to the specified object.
 * The Comparator interface is used by the Collections.sort() method.
 * The Collections.sort() method is used to sort a list of objects.
 * The Collections.sort() method sorts a list of objects using the Comparator.
 * The Comparator interface is used by the Arrays.sort() method.
 * The Arrays.sort() method is used to sort an array of objects.
 * The Arrays.sort() method sorts an array of objects using the Comparator.
 * The Comparator interface is used by the TreeMap and TreeSet classes.
 * The TreeMap class is used to store key-value pairs in a sorted order.
 * The TreeSet class is used to store a set of objects in a sorted order.
 * The Comparator interface is used by the EnumSet and EnumMap classes.
 * The EnumSet class is used to store a group of enum constants in a sorted order.
 * The EnumMap class is used to store key-value pairs with enum keys in a sorted order.
 * The Comparator interface is used by the Enum class.
 * The Enum class is used to define a group of constants.
 * The Comparator interface is used to define a custom way of sorting objects.
 * The Comparator interface is used to define a custom ordering of objects.
 * The Comparator interface is used to define a custom way of comparing objects.
 */


public class ComparatorLambdaExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20));
        students.add(new Student("Bob", 18));
        students.add(new Student("Charlie", 22));

        // Sorting using a lambda expression (by age)
        Collections.sort(students, (s1, s2) -> s1.getAge() - s2.getAge());

        for (Student student : students) {
            System.out.println(student);
        }
        // Output:
        // Bob (18)
        // Alice (20)
        // Charlie (22)
    }
}
