package org.code.comparatorandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.Comparator;

class StudentComapator {
    private String name;
    private int age;

    public StudentComapator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator to sort students by name
class NameComparator implements Comparator<StudentComapator> {
    @Override
    public int compare(StudentComapator s1, StudentComapator s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<StudentComapator> studentComapators = new ArrayList<>();
        studentComapators.add(new StudentComapator("Alice", 20));
        studentComapators.add(new StudentComapator("Bob", 18));
        studentComapators.add(new StudentComapator("Charlie", 22));

        // Sorting using a custom comparator (by name)
        Collections.sort(studentComapators, new NameComparator());

        for (StudentComapator studentComapator : studentComapators) {
            System.out.println(studentComapator);
        }
        // Output:
        // Alice (20)
        // Bob (18)
        // Charlie (22)
    }
}
