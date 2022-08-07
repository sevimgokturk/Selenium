package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Day07MultipleTags extends TestBase {
    @Test
    public void windowHandle(){
        //    Create a new Class Tests package: Day07_NewWindows
        //    Method name:windowHandle
        //    Given user is on the https://the-internet.herokuapp.com/windows
        //    Then user verifies the text : "Opening a new window"
        //    Then user verifies the title of the page is "The Internet"
        //    When user clicks on the "Click Here" button
        //    Then user verifies the new window title is "New Window"
        //    Then user verifies the text:  "New Window"
        //    When user goes back to the previous window and then verifies the title : "The Internet"

        driver.get("https://the-internet.herokuapp.com/windows");
        //    Then user verifies the text : "Opening a new window"
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).getText().contains("Opening a new window"));
        //    Then user verifies the title of the page is "The Internet"
        Assert.assertEquals("The Internet",driver.getTitle());
        //When user clicks on the "Click Here" button
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        //    Then user verifies the new window title is "New Window"
        String window1Handle = driver.getWindowHandle();
        System.out.println(window1Handle);
        Set<String> allwindiwHandles= driver.getWindowHandles();
        System.out.println(allwindiwHandles);
        for (String eachHandlec: allwindiwHandles){
            if(!eachHandlec.equals(window1Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        Assert.assertEquals("New Window",driver.getTitle());


        //    When user goes back to the previous window and then verifies the title : "The Internet"

        String window2Handle = driver.getWindowHandle();
        for (String eachHandlec: allwindiwHandles){
            if(!eachHandlec.equals(window2Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        Assert.assertEquals("The Internet",driver.getTitle());

       driver.switchTo().window(window2Handle);
       Assert.assertEquals("New Window",driver.getTitle());

       driver.switchTo().window(window1Handle);
       Assert.assertEquals("The Internet",driver.getTitle());













    }
}
