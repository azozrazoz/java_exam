package org.example;

public class Person {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    private String name;
    private Integer age;
    public void Introduce() {
        System.out.println("Hello " + name + " " + age.toString());
    }
}
