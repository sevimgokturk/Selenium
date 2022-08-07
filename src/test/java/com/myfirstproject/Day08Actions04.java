package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Day08Actions04 extends TestBase {
    /*
    Create a class: Action4
Create a method dragAndDropTest
Given user is on https://jqueryui.com/droppable/
And user moves the target element(Drag me to my target) in to  destination(Drop here)
     */
    @Test
    public void dradAndDropTest() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement dragElement = driver.findElement(By.id("draggable"));
        Thread.sleep(2000);
        WebElement dropElement = dragElement.findElement(By.id("droppable"));
        Thread.sleep(2000);
        Actions actions= new Actions(driver);
        //actions.clickAndHold(dragElement).moveToElement(dropElement).perform();
        actions.dragAndDrop(dragElement,dropElement).perform();




    }
}
