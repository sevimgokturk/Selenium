package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstseleniumClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ch/");
        driver.manage().window().maximize();
        //there are two ways  ==> get("URL"), easy to use, a little bit faster,( takes string=
        //                    ==> navigate (takes string, url)
        driver.navigate().to("https://www.amazon.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        driver.quit();
    }
}
