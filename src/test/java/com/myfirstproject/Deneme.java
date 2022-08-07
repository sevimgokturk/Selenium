package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Deneme extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://medunna.com/");
        driver.findElement(By.xpath("//a[@class='d-flex align-items-center dropdown-toggle nav-link']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Sign in']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Your username']")).sendKeys("team87_doctor");
        driver.findElement(By.xpath("//input[@placeholder='Your password']")).sendKeys("1234567");
        driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Sign in')]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='MY PAGES']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='My Appointments']")).click();
        Thread.sleep(5000);
        List<WebElement> list= driver.findElements(By.xpath("//table[@class='table']//tr/td[13]"));
        int size = list.size();
        Random random = new Random();
        int randInt= random.nextInt(size);
        Thread.sleep(8000);
        list.get(randInt).click();

        Thread.sleep(8000);
        driver.findElement(By.xpath("//a[normalize-space()='Show Test Results']")).click();
        Thread.sleep(8000);
        try {
            List<WebElement> list2 = driver.findElements(By.linkText("View Results"));
            int size2 = list2.size();
            int randint2= random.nextInt(size);
            list2.get(randint2).click();
        }catch (NoSuchElementException e){
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-warning']")).isDisplayed());
        }

        Thread.sleep(8000);
        List<WebElement> list3 = driver.findElements(By.xpath("//tbody/tr/td"));
        for (WebElement w : list3){
            w.isDisplayed();
        }








    }

}
