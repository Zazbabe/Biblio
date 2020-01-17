package com.company;

public class Book {

    String name;
    String writer;
    String description;
    boolean available = true;

    //inparametrar i konstruktorn av de lokala variablerna
    public Book(String name, String writer, String description) {
        //tilldelning av värden till de lokala variablerna
        this.name = name;
        this.writer = writer;
        this.description = description;

    }

    //sätter status på boken huruvida den är utlånad eller ej
    public void setAvailable(boolean availableTrue){
        available = availableTrue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + writer;
    }
}
