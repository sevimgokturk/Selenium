package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day12_JsExecuter extends TestBase {


    @Test
    public void JsExcecuterTest() throws InterruptedException {

        driver.get("https://www.carettahotel.com/");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        js.executeScript("arguments[0].scrollIntoView(true)",ourRooms);

        WebElement info = driver.findElement(By.xpath("//span[.='info@carettahotel.com']"));
        js.executeScript("arguments[0].scrollIntoView(true)",info);

        WebElement availability = driver.findElement(By.xpath("//input[@type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true)",availability);

    }
}
