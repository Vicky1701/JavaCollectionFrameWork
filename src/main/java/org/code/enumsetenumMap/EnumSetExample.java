package org.code.enumsetenumMap;

import java.util.EnumSet;

/**
 * EnumSet is a specialized Set implementation for use with enum types.
 * It is a high-performance Set implementation, much faster than HashSet.
 * EnumSet uses a bit vector internally to represent enum values.
 * EnumSet is not synchronized.
 * EnumSet is not thread-safe.
 * EnumSet is a member of the Java Collections Framework.
 * EnumSet is used to represent a group of enum constants.
 * EnumSet is an abstract class.
 * EnumSet is a part of the java.util package.
 * EnumSet is a final class.
 * EnumSet extends AbstractSet class.
 * EnumSet
 */

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        // Adding elements
        weekdays.add(Day.SATURDAY);

        // Removing elements
        weekdays.remove(Day.SATURDAY);

        // Checking if an element exists
        System.out.println("Contains Monday: " + weekdays.contains(Day.MONDAY)); // true

        // Iterating through the EnumSet
        for (Day day : weekdays) {
            System.out.println(day); // MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }
    }
}
