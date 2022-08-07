package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 extends TestBase {
    @Test
    public void test01(){
        // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
        // click on the second emoji
        // click all the second emoji elements
        // fill the form,(Fill the form with the texts you want)
// press the apply button

        driver.get(" https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(iframe);
        //driver.findElement(By.xpath("(//img[@class =\"emoji\"])[2]")).click();
        WebElement secondElement = driver.findElement(By.xpath("//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect']"));
        secondElement.click();
        List <WebElement> emojies = driver.findElements(By.xpath("(//div[@id='nature']/div/img)"));
        for (WebElement w : emojies){
           // w.click();
        }
       emojies.stream().forEach(t->t.click());
        driver.switchTo().defaultContent();
        List<WebElement> textBoxes =  driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        List<String> words = new ArrayList<>(Arrays.asList("This","iframe","example","looks","very","funny","does","not","it","?","!"));
        for (int i =0; i<textBoxes.size();i++){
            textBoxes.get(i).sendKeys(words.get(i));
        }
        //driver.findElement(By.xpath()).click();


    }


}
