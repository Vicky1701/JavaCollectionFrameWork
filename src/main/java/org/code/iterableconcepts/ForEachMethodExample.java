package org.code.iterableconcepts;

import java.util.List;
import java.util.ArrayList;

/*
 * 4. forEach() Method
 * The forEach() method is a new feature introduced in Java 8 that allows you to iterate over a collection using a lambda expression or method reference.
 * It is a more concise way to iterate over collections compared to the enhanced for-loop.
 *
 */

public class ForEachMethodExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Using forEach method with a lambda expression
        colors.forEach(color -> System.out.println(color));

        // Using forEach method with a method reference
        colors.forEach(System.out::println);
    }
}