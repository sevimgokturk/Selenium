package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day08CheckBoxUtil extends TestBase {
    @Test
    public void checkBoxTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Thread.sleep(2000);
        selectCheckBox(checkbox1,true);
        Thread.sleep(2000);
        selectCheckBox(checkbox2,true);
    }
}
