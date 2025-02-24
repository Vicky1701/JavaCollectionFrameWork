package org.code.iterableconcepts;


import java.util.List;
import java.util.ArrayList;

/*
 * 3. Enhanced For-loop (For-each)
 * The enhanced for-loop (for-each) provides a concise way to iterate over collections.
 * It is used to iterate over arrays, lists, sets, and other iterable objects.
 *
 */

public class ForEachExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Using enhanced for-loop to iterate over the list
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
