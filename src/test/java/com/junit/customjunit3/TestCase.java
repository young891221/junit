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
        try {
            Method method = this.getClass().getMethod(testName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            testResult.setStop();
        }
    }
}
