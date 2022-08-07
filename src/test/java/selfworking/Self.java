package selfworking;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;

public class Self extends TestBase {

    /*
https://the-internet.herokuapp.com/tables
Create a class: Day10_WebTables
Work on Table 1 (Example 1)
Task 1 : Print the entire table
Task 2 : Print All Rows
Task 3 : Print Last row data only
Task 4 : Print column 5 data in the table body
Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
*/
    @Test
    public void printeTable(){
        driver.get("https://the-internet.herokuapp.com/tables");
//      Task 1 : Print the entire table
        System.out.println("*******Print Table***********");
        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());
        System.out.println();
        System.out.println("*********Print Table Data*********");
        List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for(WebElement eachData : tableData){
            System.out.println(eachData.getText());
        }
        System.out.println();
        System.out.println("****** Print Table Header *****");
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        for(WebElement each : headers){
            System.out.println(each.getText());
        }
    }
    @Test
    public void getRows(){
//       Task 2 : Print All Rows (including header)
        driver.get("https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr")); ////table[@id='table1']//tbody//tr
        System.out.println("****** Print Rows ********");
        for(WebElement each : allRows){
            System.out.println(each.getText());
        }
    }
    @Test
    public void getLastRow(){
//       Task 3 : Print Last row data only
        driver.get("https://the-internet.herokuapp.com/tables");
        WebElement lastRow = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]"));
        System.out.println(lastRow.getText());
    }

    public void test(int row, int column) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/tables");
        Thread.sleep(2000);
        String path ="//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
        String element = driver.findElement(By.xpath(path)).getText();
        System.out.println(element);
    }

    public void test(int row, int column, String table) throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/tables");
        Thread.sleep(2000);
        String path ="//table[@id='"+table+"']//tbody//tr["+row+"]//td["+column+"]";
        String element = driver.findElement(By.xpath(path)).getText();
        System.out.println(element);
    }

    @Test
    public void callTest() throws InterruptedException {
        test(2,3);
        test(2,3,"table2");
    }
}
