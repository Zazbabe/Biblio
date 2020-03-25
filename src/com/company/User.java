package com.company;

import java.util.ArrayList;

public class User extends Person{

    //Användarens arraylistor där man kan se hens personliga lånade böcker resp historik
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, String email, String password) {
        super(name, email, password);
    }

    //Lägger till lånad/e bok/böcker i listan och skriver ut vilka böcker som lånats detta tillfället
    public void borrowBook(Book borrowedB){
        //lånar bok
        borrowedBooks.add(borrowedB);
        //sätter boken till utlånad
        borrowedB.setAvailable(false);
        System.out.println("Du har lånat boken " + borrowedB + ".");
    }

    public void returnBook(Book returnedB){
        //tar bort boken från arrayen borrowedBooks
        borrowedBooks.remove(returnedB);
        //ändrar availiable till true dvs den går att låna igen
        returnedB.setAvailable(true);
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
