package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class Day08_FileUpload extends TestBase {
    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement element = driver.findElement(By.id("file-upload"));
        //String localPath = "/Users/osmangok/Downloads/sample.png";
        String localPath = System.getProperty("user.home")+"/Downloads/sample.png";
        element.sendKeys(localPath);
        driver.findElement(By.id("file-submit")).click();
        String upload = driver.findElement(By.xpath("//h3")).getText();
        //String upload = driver.findElement(By.linkText("File Uploaded!")).getText();
        assertEquals("File Uploaded!",upload);
    }
}
