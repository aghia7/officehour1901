package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        StudentsGroup group = new StudentsGroup("SE-20012");

        File file = new File("C:\\Users\\aghia\\IdeaProjects\\test\\OfficeHourProject\\src\\com\\company\\input.txt");

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String name = sc.next();
            name = name.substring(0, name.length() - 1);
            String surname = sc.next();
            double gpa = sc.nextDouble();
            Student s = new Student(name, surname, gpa);
            group.addStudent(s);
        }

        System.out.println(group);
    }
}
