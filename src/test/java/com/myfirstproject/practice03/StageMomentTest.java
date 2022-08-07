package com.myfirstproject.practice03;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class StageMomentTest extends TestBase {
    @Test
    public void stageMomentTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement img1= driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[1]"));
        scrollIntoViewByJS(img1);
        Actions actions =new Actions(driver);
        actions.moveToElement(img1).perform();
        driver.findElement(By.linkText("Add to cart")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement product =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));
        Assert.assertEquals("Product successfully added to your shopping cart",product.getText());

        System.out.println(driver.findElement(By.xpath("(//h2)[2]")).getText());

        System.out.println(driver.findElement(By.xpath("//span[@class='ajax_cart_quantity']")).getText()+":))))");

        String actual1 = driver.findElement(By.id("layer_cart_product_attributes")).getText();
        String expected1 ="Orange, S";
        Assert.assertEquals(expected1,actual1);

        String actual2 =driver.findElement(By.id("layer_cart_product_quantity")).getText();
        String expectes2="1";
        Assert.assertEquals(expectes2,actual2);

        String actual3 = driver.findElement(By.id("layer_cart_product_price")).getText();
        String expected3 = "$16.51";
        Assert.assertEquals(expected3,actual3);

        String actual4= driver.findElement(By.xpath("//span[@class=\"ajax_cart_shipping_cost\"]")).getText();
        String expected4 ="$2.00";
        Assert.assertEquals(expected4,actual4);

        String actual5= driver.findElement(By.xpath("//span[@class=\"ajax_block_cart_total\"]")).getText();
        String expected5 ="$18.51";
        Assert.assertEquals(expected5,actual5);
        driver.findElement(By.linkText("Proceed to checkout")).click();

        WebElement actual6= driver.findElement(By.id("cart_title"));
        Assert.assertTrue(actual6.isDisplayed());

        //WebElement actual7= driver.findElement(By.linkText("In stock"));
        //Assert.assertTrue(actual7.isDisplayed());

        WebElement actual8 = driver.findElement(By.xpath("//span[@id='product_price_1_1_0']"));
        Assert.assertEquals("$16.51",actual8.getText());


        driver.findElement(By.xpath("//i[@class=\"icon-plus\"]")).click();
        Thread.sleep(3000);
        String actual9=driver.findElement(By.xpath("//span[@id='total_price']")).getText();
        System.out.println();
        Assert.assertEquals("$35.02",actual9);
        driver.findElement(By.linkText("Proceed to checkout")).click();

        WebElement authentication = driver.findElement(By.id("authentication"));
        Assert.assertTrue(authentication.isDisplayed());
        driver.findElement(By.id("email")).sendKeys("andreas.feil@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("768658");
        driver.findElement(By.id("SubmitLogin")).click();
        Assert.assertEquals("ADDRESSES",driver.findElement(By.xpath("//h1")).getText());
       driver.findElement(By.xpath("(//button)[2]")).click();
       Assert.assertEquals("SHIPPING",driver.findElement(By.xpath("//h1[@class='page-heading']")).getText());
        driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
        Assert.assertEquals("You must agree to the terms of service before continuing.",driver.findElement(By.xpath("//p[@class='fancybox-error']")).getText());
        driver.findElement(By.xpath("//*[@title='Close']")).click();
        WebElement checkbox = driver.findElement(By.id("uniform-cgv"));
        Thread.sleep(1000);
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[3]")).click();
        Assert.assertEquals("PLEASE CHOOSE YOUR PAYMENT METHOD",driver.findElement(By.xpath("//h1")).getText());








    }
}
