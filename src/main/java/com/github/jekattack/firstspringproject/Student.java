package com.github.jekattack.firstspringproject;

import java.util.UUID;

public class Student {

    private String name;
    private String id = UUID.randomUUID().toString();

    public Student(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}
