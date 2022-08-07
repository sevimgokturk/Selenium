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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Q03 {
    //Go to https://the-internet.herokuapp.com/dropdown
//1.Create method selectByIndexTest and Select Option 1 using index
//2.Create method selectByValueTest Select Option 2 by value
//3.Create method selectByVisibleTextTest Select Option 1 value by visible text
//4.Create method printAllTest Print all dropdown value
//5.Create method printFirstSelectedOptionTest Print first selected option
//6.Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 4 elements in the dropdown.

    WebDriver driver;
  @Before
  public void seturl  (){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
      driver.get("https://the-internet.herokuapp.com/dropdown");
  }
  @Test
    public void selectByIndexTest() throws InterruptedException {
      WebElement dropdown = driver.findElement(By.id("dropdown"));
      Select select =new Select(dropdown);
      select.selectByIndex(1);
      Thread.sleep(1000);
  }
  @Test
  public void selectByValueTest() throws InterruptedException {
      WebElement dropdown = driver.findElement(By.id("dropdown"));
      Select select =new Select(dropdown);
      select.selectByValue("2");
      Thread.sleep(1000);

  }
    @Test
    public void selectByVisibleTextTest() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select =new Select(dropdown);
        select.selectByVisibleText("Option 1");
        Thread.sleep(1000);
    }
    @Test
    public  void printAllTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select =new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        for (WebElement w : allOptions){
            System.out.println(w.getText());
        }

    }
    @Test
    public void printFirstSelectedOptionTest(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select =new Select(dropdown);
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.get(1).getText());
        System.out.println("size of drop down element: "+ allOptions.size());
        boolean flag =false;

        for (WebElement w: allOptions){
            if(w.getText().equals("Option 2")){
                flag = true;
            }
        }
        Assert.assertTrue(flag);

        boolean flag2 =true;
        for (WebElement w: allOptions){
            if(w.getText().equals("Option 3")){
                flag2 = false;
            }
        }
        Assert.assertTrue(flag2);
    }

    @After
    public void tearDown(){
      driver.quit();
    }

}
