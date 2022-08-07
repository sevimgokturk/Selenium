package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q03 extends TestBase {
    @Test
    public void amazonTest() {
        // go to amazon homepage
        // hover mouse over the hello,signIn element at the top right
        // Click on the Create list link in the menu that opens
        // and verify that title is equal to "Your List"

        driver.get("https://www.amazon.com/");
        Actions actions = new Actions(driver);
        WebElement hello = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        actions.moveToElement(hello).perform();
        driver.findElement(By.linkText("Create a List")).click();
        Assert.assertEquals("Your List",driver.getTitle());







    }
}
