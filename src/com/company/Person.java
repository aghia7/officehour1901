package com.company;

public class Person {
    private int id;
    private static int idGen;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        id = ++idGen;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" + id + " : " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
