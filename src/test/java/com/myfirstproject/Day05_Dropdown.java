package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Day05_Dropdown {
    //Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5.Create method printFirstSelectedOptionTest Print first selected option
//6.Find the size of the dropdown,
// Print "Expected Is Not Equal Actual" if there are not 4 elements in the dropdown.
    WebDriver driver;
    @Before
    public  void  setupurl(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }
    @Test
    public  void selectByIndexTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
    }
    @Test
    public  void selectByValueTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByValue("2");
    }
    @Test
    public  void selectByVisibleTextTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option 1");
    }
    @Test
    public  void printAllTest (){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List<WebElement> selectOptionsList = select.getOptions();
        for (WebElement w : selectOptionsList){
            System.out.println(w.getText());
        }
    }
    @Test
    public  void printFirstSelectedOptionTest (){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        System.out.println(select.getFirstSelectedOption().getText());
    }
    @Test
    public  void size  (){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        List<WebElement> selectOptionsList = select.getOptions();
        int size =selectOptionsList.size();
        System.out.println(size);
        Assert.assertEquals("Expected Is Not Equal Actual",3,size);
    }
    @After
    public void teardown(){
        driver.quit();
    }


}
