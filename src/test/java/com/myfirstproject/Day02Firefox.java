package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02Firefox {
    //    Create a new class under : FirefoxBrowserDemo
//    Create main method
//    Set Path
//    Create gecko driver
//    Open google home page https://www.google.com/
//    Maximize the window
//    Close/Quit the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.ch/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(10000);
        driver.quit();
         /*
        Thread.sleep is a Java wait
        It doesn't come from selenium
        It is a hard wait
        It means driver will wait here for 5 seconds under every condition
        If driver does not need any wait, it will still wait for 5 seconds
        Testers should avoid this wait, Thread.sleep puts unnecessary waitings
        We will learn Selenium Implicit and Explicit waits in upcoming classes

        Thread.sleep throws exception, we should add exception to method signature, or we should use try catch block
         */

    }

}
