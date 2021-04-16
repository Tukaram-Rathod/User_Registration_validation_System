package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {
    //First name starts with Cap and has minimum 3 characters
    public static boolean isValidFirstName(String fname) {
        // firstname pattern.
        String FirstName_Pattern = "^[A-Z]{1}[a-z]{3,}$";
        // Compile the ReGex
        Pattern pattern = Pattern.compile(FirstName_Pattern);
        Matcher matcher = pattern.matcher(fname);

        if(matcher.matches())
            System.out.println("Valid First Name !!!");
        else
            System.out.println("Invalid First Name !!!");
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstname = sc.nextLine();
        System.out.println(isValidFirstName(firstname));
    }
}
