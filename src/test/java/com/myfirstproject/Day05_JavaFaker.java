package com.myfirstproject;


import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day05_JavaFaker {
    @Test
    public  void fakerTest(){
        Faker faker =new Faker();
        String firstname = faker.name().firstName();
        System.out.println(firstname);
        String lname = faker.name().lastName();
        System.out.println(lname);
        String fullname = faker.name().fullName();
        System.out.println(fullname);
        String username = faker.name().username();
        System.out.println(username);
        String title = faker.name().title();
        System.out.println(title);
        String adresses = faker.address().city();
        System.out.println(adresses);
        System.out.println(faker.ancient().god());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.aquaTeenHungerForce().character());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.number().digits(3));



    }



}
