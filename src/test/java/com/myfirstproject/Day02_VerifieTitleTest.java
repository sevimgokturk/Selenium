package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifieTitleTest {
    //  1.Create a new class: VerifyTitleTest
    // 2.Navigate to google homepage
    // 3.Verify if google title is "Google"
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ch/");
        driver.manage().window().maximize();
        String actualtitle = driver.getTitle();
        String expectedTitle = "Google";
        if(actualtitle.equals(actualtitle)){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("Expacted title: "+ expectedTitle);
            System.out.println("Actual title: "+ actualtitle);
        }



    }
}
