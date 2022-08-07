package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Scanner;

public class Day10Webtables extends TestBase {
    /*
    https://the-internet.herokuapp.com/tables
    Create a class: Day10_WebTables
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
    public void test1() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 1 : Print the entire table
        String table = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(table);
        List<WebElement> tableData= driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachData : tableData){
            System.out.print(eachData.getText());
        }
        System.out.println();
        List<WebElement> tableHeader= driver.findElements(By.xpath("//table[@id='table1']//th"));
        for (WebElement eachHeder : tableHeader){
            System.out.println(eachHeder.getText());
        }
        System.out.println();
    }

    @Test
    public void test2() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 2 : Print All Rows including headers
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        for (WebElement each : allRows){
            System.out.println(each.getText());
        }
        //driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[4]//td[5]"));

    }

    @Test
    public void test3() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 3 : Print Last row data only
        //driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[4]"));
        driver.findElement(By.xpath("//table[@id='table1']//tbody//tr[last()]//td[last()]"));
    }

    @Test
    public void test4() {
        driver.get("https://the-internet.herokuapp.com/tables");
        //Task 4 : Print column 5 data in the table body
        driver.findElement(By.xpath("//table[@id='table1']//tbody//tr//td[last()-1]"));

    }


    public void test5(String row, String column ) {
        driver.get("https://the-internet.herokuapp.com/tables");

        //Task 5 : Write a method that accepts 2 parameters
        //Parameter 1 = row number
        //Parameter 2 = column number
        //printData(2,3);  => prints data in 2nd row 3rd column
        //String path = "//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
        String path ="//table[@id='table1']//tbody//tr["+row+"]//td["+column+"]";
        String element = driver.findElement(By.xpath(path)).getText();
        System.out.println(element);
    }
}
