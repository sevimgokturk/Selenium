package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03Locators {
    //    Create test method locators
//    user goes to http://a.testaddressbook.com/sign_in
//    Locate the elements of email textbox, password textbox, and signin button
//    Enter below username and password then click sign in button
//    Username : testtechproed@gmail.com
//    Password : Test1234!
//    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to
//            get the text from the page)
//    Verify the Addresses and Sign Out texts are displayed
//    Find the number of total link on the page
//    Sign out from the page
    // i cant singin
    // manually too. Bad email or password.//i tried with yours too
    @Test
    public void locators(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://a.testaddressbook.com/sign_in");
        driver.findElement(By.id("session_email")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.id("session_password")).sendKeys("Test1234!");
        WebElement singInButton = driver.findElement(By.name("commit"));
        singInButton.click();
        //WebElement idElement =driver.findElement(By.className("navbar-text"));
        //System.out.println(idElement.getText());
        //String idElementText = idElement.getText();
        //Assert.assertEquals("testtechproed@gmail.com",idElementText);
        //driver.findElement(By.linkText("Home"));
        WebElement home = driver.findElement(By.partialLinkText("Home"));
        Assert.assertTrue(home.isDisplayed());
        WebElement sign_up = driver.findElement(By.partialLinkText("Sign up"));
        Assert.assertTrue(sign_up.isDisplayed());
       List<WebElement> allLinks = driver.findElements(By.tagName("a"));
       int numberOfLinks = allLinks.size();
        System.out.println(numberOfLinks);

        //    Then verify that the expected user id testtechproed@gmail.com (USE getText() method to
        //            get the text from the page)
        //    Verify the Addresses and Sign Out texts are displayed
        //    Find the number of total link on the page
        //    Sign out from the page



    }
}
