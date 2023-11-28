package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
//    For First name
    public void firstName(){
        System.out.println("Enter First Name:");
        String fname=sc.next();


        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher m = p.matcher(fname);
        if (m.matches()) {
            System.out.println("Valid Input");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
//    For Second name
    public void lastName(){
        System.out.println("Enter Last Name:");
        String lname=sc.next();


        Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        Matcher m = p.matcher(lname);
        if (m.matches()) {
            System.out.println("Valid Input");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public void email(){
        System.out.println("Enter your Email:");
        String email = sc.next();

        Pattern p = Pattern.compile("^[a][b][c][.][a-z]{1,10}@[b][l][.][c][o][.][a-z]{1,10}$");
        Matcher m = p.matcher(email);

        if(m.matches()){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
    }
    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.email();

    }
}
