package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day13_NoSuchElementException {


    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void nosuchElementExceptionTest01(){
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.linkText("Log")).click();//(Day13_NoSuchElementException.java:24)
                                                        //locator exception
    }
    @Test
    public void nosuchElementExceptionTest02(){
      driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
      driver.findElement(By.xpath("//div[@id='start']//button")).click();
      String hello= driver.findElement(By.xpath("//div[@id='finish']")).getText();//time issiue
        Assert.assertEquals("Hello World!",hello);
    }

    @Test
    public void nosuchElementExceptionTest03() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button  ")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        String message = driver.findElement(By.xpath("//p[@id=\"message\"]")).getText();

        Assert.assertEquals("It's gone!",message);
        //sollition add some waite
        //explicit==> implicit==> threat
    }

}
