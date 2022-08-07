package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q02 extends TestBase {
    // 1. Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    // 2. Click "CLICK ME" of JavaScript Alert
    // 3. Get the pop-up text
    // 4. Verify that message is "I am an alert box!"
    // 5. Accept pop up
        @Test
    public void test01() throws InterruptedException {
            driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
            driver.findElement(By.id("button1")).click();
            Thread.sleep(5000);
            String allertMessage = driver.switchTo().alert().getText();
            Assert.assertEquals("I am an alert box!",allertMessage);
            driver.switchTo().alert().accept();


    }
}
