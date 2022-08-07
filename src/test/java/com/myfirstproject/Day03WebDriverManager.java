package com.myfirstproject;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03WebDriverManager {
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.ch/");
        String expTit = "Google";
        String acTit = driver.getTitle();
        if (acTit.equals(expTit)) ;
        else {
            System.out.println("not match");
        }
        driver.close();
    }





}
