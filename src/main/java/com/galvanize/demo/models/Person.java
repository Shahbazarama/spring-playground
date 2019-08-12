package com.galvanize.demo.models;

import java.util.UUID;

public class Person {
    public UUID id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.age = age;
    }
}
