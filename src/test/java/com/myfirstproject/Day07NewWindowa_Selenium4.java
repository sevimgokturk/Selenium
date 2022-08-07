package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class Day07NewWindowa_Selenium4 extends TestBase {
    //        Open google on window 1
    //        Open amazon on window 2
    //        Open linkedin on window 3
    //        Switch between windows
    //        Switch to amazon
    //        Switch to google
    //        Switch back to linkedin

    @Test
    public void newwindow() throws InterruptedException {
        //        Open google on window 1
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        String googleWindowHandle = driver.getWindowHandle();

        //        Open amazon on window 2
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        String amazonWindowHandle = driver.getWindowHandle();

        //        Open amazon on window 3
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com/");
        System.out.println(driver.getTitle());
        String linkedinWindowHandle = driver.getWindowHandle();

        //        Switch between windows
        //        Switch to amazon
        Thread.sleep(2000);
        driver.switchTo().window(amazonWindowHandle);

        //        Switch to google
        Thread.sleep(2000);
        driver.switchTo().window(googleWindowHandle);

        //        Switch back to linkedin
        Thread.sleep(2000);
        driver.switchTo().window(linkedinWindowHandle);

    }


}
