package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Login {

    private ArrayList<User> users;

    public Login (ArrayList<User> users) {
       this.users = users;
    }

    public User doLogin(){
        //behöver bara EN Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input.next();

        System.out.println("Enter Password : ");
        String password = input.next();

        for (User user: users) {
            if (username.equals(user.getName()) && password.equals(user.getPassword())) {

                System.out.println("Access Granted! Welcome, " + user.getName() + "!");
                //returnera vilken användare
                return user;
            }
        }

        System.out.println("Invalid Username or Password!");
        //returnera tom pekare
        return null;
    }
}



    /*
    private static Scanner scan;

    private String username = "Pelle";
    private String password = "Kalle1";
    private String filepath = "inloggning.txt";

        public void logIn(String username, String password, String filepath) {
            boolean found = false;

            String tempUsername = "";
            String tempPassword = "";

            try
            {
                //läser in filen
                scan = new Scanner(new File(filepath));
                //läser till komma eller ny rad
                scan.useDelimiter("[,\n]");

                while (scan.hasNext() && !found)
                {
                    tempUsername = scan.next();
                    tempPassword = scan.next();

                    //jämför användarnamn och lösenord och sätter boolean till true
                    if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim())){
                        found = true;
                    }
                }
                scan.close();
                System.out.println("Du är inloggad!");
            }
            catch (Exception e)
            {
                System.out.println("Du loggades inte in! Fel användarnamn eller lösenord.");
            }

    }
    */

    /*
    //logga in
    public void signIn(){
        System.out.println("Logga in");
        Login login = new Login();
        login.logIn("Kalle", "Kalle1", "inloggning.txt");
    }
     */
