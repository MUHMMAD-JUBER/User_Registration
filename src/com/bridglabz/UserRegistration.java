package com.bridglabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc=new Scanner(System.in);
//    For entering First name
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
//    For entering Second name
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
//  For Email Validation
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
//For Adding mobile number
    public void mobileNumber(){
        System.out.println("Enter your mobile number:");
        String number = sc.next();

        Pattern p = Pattern.compile("^[789]{1}[0-9]{9}$");
        Matcher m = p.matcher(number);

        if(m.matches()){
            System.out.println("Valid mobile number");
        }
        else{
            System.out.println("Invalid mobile number");
        }

    }

/*    Updating Password here which enhance security of the program, here we use
      a specific character, number and symbol pattern to use the password input*/

    public void password(){
        System.out.println("Enter your Password:");
        String password = sc.next();

        Pattern p = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{7,}$");
        Matcher m = p.matcher(password);

        if(m.matches()){
            System.out.println("Valid  Password");
        }
        else{
            System.out.println("Invalid  Password");
        }

    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO USER REGISTRATION!");
        UserRegistration userRegistration=new UserRegistration();
        userRegistration.firstName();
        userRegistration.lastName();
        userRegistration.email();
        userRegistration.mobileNumber();
        userRegistration.password();


    }
}
