package com.github.mrrobbins.pluralsight.kotlindemo.javacode;

import org.jetbrains.annotations.Nullable;

public class Person {
    private String name;

    private int age;

    private Person partner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || "".equals(name.trim())) {
            throw new IllegalArgumentException("bad name");
        }
        this.name = name;
    }

    public int getAge() {
        return age + 50;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Nullable // hint to Kotlin that this Java method may return null. Will force evlis/!! operator
    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }
}

// kotlin demo of type extending a javacode type
class Student extends Person {

}
