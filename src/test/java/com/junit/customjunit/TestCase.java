package com.junit.customjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

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
    public void run(TestResult testResult) {
        setUp();
        testResult.testStart();
        testStartByReflection(testResult);
        tearDown();
    }

    private void testStartByReflection(TestResult testResult) {
        try {
            Method method = this.getClass().getMethod(testName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            testResult.setStop();
            e.printStackTrace();
        }
    }
}
