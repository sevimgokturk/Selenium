package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_xpath_css {
    WebDriver driver;
    @Before
    public void setUp(){
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        //        user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
    }
    @Test
    public void xpath_css(){
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testtechproed@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test1234!");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    @Test
    public void css(){
      driver.findElement(By.cssSelector("input[type='email']"));
      driver.findElement(By.cssSelector("input[type='password']"));
      driver.findElement(By.cssSelector("input[type='submit']"));

        driver.findElement(By.cssSelector("input#session_email"));
        driver.findElement(By.cssSelector("#session_email"));
        driver.findElement(By.cssSelector("input.form-control"));
    }
    @After
    public void tearDown(){
        //driver.quit();
    }



}
