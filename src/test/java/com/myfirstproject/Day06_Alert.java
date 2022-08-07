package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day06_Alert  extends TestBase {
    //    acceptAlert() => click on the first alert,
//    verify the text "I am a JS Alert" ,
//    click OK ,
//    and Verify "You successfully clicked an alert"
//
//    dismissAlert()=> click on the second alert,
//    verify text "I am a JS Confirm", click cancel, and Verify "You clicked: Cancel"

//    sendKeysAlert()=> click on the third alert,
//    verify text "I am a JS prompt", type "Hello World", click OK, and Verify "You entered: Hello Word"

    @Test
    public void dismissAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        click on the second alert,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
//         verify text "I am a JS Confirm”,
        String actualAlertText = driver.switchTo().alert().getText();
        String expectedAlertText = "I am a JS Confirm";
        Assert.assertEquals(expectedAlertText,actualAlertText);

//        click cancel
        driver.switchTo().alert().dismiss();
        Thread.sleep(5000);

//        and Verify “You clicked: Cancel”
        String expectedResultText = "You clicked: Cancel";
        String actualResultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(expectedResultText,actualResultText);

    }
    @Test
    public void test03() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        String actualallerttext = driver.switchTo().alert().getText();
        String expectedalerttext = "I am a JS prompt";
        Assert.assertEquals(expectedalerttext,actualallerttext);
        driver.switchTo().alert().sendKeys("Hello World");
        driver.switchTo().alert().accept();
        String expectedResultText = "You entered: Hello World";Thread.sleep(1000);
        String actualResultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(expectedResultText,actualResultText);



    }

}
