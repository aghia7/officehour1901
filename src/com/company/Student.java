package com.company;

public class Student extends Person {
    private double gpa;

    public Student(String name, String surname) {
        super(name,surname);
    }

    public Student(String name, String surname, double gpa) {
        super(name,surname);
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + getName() + " " + getSurname() + ", " +
                "gpa=" + gpa +
                '}';
    }
}
