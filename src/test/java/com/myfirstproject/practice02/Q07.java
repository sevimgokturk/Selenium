package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Q07 extends TestBase {
    @Test
    public void name() throws InterruptedException {
        /*
         * Navigate to  https://www.saucedemo.com/
         * Enter the username  as standard_user
         * Enter the password as   secret_sauce
         * Click on login button
         * Choose price low to high and verify

         */

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
        Select select = new Select(dropdown);
        Thread.sleep(3000);
        select.selectByVisibleText("Price (low to high)");
        String expected = "Price (low to high)";




    }
}
