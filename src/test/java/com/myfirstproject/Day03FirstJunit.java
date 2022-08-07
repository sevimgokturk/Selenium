package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Day03FirstJunit {
    /*
            /*
        * **** ASSERTIONS ******
        * if expected = actual
        * if assertion fails we see red error
        * if assertion passes we see green tick
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
    /*
      WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.ch/");
        String expTit = "Google";
        String acTit = driver.getTitle();
        assertEquals(expTit,acTit);
        driver.close();
     */
    @Before
    public void setUp(){
        System.out.println("Before");
    }
    @After
    public void tearDown(){
        System.out.println("After");
    }

    @Ignore
    @Test
    public void test1(){
        System.out.println("Test1");

    }
    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }
    @Test
    public void test4(){
        System.out.println("test4");
    }
    }

