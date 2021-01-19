package com.company;

public class Main {

    public static void main(String[] args) {
        StudentsGroup group = new StudentsGroup("SE-20012");

        group.addStudent(new Student("Mike", "Tyson", 3.7));
        group.addStudent(new Student("Zinedine", "Zidane", 4.0));
        group.addStudent(new Student("Bake", "Myrkynbayev",2.2));

        System.out.println(group);
    }
}
