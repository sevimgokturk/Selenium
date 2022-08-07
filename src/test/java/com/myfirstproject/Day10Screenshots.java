package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day10Screenshots extends TestBase {
    /*
     * In Testing, Screenshot is very essential
     * Documentation of test results
     *
     * Test Reports should have test cases(test steps), test result(fails, passes), screenshots
     *
     * If our test fails, we need screenshot to raise a bug ticket.
     * If our test passes, we should get a screenshot as a proof.
     *
     * With Selenium 3 & 4 we can get screenshot by using TakeScreenshot class and getScreenshotAs()
     * to be able to get screenshot of a webpage
     *
     * With Selenium 4, we can take screenshot of a specific element
     *
     *
     * */



    @Test
    public void screenShotTest() throws IOException {
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();

        driver.findElement(By.className("q")).sendKeys("cats"+ Keys.ENTER);
        takeScreenShot();
    }
    public void takeScreenShot() throws IOException {
//        1.Taking screenshot using getScreenshotAs()
        File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//       Alternative Way
//       TakesScreenshot ts = (TakesScreenshot)driver;
//       File iamge = ts.getScreenshotAs(OutputType.FILE);
//      2. We will save the image this path. We used currentDate to be able to get unique names each time.
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentDate+"test-image.png";
        File finalPath = new File(path);
        FileUtils.copyFile(img,finalPath); // source, destination
    }


    //homework
    // get the screenshot of "Oturum açın" button
    @Test
    public void OturumAcinSreenshot() throws IOException {
        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        File img = driver.findElement(By.xpath("//a[@class=\"gb_1 gb_2 gb_7d gb_7c\"]")).getScreenshotAs(OutputType.FILE);
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentDate+"oturumAcin.png";
        File finalPath = new File(path);
        FileUtils.copyFile(img,finalPath);
    }
}
