package com.company;

import java.util.ArrayList;

public class StudentsGroup {
    private String name;
    private ArrayList<Student> students;

    public StudentsGroup(String name) {
        students = new ArrayList<>();
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
