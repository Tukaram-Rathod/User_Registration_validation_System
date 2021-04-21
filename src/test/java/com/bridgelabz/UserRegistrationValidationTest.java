package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;
//user registration validation test class testing all method
public class UserRegistrationValidationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatefirstName("Ashish");
        Assert.assertTrue( result);
    }
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatefirstName("As");
        Assert.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatelastName("Rathod");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatelastName("Ra");
        Assert.assertFalse(result);
    }
    @Test
    public void givenemail_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validateEmailAddress("abc@yahoo.com");
        Assert.assertTrue(result);
    }
    @Test
    public void givenemobileNumber_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatemobileNumber("8805925703");
        Assert.assertTrue(result);
    }
    @Test
    public void givenpassword_WhenProper_ShouldReturnTrue(){
        UserRegistrationValidation validator = new UserRegistrationValidation();
        boolean result = validator.validatepassword("Ashu@981");
        Assert.assertTrue(result);
    }

}
