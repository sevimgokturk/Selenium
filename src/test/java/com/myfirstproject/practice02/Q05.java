package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class Q05 extends TestBase {
    //Signup For Facebook by using Actions class
    //Go to Facebook
    //Click on Create New Account
    //fill all the boxes by using keyboard actions


    @Test
    public void facebook() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        WebElement nameBox =  driver.findElement(By.xpath("(//input[@name='firstname'])"));
        Actions actions = new Actions(driver);
        actions.click(nameBox).sendKeys("Ali").
                sendKeys(Keys.TAB).sendKeys("Can").
                sendKeys(Keys.TAB).sendKeys("alican@gmail.com").
                sendKeys(Keys.TAB).sendKeys("alican@gmail.com").
                sendKeys(Keys.TAB).sendKeys("12345").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("15").
                sendKeys(Keys.TAB).sendKeys("January").
                sendKeys(Keys.TAB).sendKeys("2010").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }
}
