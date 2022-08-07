package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Facebook01 {
    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");
        Thread.sleep(500);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        WebElement month = driver.findElement(By.id("month"));
        Select select = new Select(month);
        select.selectByValue("1");
        WebElement day = driver.findElement(By.id("day"));
        Select select2 = new Select(day);
        select.selectByValue("12");
        WebElement year = driver.findElement(By.id("year"));
        Select select3 = new Select(year);
        select3.selectByValue("2010");
        driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
        Faker faker =new Faker();
        String fname = faker.name().firstName();
        String lname = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password();
        driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys(fname); Thread.sleep(100);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname); Thread.sleep(100);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email); Thread.sleep(100);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email); Thread.sleep(100);
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password); Thread.sleep(100);
        //driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
    }
    @After
    public void teardown(){
       // driver.quit();
    }
}



