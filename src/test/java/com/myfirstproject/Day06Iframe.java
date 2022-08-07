package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day06Iframe extends TestBase {
    //    Create a class: IFrameTest
    //    Create a method: iframeTest
    //    Go to https://the-internet.herokuapp.com/iframe
    //    Verify the Bolded text contains “Editor”
    //    Locate the text box
    //    Delete the text in the text box
    //    Type “This text box is inside the iframe”
    //    Verify the text Elemental Selenium text is displayed on the page
    @Test
    public void iframeTest() throws InterruptedException {
        //    Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");Thread.sleep(500);
        //    Verify the Bolded text contains “Editor”
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).getText().contains("Editor"));Thread.sleep(500);
        //    Locate the text box
        //    Delete the text in the text box
        driver.switchTo().frame(0); //==> 1.Way by index
        //driver.switchTo().frame("mce_0_ifr"); //==> 2.Way by id or name cook yavas??
        //driver.switchTo().frame(driver.findElement(By.xpath("//p"))); //==> 3.Way by WebElement

        driver.findElement(By.xpath("//p")).clear();Thread.sleep(500);

        //    Type “This text box is inside the iframe”
        driver.findElement(By.xpath("//p")).sendKeys("This text box is inside the iframe");

        //    Verify the text Elemental Selenium text is displayed on the page
        driver.switchTo().parentFrame();
        Assert.assertTrue(driver.findElement(By.id("page-footer")).getText().contains("Elemental Selenium"));






    }






}
