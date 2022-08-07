package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Day04_RadioButton {
    /*
    Create a class : RadioButton
 Complete the following task.
Go to https://www.facebook.com/
Click on Create an Account button
Locate the elements of radio buttons
Then click on the radio buttons for your gender if they are not selected
TEST CASE:
Click on Create new account
Enter first name
Enter last name
Enter mobile number or email
Enter new password
Enter birthday(LATER)
Enter gender
Click Sign Up
     */


    WebDriver driver;
    @Before
    public void setUp(){
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void radioButton(){
        WebElement rejectCookies = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        rejectCookies.click();

//        TEST CASE:
//        Click on Create new account
        driver.findElement(By.linkText("Create new account")).click();
//        Enter first name
        driver.findElement(By.name("firstname")).sendKeys("test f name");
//        Enter last name
        driver.findElement(By.name("lastname")).sendKeys("test l name");
//        Enter mobile number or email
        driver.findElement(By.name("reg_email__")).sendKeys("11223344");
//        Enter new password
        driver.findElement(By.name("reg_passwd__")).sendKeys("secretPass!");
//        Enter birthday(LATER)
//        Enter gender
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
//        Click Sign Up
        driver.findElement(By.name("websubmit")).click();

    }
}
