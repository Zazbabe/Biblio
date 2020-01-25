package com.company;

import java.io.File;
import java.util.Scanner;

public class Login {

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
    }
