package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Day13_timeoutException {
    WebDriver driver;
    @Before
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void timeoutExceptionTest(){
        driver.get("https://www.carettahotel.com/");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        //(Day13_timeoutException.java:25)
        driver.findElement(By.linkText("Log")).click();
    }
}
