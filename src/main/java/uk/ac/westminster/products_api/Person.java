package uk.ac.westminster.products_api;

public class Person {

    private String name;
    private int age;
    private String email;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void age(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
}