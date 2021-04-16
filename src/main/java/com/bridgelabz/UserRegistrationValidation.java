package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationValidation {

    //First name starts with Cap and has minimum 3 characters
    public static boolean isValidFirstName(String fname) {
        // firstname validation pattern.
        String FirstName_Pattern = "^[A-Z]{1}[a-z]{3,}[a-z]*$";
        Pattern pattern = Pattern.compile(FirstName_Pattern);
        Matcher matcher = pattern.matcher(fname);
        return matcher.matches();
    }
    public static boolean isValidLastName(String lname) {
        // lastname validation pattern.
        String LastName_Pattern = "^[A-Z]{1}[a-z]{3,}[a-z]*$";
        Pattern pattern = Pattern.compile(LastName_Pattern);
        Matcher matcher = pattern.matcher(lname);
        return matcher.matches();
    }
    //email Address Validation
    public static boolean isValidateEmailAddress(String email) {
        //email validation
        String Email_Address_Pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern = Pattern.compile(Email_Address_Pattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    //mobile Number Validation
    public static boolean isValidateMobileNumber(String mobileNo) {
        String Mobile_Number = "^"+"(?:[0-9] ?){6,14}[0-9]$";
        Pattern pattern = Pattern.compile(Mobile_Number);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }
    //Password Validation Rule_4 shuold have 1 special charector.
    public static boolean isValidatePasswordRule_4(String password) {
        String Password = "^([a-z]*(?=.*[a-zA-Z0-9]{1,})(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]{1})).{8,}$";
        Pattern pattern = Pattern.compile(Password);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    //validate all sample emails in list
    public static void Validate_EmailSamples(){
        ArrayList<String> emails=new ArrayList<String>();
        //valid emails
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@yahoo.com");
        emails.add("abc.100@abc.com.au");
        emails.add("abc+100@gmail.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc@1.com");
        //invalid mails
        emails.add("abc123@.com");
        emails.add(".abc@abc.com");
        emails.add("abc123@gmail.a");
        emails.add("abc()*@yahoo.in");
        emails.add("abc-");
        emails.add("abc@gmail.com.au.bu");
        emails.add("abc@yahoo.in.1a");
        emails.add("abc@*%.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc..20002@gmail.com");

        String emailPattern="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
        Pattern pattern=Pattern.compile(emailPattern);
        for(String email : emails){
           Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());
        }
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
        System.out.println(isValidateEmailAddress(email));

        System.out.println("Enter Mobile Number:");
        String mobileNo = sc.nextLine();
        System.out.println(isValidateMobileNumber(mobileNo));

        System.out.println("Enter Password:");
        String password = sc.nextLine();
        System.out.println(isValidatePasswordRule_4(password));

        Validate_EmailSamples();
    }
}
