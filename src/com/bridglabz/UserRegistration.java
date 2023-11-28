package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!");

        Scanner sc=new Scanner(System.in);
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
}
