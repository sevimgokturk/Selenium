package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Day08_Action01 extends TestBase {
    /*
    Create a class: Actions1
    Create a test method : contextClickMethod() and test the following scenario:
    Given user is on the https://the-internet.herokuapp.com/context_menu
    When use Right clicks on the box
    Then verify the alert message is “You selected a context menu”
    Then accept the alert
    Collapse


     */

    @Test
    public void contextClickTest(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement box =driver.findElement(By.xpath("//div[@id='hot-spot']"));

        Actions actions = new Actions(driver);
        actions.contextClick(box).perform();
        Assert.assertTrue(driver.switchTo().alert().getText().contains("You selected a context menu"));
        driver.switchTo().alert().accept();


    }
}
