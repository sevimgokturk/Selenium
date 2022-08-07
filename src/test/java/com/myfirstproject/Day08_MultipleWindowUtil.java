package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day08_MultipleWindowUtil extends TestBase {
    @Test
    public void multipleWindowTest(){
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();
        switchToTargetWindow("New Window");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals("New Window",driver.getTitle());

    }
}
