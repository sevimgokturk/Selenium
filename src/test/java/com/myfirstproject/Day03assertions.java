package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Day03assertions {
    @Test
    public void assertions(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.ch/");
        String expTit = "Google";
        String acTit = driver.getTitle();
        assertEquals("Faild",expTit,acTit);

        /*
         * **** ASSERTIONS ******
         * if expected = actual
         * if assertion fails we see red error
         * if assertion passes we see green tick
         *
         * ****Interview Question*****
         * What is difference between Assertion and Verification?
         * When assertion fails, test stops execution. Assertion means Hard Assert
         * Verification means, test will continue to execute even after verification fails
         *
         * In TestNG there is SoftAssert. It means verification
         * In verification we can mark more than one result as passed or failed
         *
         *
         * */


//        1.Assert.assertEquals();
//        Assert.assertEquals("java","javascript");
//        org.junit.ComparisonFailure:
//        Expected :java
//        Actual   :javascript

//        Assert.assertEquals("TEST HAS FAILED","java","javascript");
//        org.junit.ComparisonFailure: TEST HAS FAILED
//        Expected :java
//        Actual   :javascript



    }
}
