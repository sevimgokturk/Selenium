package selfworking;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class YourLogoAutomation extends TestBase {
    @Test
    public void addElement() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        String window4Handle = driver.getWindowHandle();
        WebElement box =driver.findElement(By.xpath("(//img[@class=\"replace-2x img-responsive\"])[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(box).perform();;
        driver.findElement(By.linkText("Add to cart")).click();
        driver.findElement(By.linkText("Proceed to checkout")).click();

        Set<String> allwindiwHandles4= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles4){
            if(!eachHandlec.equals(window4Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window5Handle = driver.getWindowHandle();
        driver.switchTo().window(window5Handle);

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
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //WebElement ActualQtyWebElement = driver.findElement(By.xpath("//*[@id='product_1_1_0_0']/td[5]/input[2]"));
        //String ActualQty = (String) js.executeScript("arguments[0].scrollIntoView(true)",ActualQtyWebElement);
        //String ExpectedQty = "1";
        //Assert.assertEquals("Actual Qty didn't match",ExpectedQty,ActualQty);

        String ActualShippingPrice = driver.findElement(By.id("total_shipping")).getText();
        String ExpectedShipingPrice= "$2.00";
        Assert.assertEquals("Shipping prices didn't match",ExpectedShipingPrice,ActualShippingPrice);

        String ActualTotalPrice = driver.findElement(By.id("total_price_container")).getText();
        String ExpectedTotalPrice="$18.51";
        Assert.assertEquals("Total prices didn't match",ExpectedTotalPrice,ActualTotalPrice);

        String window0Handle = driver.getWindowHandle();
        driver.findElement(By.linkText("Proceed to checkout")).click();
        Set<String> allwindiwHandles0= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles0){
            if(!eachHandlec.equals(window0Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window1Handle = driver.getWindowHandle();
        driver.switchTo().window(window1Handle);
        driver.findElement(By.xpath("//a[@class='login']")).click();

        Faker faker =new Faker();
        String email = faker.internet().emailAddress();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        String password = faker.number().digits(6);
        String companyNameAsAddresses= faker.company().name();
        Address addresses= faker.address();
        String city = faker.address().city();
        String zip=faker.number().digits(5);
        //String zip= faker.address().zipCode();
        String phonenumber= faker.number().digits(10);


        Set<String> allwindiwHandles1= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles1){
            if(!eachHandlec.equals(window1Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window2Handle = driver.getWindowHandle();
        driver.switchTo().window(window2Handle);

        driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys(email);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        Set<String> allwindiwHandles2= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles2){
            if(!eachHandlec.equals(window2Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window3Handle = driver.getWindowHandle();
        driver.switchTo().window(window3Handle);

        driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]")).sendKeys(firstname);
        driver.findElement(By.xpath("//input[@id=\"customer_lastname\"]")).sendKeys(lastname);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys(firstname);
        //driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys(lastname);
        driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys((companyNameAsAddresses));
        driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys(city);

        WebElement dropdownState = driver.findElement(By.xpath("//select[@id=\"id_state\"]"));
        Select select = new Select(dropdownState);
        select.selectByValue("2");

        driver.findElement(By.id("postcode")).sendKeys(zip);
        driver.findElement(By.id("phone_mobile")).sendKeys(phonenumber);
        driver.findElement(By.id("alias")).sendKeys(zip);
        driver.findElement(By.id("submitAccount")).click();

        Set<String> allwindiwHandles3= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles3){
            if(!eachHandlec.equals(window3Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window6Handle = driver.getWindowHandle();
        driver.switchTo().window(window6Handle);

        driver.findElement(By.linkText("Proceed to checkout")).click();

        Set<String> allwindiwHandles5= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles5){
            if(!eachHandlec.equals(window6Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window7Handle = driver.getWindowHandle();
        driver.switchTo().window(window7Handle);
        System.out.println(driver.getCurrentUrl());

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.name("processAddress")).click();

        Set<String> allwindiwHandles6= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles6){
            if(!eachHandlec.equals(window7Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window8Handle = driver.getWindowHandle();
        driver.switchTo().window(window8Handle);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        Set<String> allwindiwHandles7= driver.getWindowHandles();
        for (String eachHandlec: allwindiwHandles7){
            if(!eachHandlec.equals(window6Handle)){
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window9Handle = driver.getWindowHandle();
        driver.switchTo().window(window9Handle);

    }




}
