package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02GetPageSource {
    //    TEST CASE:
    //    Test if amazon contains "Registry" on the homepage
    //    Create a new class : GetPageSource

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.google.ch/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);
        String pageSource = driver.getPageSource();
        //System.out.println(pageSource);
        if (pageSource.contains("Registry")){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        //driver.quit();


    }
}
