package org.code.enumsetenumMap;

import java.util.EnumMap;

/**
 * EnumMap is a specialized Map implementation for use with enum types.
 * It is a high-performance Map implementation, much faster than HashMap.
 * EnumMap uses an array internally to represent key-value pairs.
 * EnumMap is not synchronized.
 * EnumMap is not thread-safe.
 * EnumMap is a member of the Java Collections Framework.
 * EnumMap is used to represent a group of enum constants.
 * EnumMap is an abstract class.
 * EnumMap is a part of the java.util package.
 * EnumMap is a final class.
 * EnumMap extends AbstractMap class.
 * EnumMap
*/


public class EnumMapExample {
    public static void main(String[] args) {
        // Creating an EnumMap
        EnumMap<Day, String> activities = new EnumMap<>(Day.class);

        // Adding key-value pairs
        activities.put(Day.MONDAY, "Work");
        activities.put(Day.TUESDAY, "Gym");
        activities.put(Day.WEDNESDAY, "Study");

        // Accessing values
        System.out.println("Activity on Monday: " + activities.get(Day.MONDAY)); // Work

        // Removing a key-value pair
        activities.remove(Day.WEDNESDAY);

        // Iterating through the EnumMap
        for (Day day : activities.keySet()) {
            System.out.println(day + ": " + activities.get(day)); // MONDAY: Work, TUESDAY: Gym
        }
    }
}
