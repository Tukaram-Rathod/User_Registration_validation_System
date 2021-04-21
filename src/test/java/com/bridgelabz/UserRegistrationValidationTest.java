package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
//user registration validation test class testing all method
public class UserRegistrationValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        try {
            UserRegistrationValidation validator = new UserRegistrationValidation();
            boolean result = UserRegistrationValidation.validatefirstName("Ashish");
            Assert.assertTrue( result);
        }catch (UserRegistrationValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
          try {
              UserRegistrationValidation validator = new UserRegistrationValidation();
              boolean result = validator.validatefirstName("As");
              Assert.assertFalse(result);
          } catch (UserRegistrationValidationException e) {
             e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        try {
            UserRegistrationValidation validator = new UserRegistrationValidation();
            boolean result = validator.validatelastName("Rathod");
            Assert.assertTrue(result);
        }catch (UserRegistrationValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse(){
        try {
           UserRegistrationValidation validator = new UserRegistrationValidation();
            boolean result = validator.validatelastName("Ra");
            Assert.assertFalse(result);
        }catch (UserRegistrationValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenemail_WhenProper_ShouldReturnTrue(){
        try {
            UserRegistrationValidation validator = new UserRegistrationValidation();
            boolean result = validator.validateEmailAddress("abc@yahoo.com");
            Assert.assertTrue(result);
        }catch (UserRegistrationValidationException e){
            e.printStackTrace();
        }
    }
    @Test
    public void givenemobileNumber_WhenProper_ShouldReturnTrue(){
       try {
           UserRegistrationValidation validator = new UserRegistrationValidation();
           boolean result = validator.validatemobileNumber("8805925703");
           Assert.assertTrue(result);
       }catch (UserRegistrationValidationException e){
           e.printStackTrace();
       }
    }
    @Test
    public void givenpassword_WhenProper_ShouldReturnTrue(){
       try {
           UserRegistrationValidation validator = new UserRegistrationValidation();
           boolean result = validator.validatepassword("Ashu@981");
           Assert.assertTrue(result);
       }catch (UserRegistrationValidationException e){
           e.printStackTrace();
       }
    }
}
