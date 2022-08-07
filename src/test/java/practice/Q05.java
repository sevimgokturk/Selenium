package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Q05 {
       /*
    ...Exercise...
   // http://the-internet.herokuapp.com/add_remove_elements/
   // click on the "Add Element" button 100 times
   // write a function that takes a number, and clicks the "Delete" button
   // given number of times, and then validates that given number of
   // buttons was deleted

   1.method : createButtons()
   2.deleteButtonsAndValidate()
*/
       WebDriver driver;
    @Before
    public void setUp(){
        //pre_request
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void test01(){
       driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        createButtons(driver,100);
        deleteButtons(driver,50);
    }

    private void createButtons(WebDriver driver,int number) {
        WebElement addButton =driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i=1; i<= number ;i++){
           addButton.click();
        }
    }
    private void deleteButtons(WebDriver driver,int number) {
        List<WebElement> deleteButton = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int size = deleteButton.size();
        int counter = 0;
        for (WebElement w : deleteButton) {
            counter++;
            if (counter > number) {
                break;
            }
            w.click();
        }
        List<WebElement> deleteLeft = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int sizeleft = deleteLeft.size();
        assertEquals(50,sizeleft);



    }
}
