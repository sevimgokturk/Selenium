package com.myfirstproject.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Day14_log4j {
    private static Logger logger = LogManager.getLogger(Day14_log4j.class.getName());
    @Test
    public void log4jDemo(){
        logger.info("info log");
        logger.debug("debug log");
        logger.error("error log");
        logger.fatal("fatal log");
        logger.warn("warn log");
    }
}

