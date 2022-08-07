package selfworking;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class Hmework1 extends TestBase {
    @Test
    public void information() {
        //=============Create An Account =============
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String firstname = faker.name().firstName();
        String lastname = faker.name().lastName();
        String password = faker.number().digits(6);
        String companyNameAsAddresses = faker.company().name();
        Address addresses = faker.address();
        String city = faker.address().city();
        String zip = faker.number().digits(5);
        //String zip= faker.address().zipCode();
        String phonenumber = faker.number().digits(10);


        driver.get("http://automationpractice.com/index.php");
        String window1Handle = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[@class='login']")).click();
        Set<String> allwindiwHandles1 = driver.getWindowHandles();
        for (String eachHandlec : allwindiwHandles1) {
            if (!eachHandlec.equals(window1Handle)) {
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window2Handle = driver.getWindowHandle();
        driver.switchTo().window(window2Handle);

        driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys(email);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        Set<String> allwindiwHandles2 = driver.getWindowHandles();
        for (String eachHandlec : allwindiwHandles2) {
            if (!eachHandlec.equals(window2Handle)) {
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

        Set<String> allwindiwHandles3 = driver.getWindowHandles();
        for (String eachHandlec : allwindiwHandles3) {
            if (!eachHandlec.equals(window3Handle)) {
                driver.switchTo().window(eachHandlec);
                break;
            }
        }
        String window4Handle = driver.getWindowHandle();
        driver.switchTo().window(window4Handle);

        driver.findElement(By.linkText("Home")).click();
        driver.switchTo().window(window1Handle);

        System.out.println("email: "+ email);
        System.out.println("password: "+ password);
    }
}
