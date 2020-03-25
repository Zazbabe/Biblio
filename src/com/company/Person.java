package com.company;

public abstract class Person {

    private String name;
    private String email;
    private String password;

    //
    Person(String name, String email, String password) {
        //tilldelar in-värdet till den lokala variablerna
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return name + " " + email;
    }
}

