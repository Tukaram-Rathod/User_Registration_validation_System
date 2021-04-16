package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    //First name starts with Cap and has minimum 3 characters
    public static boolean isValidFirstName(String fname) {
        // firstname pattern.
        String FirstName_Pattern = "^[A-Z]{1}[a-z]{3,}[a-z]*$";
        Pattern pattern = Pattern.compile(FirstName_Pattern);
        Matcher matcher = pattern.matcher(fname);
        return matcher.matches();
    }
    public static boolean isValidLastName(String lname) {
        // lastname pattern.
        String LastName_Pattern = "^[A-Z]{1}[a-z]{3,}[a-z]*$";
        Pattern pattern = Pattern.compile(LastName_Pattern);
        Matcher matcher = pattern.matcher(lname);
        return matcher.matches();
    }
    //email Address Validation
    public static boolean isvalidateEmailAddress(String email) {
        //email validation
        String Email_Address_Pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern = Pattern.compile(Email_Address_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstname = sc.nextLine();
        System.out.println(isValidFirstName(firstname));
        System.out.println("Enter Last Name:");
        String lastname = sc.nextLine();
        System.out.println(isValidLastName(lastname));
        System.out.println("Enter Email Address:");
        String email = sc.nextLine();
        System.out.println(isvalidateEmailAddress(email));

    }
}
