package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

interface IUserValidation{
    boolean validateString(String userDetail,Pattern pattern);
}

public class UserRegistrationValidation {
    static IUserValidation validateuser=(userDetail,pattern)->{return pattern.matcher(userDetail).matches();};

    public static Matcher matcher;

    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{3,}$";
    private static final String Email_Address_Pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String Mobile_Number =  "^"+"(?:[0-9] ?){6,14}[0-9]$";
    private static final String Password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–{}]:;',?/*~$^+=<>]).{8,20}$";

    //first Name validator method
    public static boolean validatefirstName(String fname) throws UserRegistrationValidationException {
        Pattern pattern = Pattern.compile(Name_Pattern);
        matcher=pattern.matcher(fname);
        if(!matcher.matches())
            throw new UserRegistrationValidationException("First Name should be start with Uppercase And minimum 3 charector shpuld be present in FirstName");
        else
            return matcher.matches();

    }
    //last name validator method
    public static boolean validatelastName(String lname) throws UserRegistrationValidationException{
        Pattern pattern = Pattern.compile(Name_Pattern);
        matcher=pattern.matcher(lname);
        if (!matcher.matches())
            throw new UserRegistrationValidationException("Last Name should be start with Uppercase And minimum 3 charector shpuld be present in LastName");
        else
           return matcher.matches();

    }
    //email validate method
    public static boolean validateEmailAddress(String email) throws UserRegistrationValidationException {
        Pattern pattern = Pattern.compile(Email_Address_Pattern);
        matcher=pattern.matcher(email);
        if (!matcher.matches())
            throw new UserRegistrationValidationException("Invalid Email Re-enter Proper Email Id.");
        else
           return matcher.matches();
    }
    //mobile number validate method
    public static boolean validatemobileNumber(String mobileNo) throws UserRegistrationValidationException {
        Pattern pattern = Pattern.compile(Mobile_Number);
        matcher=pattern.matcher(mobileNo);
        if (!matcher.matches())
            throw new UserRegistrationValidationException("Invalid Mobile Re-enter 10 digit !!!!");
        else
           return matcher.matches();
    }
    //password validate method
    public static boolean validatepassword(String pass) throws UserRegistrationValidationException {
        Pattern pattern = Pattern.compile(Password);
        matcher = pattern.matcher(pass);
        if (!matcher.matches())
            throw new UserRegistrationValidationException("Invalid Password ! Password must contain a Uppercase letter,Digit and Special character. !!!!");
        else
            return matcher.matches();
    }
}
