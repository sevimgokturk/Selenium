package selfworking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Q01 {
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
    public void setupUrl() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(5000);
        createButtons(driver, 100);
        Thread.sleep(5000);
        deleteButtonsAndValidate(driver, 50);
        Thread.sleep(5000);
        List<WebElement> leftDeleteElement = (List<WebElement>) driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
       // Assert.assertEquals("size of left delet button dont match with the expect", 50, leftDeleteElement.size());
        System.out.println(leftDeleteElement.size());


    }

    public void createButtons(WebDriver driver, int number) {
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 1; i <=number; i++) {
            addElement.click();
        }
    }

    public void deleteButtonsAndValidate(WebDriver driver, int number) {
        List<WebElement> deleteElements = (List<WebElement>) driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int counter = 0;
        for (WebElement w : deleteElements) {
            counter++;
            if (counter > number) {
                break;
            }
            w.click();
        }

    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
