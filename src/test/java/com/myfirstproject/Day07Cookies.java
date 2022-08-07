package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Day07Cookies extends TestBase {

    //        Class: Day07_Cookies
    //        Method: handleCookies
    //                -Go to amazon and automate the tasks:
    //        1. Find the total number of cookies
    //        2. Print all the cookies
    //        3. Get the cookies by their name
    //        4. Add new cookie
    //        5. Delete cookie by name
    //        6. Delete all the cookies

    @Test
    public void handleCookies(){
        driver.get("https://www.amazon.com/");
        //1. Find the total number of cookies
        Set<Cookie> allcookies =driver.manage().getCookies();
        int numberOfCookies= allcookies.size();
        System.out.println(numberOfCookies);

        //        2. Print all the cookies
        for (Cookie w : allcookies){
            System.out.println(w);
            System.out.println(w.getName());
            System.out.println(w.getValue());
            System.out.println("===========");
        }
        driver.manage().getCookieNamed("i18n-prefs");

        Cookie mycookie = new Cookie("my favorite cookie","Chocolate");
        driver.manage().addCookie(mycookie);
        Set<Cookie> updateCookies = driver.manage().getCookies();
        System.out.println(updateCookies.size());

        driver.manage().deleteCookieNamed("session-id");
        Set<Cookie> updateCookies2 = driver.manage().getCookies();
        System.out.println(updateCookies2.size());

        driver.manage().deleteAllCookies();
        Set<Cookie> updateCookies3 = driver.manage().getCookies();
        System.out.println(updateCookies3.size());





    }
}
