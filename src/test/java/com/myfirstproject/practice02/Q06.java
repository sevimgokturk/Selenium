package com.myfirstproject.practice02;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Q06 extends TestBase {
    @Test
    public void name() {
        ///Users/osmangok/IdeaProjects/apiApril2022/pom.xml
        String path = System.getProperty("user.home")+ "/IdeaProjects/apiApril2022/pom.xml";
        //String path = "//Users/osmangok/IdeaProjects/apiApril2022/pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
