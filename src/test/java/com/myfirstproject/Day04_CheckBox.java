package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.*;

public class Day04_CheckBox {
    public static void main(String[] args) {
        /*
        Create a class : CheckBox
Create test method and complete the following task.
Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes
Then click on checkbox1 if box is not selected
Then click on checkbox2 if box is not selected
Homework: Then verify that checkbox1 is checked.
         */


    }
    WebDriver driver;
    @Before
    public void setUp(){
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }


    @Test
    public void cho() throws InterruptedException {
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        Thread.sleep(5);
        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(5);
        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        assertTrue(checkbox1.isSelected());
        assertTrue(checkbox2.isSelected());

    }


    @After
    public void tearDown(){
        //driver.quit();
    }


}
