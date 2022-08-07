package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q04 extends TestBase {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.
    @Test
    public void capitalsAndCountries() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement oslo =driver.findElement(By.id("box1"));
        WebElement stocholm =driver.findElement(By.id("box2"));
        WebElement washington =driver.findElement(By.id("box3"));
        WebElement cophenag =driver.findElement(By.id("box4"));
        WebElement sebul =driver.findElement(By.id("box5"));
        WebElement rome =driver.findElement(By.id("box6"));
        WebElement madrid =driver.findElement(By.id("box7"));

        WebElement italy =driver.findElement(By.id("box106"));
        WebElement norway =driver.findElement(By.id("box101"));
        WebElement soutkore =driver.findElement(By.id("box5"));
        WebElement america =driver.findElement(By.id("box103"));
        WebElement spain =driver.findElement(By.id("box107"));
        WebElement danmark =driver.findElement(By.id("box104"));
        WebElement sweden =driver.findElement(By.id("box102"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(oslo,norway);
        actions.dragAndDrop(stocholm,sweden);
        actions.dragAndDrop(washington,america);
        actions.dragAndDrop(cophenag,danmark);
        actions.dragAndDrop(sebul,soutkore);
        actions.dragAndDrop(rome,italy);
        actions.dragAndDrop(madrid,italy);

    }
}
