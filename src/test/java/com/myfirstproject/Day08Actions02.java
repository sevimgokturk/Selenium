package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08Actions02 extends TestBase {
    @Test
    public void test(){
        driver.get("https://www.amazon.com/");
        //nav-link-accountList-nav-line-1
        WebElement menu= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);

        actions.moveToElement(menu).perform();
        //WebElement account = driver.findElement(By.className("nav-text"));
        //actions.moveToElement(menu).moveToElement(account).click().perform();
        driver.findElement(By.linkText("Account")).click();




    }
}
