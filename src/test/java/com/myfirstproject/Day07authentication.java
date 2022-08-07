package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day07authentication extends TestBase {
    @Test
    public void test(){
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
       Assert.assertTrue(driver.findElement(By.linkText("Congratulations")).getText().contains("Congratulations"));
    }


}
