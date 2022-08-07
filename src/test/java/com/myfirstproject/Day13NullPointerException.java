package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Day13NullPointerException {
    String a;//null
    WebDriver driver;
    Faker faker;
    @Test
    public void test01(){
        System.out.println(a.length());
    }//(Day13NullPointerException.java:9)

    @Test
    public void test02(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();//we didint initialized so we get null pointer exception


    }
    @Test
    public void test03(){
        System.out.println(faker.name().firstName());// we didnt initialized it
    }


}


