package selfworking;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
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
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class AmazonDropdown {
    /*
        Create A Class: AmazonDropdown
        Create A Method dropdownTest
        Go to https://www.amazon.com/
        Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
        Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
        Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
        Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
        Print the the total number of options in the dropdown
        Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
        BONUS: Assert if the dropdown is in Alphabetical Order
     */
    WebDriver driver;
    @Before
    public void seturl  (){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void test01() {
        //Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        //Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
        WebElement firstSelectedOptionrstOption = select.getFirstSelectedOption();
        assertEquals("All Departments", firstSelectedOptionrstOption.getText());
    }
    @Test
    public void test02() {
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        //Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
        WebElement forthElement = ddwnElements.get(3);
        assertEquals("Amazon Devices", forthElement.getText());
    }
    @Test
    public void test03() {
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        //Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
        for (WebElement w : ddwnElements) {
            System.out.println(w.getText());
        }
    }
    @Test
    public void test04() {
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        //Print the the total number of options in the dropdown
        System.out.println(ddwnElements.size());
    }
    @Test
    public void test05() {
        // Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        boolean flag = false;
        for (WebElement w : ddwnElements) {
            w.getText().equals("Appliances");
            flag = true;
        }
        assertTrue(flag);
    }
    @Test
    public void test06() {
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(dropdown);
        List<WebElement> ddwnElements = select.getOptions();
        List<String> stringList = new ArrayList<>();
        //BONUS: Assert if the dropdown is in Alphabetical Order
            for (WebElement w : ddwnElements){
                stringList.add(w.getText());
            }
        List<String> sortedlist = stringList.stream().sorted().collect(Collectors.toList());
        assertTrue("list is not sorted",stringList.equals(sortedlist));
    }
    @After
    public void teardown(){
        driver.quit();
    }

    }










