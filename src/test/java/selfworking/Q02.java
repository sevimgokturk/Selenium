package selfworking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02 {// ...Exercise3...
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
    public void setupurl(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //driver.manage().window().maximize();
    }
    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='cc_btn cc_btn_accept_all']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='cookie-choices-button'])[2]")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("firstname");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("lastname");
        driver.findElement(By.xpath("(//input[@value='Male'])")).click();
        driver.findElement(By.xpath("(//input[@value='3'])")).click();
        driver.findElement(By.xpath("(//input[@id='datepicker'])")).sendKeys("18.01.1982");
        driver.findElement(By.xpath("(//input[@value='Automation Tester'])")).click();
        driver.findElement(By.xpath("(//input[@value='Selenium Webdriver'])")).click();
        driver.findElement(By.xpath("//*[@id=\"continents\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        //driver.findElement(By.xpath("//*[@class=\"btn btn-info\"]")).click();
        driver.close();

    }






}
