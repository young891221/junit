package com.junit.customjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TestCase implements Test {
    private static final Logger logger = LoggerFactory.getLogger(TestCase.class);
    protected String testName;

    public static void setUp() {
        logger.info("setUp");
    }

    public static void tearDown() {
        logger.info("tearDown");
    }

    @Override
    public void run(TestResult testResult) {}
}
