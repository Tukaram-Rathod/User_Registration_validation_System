package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserEmailValidationTest {
    private String email;
    private boolean Result;

    public UserEmailValidationTest(String email, boolean Result) {
        this.email = email;
        this.Result = Result;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> input(){
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc123@.com",false},
                {".abc@abc.com",false},{"abc111@yahoo.com",true},{"abc123@gmail.a",false},
                {"abc()*@yahoo.in",false},{"abc.100@abc.com.au",true},{"abc+100@gmail.com",true},{"abc-",false},
                {"abc@gmail.com.au.bu",false},{"abc@yahoo.in.1a",false},{"abc@*%.com",false},{"abc@gmail.com.com",true},
                {"abc@1.com",true},{"abc..20002@gmail.com",false},{"abc@abc@gmail.com",false}
        });
    }

    @Test
    public void EmailValidationtest() {
        System.out.println(email+" : "+Result);
        boolean result=UserRegistrationValidation.validateEmailAddress(email);
        Assert.assertEquals(Result, result);
    }
}
