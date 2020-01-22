package com.company;

import java.util.ArrayList;

public class User extends Person{

    //Användarens arraylistor där man kan se hens personliga lånade böcker resp historik
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    ArrayList<Book> historyOfBooks = new ArrayList<>();

    public User(String name, String email, String password) {
        super(name, email, password);
    }

    //Lägger till lånad/e bok/böcker i listan och skriver ut vilka böcker som lånats detta tillfället
    public void borrowBook(Book borrowedB){
        borrowedBooks.add(borrowedB);
        System.out.println("Du har lånat boken " + borrowedB + ".");
    }

    public void returnBook(Book returnedB){
        historyOfBooks.add(returnedB);
        //jämföra listan av lånade böcker på Kalle med boklistan i Library
        System.out.println("Du har lämnat tillbaka boken " + returnedB + ".");
    }

    //Skriver ut vilka lånade böcker som finns totalt på denna användare
    public void myBorrowedBooks(){
        System.out.println("Dina lånade böcker är: ");
        for (Book borrowedBook: borrowedBooks) {
            System.out.println(borrowedBook);
        }
    }
}
