package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationValidation {

    private static final String Name_Pattern = "^[A-Z]{1}[a-z]{3,}$";
    private static final String Email_Address_Pattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*"+"@([0-9a-zA-Z][_]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String Mobile_Number =  "^"+"(?:[0-9] ?){6,14}[0-9]$";
    private static final String Password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
    //first Name validator method
    public boolean validatefirstName(String fname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(fname).matches();

    }
    //last name validator mmethod
    public boolean validatelastName(String lname) {
        Pattern pattern = Pattern.compile(Name_Pattern);
        return pattern.matcher(lname).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern = Pattern.compile(Email_Address_Pattern);
        return pattern.matcher(email).matches();
    }

    public boolean validatemobileNumber(String mobileNo) {
        Pattern pattern = Pattern.compile(Mobile_Number);
        return pattern.matcher(mobileNo).matches();
    }

    public boolean validatepassword(String pass) {
        Pattern pattern = Pattern.compile(Password);
        return pattern.matcher(pass).matches();
    }

}
