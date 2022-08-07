package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08DownloadFile extends TestBase {
    /*
  Create a class:FileDownloadTest
downloadTest()
In the downloadTest() method, do the following test:
Go to https://the-internet.herokuapp.com/download
Download flower.png file
Then verify if the file downloaded successfully
   */
    @Test
    public void download() throws InterruptedException {
        //driver.get("https://the-internet.herokuapp.com/download");
        //driver.findElement(By.linkText("sample.png")).click();
        //Thread.sleep(2000);
        String path = System.getProperty("user.home")+"/Downloads/sample.png";
        //String path ="/Users/osmangok/Downloads/sample.png";
        boolean isexist = Files.exists(Paths.get(path));
        Assert.assertTrue(isexist);


    }
}
