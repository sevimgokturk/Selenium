package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_ElementRefaranceException {
    WebDriver driver;
    @Before
    public void setURL(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void staleElementReferenceException(){
        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        driver.navigate().refresh();
        home.click();// (Day13_ElementRefaranceException.java:23)

    }
    @Test
    public void staleElementReferenceException2(){
        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        driver.findElement(By.linkText("Log in")).click();
        driver.navigate().back();
        home.click();
    }
    @Test
    public void staleElementReferenceExceptionSolution(){
        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.linkText("Home"));
        home.click();
        driver.navigate().refresh();
        WebElement home2 = driver.findElement(By.linkText("Home"));
        home2.click();

    }
}
