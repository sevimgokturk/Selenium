package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    //    Create a new class : Homework1
//    Using ChromeDriver, Go to facebook and verify if page title is "facebook", If not, print the correct title.
//    Verify if the page URL contains facebook  if not, print the right url.
//    Then Navigate to https://www.walmart.com/
//    Verify if the walmart page title includes "Walmart.com"
//    Navigate back to facebook
//    Refresh the page
//    Maximize the window
//    Close the browser


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //    Using ChromeDriver, Go to facebook and verify if page title is "facebook", If not, print the correct title.
        driver.get("https://www.facebook.com/");
        String actualtitle= driver.getTitle();
        String expectedtitle= "facebook";
        if(actualtitle.equals(expectedtitle)); else {System.out.println("ActualTitle= "+ driver.getTitle());}
        //    Verify if the page URL contains facebook  if not, print the right url.
        String actualUrl= driver.getCurrentUrl();
        String expectedString ="facebook";
        if(driver.getCurrentUrl().contains(expectedString));
        else {System.out.println("actual URL: "+ actualUrl);}

        //    Then Navigate to https://www.walmart.com/
        driver.get("https://www.walmart.com/");
        //    Verify if the walmart page title includes "Walmart.com"
        String expectedTitle="Walmart.com";
        if(driver.getTitle().equals(expectedTitle));
        else {System.out.println("walmart page title doesn't include \"Walmart.com\"");}
        //    Navigate back to facebook
        driver.get("https://www.facebook.com/");
        //    Refresh the page
        driver.navigate().refresh();
        //    Maximize the window
        driver.manage().window().maximize();
        //    Close the browser
        driver.close();











    }


}
