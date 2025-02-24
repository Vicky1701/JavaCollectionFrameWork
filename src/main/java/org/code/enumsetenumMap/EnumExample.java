package org.code.enumsetenumMap;

/**
 * Enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 * You can use an enum when you have a fixed set of constants.
 * The enum constants are static and final implicitly.
 * The enum can be defined inside or outside the class.
 * The enum can have fields, constructors, and methods.
 * The enum can implement interfaces.
 * The enum can be used in switch statements.
 * The enum can be iterated.
 */

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("Today is Monday!");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday!");
                break;
            default:
                System.out.println("Some other day!");
        }

        // Iterating through enum values
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
