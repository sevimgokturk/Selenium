package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class Day12_JS02 extends TestBase {
    @Test
    public void JSTest(){
        driver.get("https://www.carettahotel.com/");
        WebElement ourRooms = driver.findElement(By.xpath("//*[.='Our Rooms']"));
        scrollIntoViewByJS(ourRooms);

        WebElement availability = driver.findElement(By.xpath("//input[@type='submit']"));
        scrollIntoViewByJS(availability);
    }

    @Test
    public void scrollAllDown() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(2000);
        scrollAllDownByJS();
        Thread.sleep(2000);
        scrollAllUpByJS();
    }

    @Test
    public void clicByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//input[@type=\"submit\"]"));
        clickByJS(element);


    }

    @Test
    public void testValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(2000);
        WebElement checkoutDate = driver.findElement(By.id("checkout_date"));
        setValueByJS(checkoutDate,"10/26/2022");

        checkoutDate.clear();


        checkoutDate.sendKeys("11/26/2022"); //traditional way
    }

    @Test
    public void getValueByJS() throws InterruptedException {
        driver.get("https://www.carettahotel.com/");
        Thread.sleep(2000);
        WebElement checkoutDate = driver.findElement(By.id("checkout_date"));
        System.out.println(checkoutDate.getText());//return empty
        getValueByJS("checkout_date");
    }

    //        How you get get the value of an input box?
    //        We can js executor.
    //        How?
    //        I can get the element using js executor, and get teh value of the element.
    //        For example, I can get the element by id, and use value attribute to get the value of in an input
    //        I have to do this, cause getText in this case does not return teh text in an input


    @Test
    public void changeBackgroundColorByJS() throws IOException, InterruptedException {
        driver.get("https://www.carettahotel.com/");
        WebElement availability = driver.findElement(By.xpath("//input[@type='submit']"));
        changeBackgroundColorByJS(availability,"yellow");
        Thread.sleep(2000);
        takeScreenShot();
    }

    @Test
    public void name() throws InterruptedException, IOException {
        driver.get("https://www.carettahotel.com/");
        WebElement home = driver.findElement(By.className("nav-link"));

        addBorderWithJS(home,"3px solid white");
        Thread.sleep(2000);
        takeScreenShot();

    }
}
