package com.junit.customjunit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestResult extends Object {
    private static final Logger logger = LoggerFactory.getLogger(TestResult.class);

    protected int testCount;
    protected boolean isStop;

    public TestResult() {
        testCount = 0;
        isStop = false;
    }

    public synchronized void testStart() {
        this.testCount++;
    }

    public synchronized void setStop() {
        isStop = true;
    }

    public void printTestCount() {
        logger.info("Test Count = " + String.valueOf(testCount));
    }
}
