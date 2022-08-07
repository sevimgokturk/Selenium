package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class path {
    /*
    Create a class:FileDownloadTest
downloadTest()
In the downloadTest() method, do the following test:
Go to https://the-internet.herokuapp.com/download
Download flower.png file
Then verify if the file downloaded successfully
     */
    @Test
    public void testPath(){
        //String path = "C://Users/osmangok/Desktop/coordinats.docx";
        //String path = "C:\\Users\\osmangok\\Desktop\\coordinats.docx";
        //String path = "C:\\Users\osmangok\Desktop\coordinats.docx";
        //String path = "//Users/osmangok/Desktop/coordinats.docx";
        String path = "//Users/osmangok/Desktop/coordinats.docx";
        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
