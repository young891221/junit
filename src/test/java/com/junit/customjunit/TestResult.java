package com.junit.customjunit;

public class TestResult extends Object {
    protected int runTestSize;
    protected boolean isStop;

    public TestResult() {
        runTestSize = 0;
        isStop = false;
    }

    public synchronized void testStart() {
        this.runTestSize++;
    }

    public synchronized void setStop() {
        isStop = true;
    }
}
