package selfworking;

import com.myfirstproject.Utilites.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking extends TestBase {
    @Test
    public void bookingPage() throws InterruptedException {
        driver.get("https://www.booking.com/");
        driver.findElement(By.xpath("(//span[@class='bui-tab__text'])[2]")).click();
        driver.findElement(By.xpath("(//div[@class='css-1dgzenf-radio-input'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//table//tbody//tr[3]//td[4]")).click();
        driver.findElement(By.xpath("(//input[@class=\"css-g0pg3f-SearchboxInput\"])[1]")).click();
        driver.findElement(By.xpath("(//input[@class=\"css-g0pg3f-SearchboxInput\"])[1]")).sendKeys("ist");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//input[@class=\"css-bwf0ll\"])[3]")).click();


    }
}
