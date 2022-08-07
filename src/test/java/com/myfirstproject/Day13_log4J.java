package com.myfirstproject;

import com.myfirstproject.Utilites.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

public class Day13_log4J extends TestBase {
    /*
     * 1.What is Log4J ?
     * Log4J is an API to log information on the console or in a file
     *
     * 2. How can we set up?
     * We will add 2 dependencies
     *
     * log4j - api
     * log4j - core
     * */
   private static Logger logger = LogManager.getLogger(Day13_log4J.class.getName());
    @Test
    public void Log4JTest(){
        logger.info("Opening the URL");
        driver.get("https://www.carettahotel.com");
        logger.info("Clicking Log in button");
        driver.findElement(By.partialLinkText("Log in")).click();
        logger.error("Error Log");
        logger.fatal("Fatal Log");
        logger.debug("Debug Log");
    }
}
