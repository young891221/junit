package com.junit.customjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCase {
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);

    public static void setUp() {
        logger.info("setUp");
    }

    public static void tearDown() {
        logger.info("tearDown");
    }
}
