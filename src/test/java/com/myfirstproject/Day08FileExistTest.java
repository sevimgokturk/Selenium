package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Day08FileExistTest {
    /*
    Class: FileExistTest
Method: isExist
Pick a file on your desktop
And verify if that file exist on your computer or not
     */
    @Test
    public void isExist(){
        //String path= "/Users/osmangok/Desktop/coordinats.docx";
        String path = System.getProperty("user.home")+"/Desktop/coordinats.docx";
        //String path= "/Users/osmangok/Desktop/coordinats.docx";
        boolean isFileExist = Files.exists(Paths.get(path));
        Assert.assertTrue(isFileExist);

    }


}
