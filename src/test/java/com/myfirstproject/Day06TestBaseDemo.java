package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06TestBaseDemo extends TestBase {
   @Test
   public void test01(){
       driver.get("https://www.google.com/");
       System.out.println(driver.getTitle());
   }
    @Test
    public void test02(){
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }

}
