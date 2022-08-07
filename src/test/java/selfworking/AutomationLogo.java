package selfworking;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class AutomationLogo extends TestBase {
    @Test
    public void name() throws InterruptedException {
        /*
        andreas.feil@gmail.com
        768658

         */
        driver.get("http://automationpractice.com/index.php");
        String windowHandle01 = driver.getWindowHandle();
        WebElement box =driver.findElement(By.xpath("(//img[@class=\"replace-2x img-responsive\"])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(box).perform();
        driver.findElement(By.linkText("Add to cart")).click();
        //===
        //And verifies the product is added to the cart
        //JavascriptExecutor js = (JavascriptExecutor)driver;
        //WebElement element = driver.findElement(By.className("ajax_cart_product_txt "));
        //String actual = (String) js.executeScript("return arguments[0].value", element);
        //Thread.sleep(2000);
        //String expected ="There is 1 item in your cart.";
        //Thread.sleep(2000);
        //Assert.assertEquals("the product is not added to the cart",expected,actual);
        //===

        Thread.sleep(1000);
        driver.findElement(By.linkText("Proceed to checkout")).click();

        Set<String> allwindiwHandles01= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles01){
            if(!eachHandlec.equals(windowHandle01)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle02 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle02);
        String productActual= driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).getText();
        String productExpected = "Faded Short Sleeve T-shirts";
        Assert.assertEquals("Product is not added.",productExpected,productActual);

        String ActualColorSize = driver.findElement(By.xpath("//*[@id='product_1_1_0_0']/td[2]/small[2]")).getText();
        String ExpectedColorSize = "Color : Orange, Size : S";
        Assert.assertEquals("Expected Color and Size didn't match with actual.",ExpectedColorSize,ActualColorSize);

        String ActualInStock = driver.findElement(By.xpath("//*[@id='product_1_1_0_0']/td[3]/span ")).getText();
        String ExpectedInStock= "In stock";
        Assert.assertEquals("There arent any in stock",ExpectedInStock,ActualInStock);

        String ActualUnitPrice = driver.findElement(By.xpath("//*[@id='product_1_1_0_0']/td[4]/span")).getText();
        String ExpectedUnitPrice ="$16.51";
        Assert.assertEquals(ExpectedUnitPrice,ActualUnitPrice);
        //it didnt work??? panic :))
        //check the quantity,
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //WebElement ActualQtyWebElement = driver.findElement(By.xpath("//*[@name='quantity_1_1_0_699651_hidden']"));
        //WebElement ActualQtyWebElement = driver.findElement(By.xpath("//*[@id='product_1_1_0_0']/td[5]/input[2]"));
        //String ActualQty = (String) js.executeScript("return arguments[0].value",driver.findElement(By.xpath("//*[@name='quantity_1_1_0_699651_hidden']")));
        //String ExpectedQty = "1";
        //Assert.assertEquals("Actual Qty didn't match",ExpectedQty,ActualQty);

        String ActualShippingPrice = driver.findElement(By.id("total_shipping")).getText();
        String ExpectedShipingPrice= "$2.00";
        Assert.assertEquals("Shipping prices didn't match",ExpectedShipingPrice,ActualShippingPrice);

        String ActualTotalPrice = driver.findElement(By.id("total_price_container")).getText();
        String ExpectedTotalPrice="$18.51";
        Assert.assertEquals("Total prices didn't match",ExpectedTotalPrice,ActualTotalPrice);

        String windowHandle03 = driver.getWindowHandle();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        Set<String> allwindiwHandles02= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles02){
            if(!eachHandlec.equals(windowHandle03)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle04 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle04);

        driver.findElement(By.xpath("//a[@class='login']")).click();
        driver.findElement(By.id("email")).sendKeys("andreas.feil@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("768658");
        driver.findElement(By.id("SubmitLogin")).click();

        Set<String> allwindiwHandles03= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles03){
            if(!eachHandlec.equals(windowHandle04)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle05 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle05);


        WebElement menu= driver.findElement(By.xpath("//a[@title=\"View my shopping cart\"]"));
        actions.moveToElement(menu).perform();
        driver.findElement(By.linkText("Check out")).click();

        Set<String> allwindiwHandles04= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles04){
            if(!eachHandlec.equals(windowHandle05)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle06 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle06);

        driver.findElement(By.linkText("Proceed to checkout")).click();

        Set<String> allwindiwHandles05= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles05){
            if(!eachHandlec.equals(windowHandle06)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle07 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle07);
        System.out.println(driver.getCurrentUrl());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


        Set<String> allwindiwHandles6= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles6){
            if(!eachHandlec.equals(windowHandle07)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle08 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle08);
        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.id("uniform-cgv"));
        Thread.sleep(1000);
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[3]")).click();

        Set<String> allwindiwHandles7= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles7){
            if(!eachHandlec.equals(windowHandle08)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle09 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle09);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class=\"bankwire\"]")).click();

        Set<String> allwindiwHandles8= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles8){
            if(!eachHandlec.equals(windowHandle09)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle10 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle10);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();


        Set<String> allwindiwHandles9= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles9){
            if(!eachHandlec.equals(windowHandle10)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String windowHandle11 = driver.getWindowHandle();
        driver.switchTo().window(windowHandle11);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.className("logout")).click();

    }
}
