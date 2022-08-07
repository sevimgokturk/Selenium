package com.myfirstproject.Utilites;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public abstract class TestBase {
    // this class has repeated preconditions and repeated post-conditions
    // @with before and @after method
    // this class should be abstract class because wa only want to implement in this class
    // where do you use abstraction in java? ==> TestBase class
    protected static WebDriver driver;

    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
        //Set the path => creates a reports folder under the test-output folder
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/report/"+currentDate+"test_report.html";

//        Create extentHtmlReporter and set the path inside it
        extentHtmlReporter = new ExtentHtmlReporter(path);

//        Create extent report
        extentReports = new ExtentReports();

//        Add custom information
        extentReports.setSystemInfo("Environment","Test Environment");
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Application","Techproed");
        extentReports.setSystemInfo("SQA","John");

        extentHtmlReporter.config().setDocumentTitle("Techproed QA's");
        extentHtmlReporter.config().setReportName("Techproed Extent Report");

//        attach html and extent reports
        extentReports.attachReporter(extentHtmlReporter);

//        Report is completed. We need to create test using extentTest object
        extentTest = extentReports.createTest("My Project Extent Reports","This is a report for smoke test");

    }
    @After
    public void tearDown(){
       // driver.quit();
        //Generate and end our report
        extentReports.flush();
    }
    //create a method for checking checkbox
    public static void selectCheckBox(WebElement checkBoxElement, boolean isChecked){
        if (isChecked) {
            if(!checkBoxElement.isSelected()){
                checkBoxElement.click();
            }
            }else {
            if(checkBoxElement.isSelected()){
                checkBoxElement.click();
            }
        }
    }


    public static void switchToTargetWindow(String targetTitle) {
        for (String handle : driver.getWindowHandles()) {
            String title = driver.switchTo().window(handle).getTitle();
            if (title.equals(targetTitle)) {
                System.out.println("Page found : "+driver.getTitle());
                return;
            }
        }
    }

    public void takeScreenShot() throws IOException {
//        1.Taking screenshot using getScreenshotAs()
        File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//       Alternative Way
//       TakesScreenshot ts = (TakesScreenshot)driver;
//       File iamge = ts.getScreenshotAs(OutputType.FILE);

//      2. We will save the image this path. We used currentDate to be able to get unique names each time.
        String currentDate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path = System.getProperty("user.dir")+"/test-output/Screenshots/"+currentDate+"test-image.png";
        File finalPath = new File(path);

        FileUtils.copyFile(img,finalPath); // source, destination
    }
    //scroll a specific element
    public void scrollIntoViewByJS(WebElement webElement){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",webElement);
    }

    public void scrollAllDownByJS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollAllUpByJS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    public void clickByJS(WebElement webElement){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", webElement);
    }

    // Set the value of an input using js executor. element  date field,   text 5/29/2022
    //this method change the value of attributed of an element.
    //it chages the input
    public void setValueByJS(WebElement element, String text){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('value','"+text+"')",element);
    }

    //    get the value of an input. param : idOfElement
    public void getValueByJS(String idOfElement){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String value = js.executeScript("return document.getElementById('"+idOfElement+"').value").toString();
        System.out.println(value);
        //        How you get get the value of an input box?
        //        We can js executor.
        //        How?
        //        I can get the element using js executor, and get teh value of the element.
        //        For example, I can get the element by id, and use value attribute to get the value of in an input
        //        I have to do this, cause getText in this case does not return teh text in an input
    }


    //    Changes the changeBackgroundColorByJS of an element. Params: WebElement element, String color
    public void changeBackgroundColorByJS(WebElement element, String color){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
    }

    public void addBorderWithJS(WebElement element, String borderStyle){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='"+borderStyle+"'",element);
    }






}
