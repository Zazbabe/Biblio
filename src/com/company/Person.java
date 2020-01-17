package com.company;

public abstract class Person {

    String name;
    String email;
    String password;

    //
    public Person(String name, String email, String password) {
        //tilldelar in-värdet till den lokala variablerna
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return name + " " + email;
    }
}

