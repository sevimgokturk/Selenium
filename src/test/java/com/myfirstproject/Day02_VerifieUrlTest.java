package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_VerifieUrlTest {
    //        1.Create a new class: VerifyURLTest
//        2.Navigate to google homepage
//        3.Verify if google homepage url is "www.google.com"
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/osmangok/Documents/selenium libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.ch/");
        driver.manage().window().maximize();
        String actualUrl = driver.getCurrentUrl().toString();
        String ecpactedUrl = "www.google.com";
        if (actualUrl.equals(ecpactedUrl)){
            System.out.println("PASSED");
        }else {
            System.out.println("Faild");
            System.out.println( "actuel"+ actualUrl);
            System.out.println("expected"+ ecpactedUrl );

        }




    }

}
