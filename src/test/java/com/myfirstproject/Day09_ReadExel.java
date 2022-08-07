package com.myfirstproject;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day09_ReadExel {
    //    Import the apache poi dependency in your pom file
//    Create resources directory under java folder(right click on java and create the folder)
//    Add the Excel file on the resources' folder
//    Create a new package: excel_automation
//    Create a new class : ReadExcel
//    Create a new test method : readExcel()
//    Store the path of the  file in a string
//    Open the file
//    Open the workbook using fileinputstream

//    Go to first row
//    Go to first cell on that first row and print
//    Go to second cell on that first row and print
//    Go to 2nd row first cell  and assert if the data equal to the USA
//    Go to 3rd row 2nd cell-chain the row and cell
//    Find the number of row
//    Find the number of used row
//    Print country, capitol key value pairs as map object


    @Test
    public void readExcel() throws IOException {
        //    Store the path of the  file in a string
        String path = "./src/test/java/resources/Capitals.xlsx";
        //    Open the file
        FileInputStream fileInputStream = new FileInputStream(path);
        //Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //    Open the first worksheet
       // Sheet sheet1 =  workbook.getSheet("Sheet1");
        Sheet sheet1 =  workbook.getSheetAt(0);

        //    Go to first row
        Row row1 = sheet1.getRow(0);

        //    Go to first cell on that first row and print
        Cell cell1 = row1.getCell(0);
        System.out.println(cell1.toString().toLowerCase());// country

        //Go to second cell on that first row and print
        Cell cell2 = row1.getCell(1);
        System.out.println(cell2);//CAPITAL

        //    Go to 2nd row first cell  and assert if the data equal to the USA
        Cell cell21= sheet1.getRow(1).getCell(0);;
        Assert.assertEquals("USA",cell21.toString());

        //    Go to 3rd row 2nd cell-chain the row and cell
       String cell31 = sheet1.getRow(2).getCell(1).toString();
        System.out.println(cell31);


        //    Find the number of row
        int numberOfRows = sheet1.getPhysicalNumberOfRows();
        System.out.println(numberOfRows);


        //    Find the number of used row
        int numberOfUsedRows = sheet1.getLastRowNum();
        System.out.println(numberOfUsedRows);

        //    Print country, capitol key value pairs as map object
        Map<String,String> countriesAndCapitals = new HashMap<>();
        for (int rowNum=1; rowNum<numberOfRows; rowNum++){
            String countries = sheet1.getRow(rowNum).getCell(0).toString();
            System.out.print (countries+" - ");
            String capitals = sheet1.getRow(rowNum).getCell(1).toString();
            System.out.print(capitals+" - ");
            countriesAndCapitals.put(countries,capitals);
            System.out.println();
        }
        System.out.println(countriesAndCapitals);







    }
}
