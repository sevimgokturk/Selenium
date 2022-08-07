package selfworking;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.Random;

public class FaceBook {
    WebDriver driver;
    @Before
    public void setUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click(); Thread.sleep(2000);
    }

    @Test
    public void test01() throws InterruptedException {
            Random random = new Random();
            int numberOfMonth = random.nextInt(12);Thread.sleep(2000);
            WebElement month = driver.findElement(By.id("month"));
            Select select = new Select(month);
            select.selectByValue(String.valueOf(numberOfMonth));
            Thread.sleep(2000);

            int numberOfDay = random.nextInt(30);
            WebElement day = driver.findElement(By.id("day"));
            Select select2 = new Select(day);
            select.selectByValue(String.valueOf(numberOfDay));
            Thread.sleep(2000);

            int numberOfyear = random.nextInt(75) + 1940;
            WebElement year = driver.findElement(By.id("year"));
            Select select3 = new Select(year);
            select3.selectByValue(String.valueOf(numberOfyear));
            Thread.sleep(2000);

            //String numberOfSex = String.valueOf(random.nextInt(2));
            //String xpathOfSex = "input[@name='sex'])" + "[" + numberOfSex + "]";
            //System.out.println(xpathOfSex);
            //driver.findElement(By.xpath(xpathOfSex)).click();
            driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
            Faker faker = new Faker();
            String fname = faker.name().firstName();
            String lname = faker.name().lastName();
            String email = faker.internet().emailAddress();
            String password = faker.internet().password();
            driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys(fname);
            Thread.sleep(100);
            driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lname);
            Thread.sleep(100);
            driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(email);
            Thread.sleep(100);
            driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys(email);
            Thread.sleep(100);
            driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(password);
            Thread.sleep(100);
            //driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
            driver.findElement(By.name("websubmit")).click();
            Thread.sleep(2000);
        }

        @After
        public void teardown () {
            driver.quit();
        }






}
