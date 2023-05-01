package com.example.demo;

public class Person {
    final Long id;
    String name;

    public Person(Long id, String name){
        this.id = id;
        setName(name);
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
