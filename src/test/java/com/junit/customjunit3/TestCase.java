package com.junit.customjunit3;

import com.junit.customjunit.TestResult;

import java.lang.reflect.Method;

public abstract class TestCase implements Test {
    protected String testName;

    public TestCase(String testName) {
        this.testName = testName;
    }

    @Override
    public void run(TestResult testResult) {
        testResult.testStart();
        setUp();
        try {
            Method method = this.getClass().getMethod(testName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            tearDown();
            testResult.setStop();
        }
    }

    private void setUp() {
        System.out.println("setUp");
    }

    private void tearDown() {
        System.out.println("tearDown");
    }
}
