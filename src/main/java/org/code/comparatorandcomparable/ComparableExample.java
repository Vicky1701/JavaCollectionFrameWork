package org.code.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * The Comparable interface is used to define the natural ordering of objects.
 * The natural ordering of objects is the default way of sorting objects.
 * The natural ordering of objects is the way objects are sorted in their natural order.
 * The natural ordering of objects is defined by the compareTo() method.
 * The compareTo() method is defined in the Comparable interface.
 * The compareTo() method returns an integer value.
 * The compareTo() method returns a negative integer, zero, or a positive integer.
 * The compareTo() method returns a negative integer if the current object is less than the specified object.
 * The compareTo() method returns zero if the current object is equal to the specified object.
 * The compareTo() method returns a positive integer if the current object is greater than the specified object.
 * The natural ordering of objects is used by the Collections.sort() method.
 * The Collections.sort() method is used to sort a list of objects.
 * The Collections.sort() method sorts a list of objects in their natural order.
 * The natural ordering of objects is used by the Arrays.sort() method.
 * The Arrays.sort() method is used to sort an array of objects.
 * The Arrays.sort() method sorts an array of objects in their natural order.
 * The natural ordering of objects is used by the TreeMap and TreeSet classes.
 * The TreeMap class is used to store key-value pairs in a sorted order.
 * The TreeSet class is used to store a set of objects in a sorted order.
 * The natural ordering of objects is used by the EnumSet and EnumMap classes.
 * The EnumSet class is used to store a group of enum constants in a sorted order.
 * The EnumMap class is used to store key-value pairs with enum keys in a sorted order.
 * The natural ordering of objects is used by the Enum class.
 * The Enum class is used to define a group of constants.
 * The natural ordering of objects is used by the Comparable interface.
 * The Comparable interface is used to define the natural ordering of objects.
 * The natural ordering of objects is the default way of sorting objects.
 * The natural ordering of objects is the way objects are sorted in their natural order.
 * The natural ordering of objects is defined by the compareTo() method.
 * The compareTo() method is defined in the Comparable interface.
 * The compareTo() method returns an integer value.
 * The compareTo() method returns a negative integer, zero, or a positive integer.
 * The compareTo() method returns a negative integer if the current object is less than the specified object.
 * The compareTo() method returns zero if the current object is equal to the specified object.
 *  The compareTo() method returns a positive integer if the current object is greater than the specified object.
 */

public class ComparableExample {
    public static void main(String[] args) {
        List<StudentComapator> studentComapators = new ArrayList<>();
        studentComapators.add(new StudentComapator("Alice", 20));
        studentComapators.add(new StudentComapator("Bob", 18));
        studentComapators.add(new StudentComapator("Charlie", 22));

        // Sorting using natural ordering (by age)
        Collections.sort(studentComapators);

        for (StudentComapator studentComapator : studentComapators) {
            System.out.println(studentComapator);
        }
        // Output:
        // Bob (18)
        // Alice (20)
        // Charlie (22)
    }
}
