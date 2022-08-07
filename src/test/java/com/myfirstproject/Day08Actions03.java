package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08Actions03 extends TestBase {
    /*
    Create a class: ActionClass3
    Create test method : scrollUpDown()
    Go to amazon
    Scroll the page down
    Scroll the page up
     */
    @Test
    public void scrollUpDown() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement click = driver.findElement(By.xpath("(//span[@class='gw-icon feed-arrow'])[1]"));Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='gw-icon feed-arrow'])[1]")).click();Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='gw-icon feed-arrow'])[1]")).click();Thread.sleep(2000);
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        //(//span[@class='gw-icon feed-arrow'])[1]
        actions.sendKeys(Keys.ARROW_DOWN).perform();//daha az assagi iner
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.ARROW_UP).perform();



    }

}
