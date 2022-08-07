package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    // ...Exercise3...
// go to url : https://www.techlistic.com/p/selenium-practice-form.html
//fill the firstname
//fill the lastname
//check the gender
//check the experience
//fill the date
//choose your profession -> Automation Tester
//choose your tool -> Selenium Webdriver
//choose your continent -> Antartica
//choose your command  -> Browser Commands
//click submit button
    WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
//cc_btn cc_btn_accept_all
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(50000);
        driver.findElement(By.xpath("//a[@class='cc_btn cc_btn_accept_all']")).click();
        Thread.sleep(50000);
        driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();
        Thread.sleep(50000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastname");
        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();
        driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]")).click();


    }

    @After
    public void teardown(){
        driver.quit();
    }
}
