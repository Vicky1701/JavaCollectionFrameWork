package org.code.comparatorandcomparable;

class Student implements Comparable<StudentComapator> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implementing compareTo method for natural ordering (by age)
    @Override
    public int compareTo(StudentComapator other) {
        return this.age - other.getAge();
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

