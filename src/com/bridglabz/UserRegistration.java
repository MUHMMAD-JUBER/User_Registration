package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
    public void firstName(){
        System.out.println("Enter First Name:");
        String fname=sc.next();


        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");//. represents single character
        Matcher m = p.matcher(fname);
        if (m.matches()) {
            System.out.println("Valid Input");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public void lastName(){
        System.out.println("Enter Last Name:");
        String lname=sc.next();


        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");//. represents single character
        Matcher m = p.matcher(lname);
        if (m.matches()) {
            System.out.println("Valid Input");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();

    }
}
