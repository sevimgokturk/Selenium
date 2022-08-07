package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Q04 {
    WebDriver driver;
    @Before
    public void setUp(){
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    // ...Exercise4...
// Navigate to  https://testpages.herokuapp.com/styled/index.html
// Click on  Calculate under Micro Apps
// Type any number in the first input
// Type any number in the second input
// Click on Calculate
// Get the result
// Print the result
    @Test
    public void test01(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("35");
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        String result = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        //driver.findElement(By.xpath("//input[@id='function']")).
        assertEquals(55,result);



    }



    @After
    public void teardown(){
       // driver.quit();
    }
}
