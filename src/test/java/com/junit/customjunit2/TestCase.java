package com.junit.customjunit2;

import com.junit.customjunit.TestResult;

import java.lang.reflect.Method;

public abstract class TestCase implements Test {
    protected static String fName;

    public TestCase(String fName) {
        this.fName = fName;
    }

    @Override
    public void run(TestResult testResult) {
        testResult.testStart();
        this.setUp();
        try {
            Method method = this.getClass().getMethod(this.fName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.tearDown();
        testResult.setStop();
    }

    public void setUp() {
        System.out.println("setUp");
    }

    public void tearDown() {
        System.out.println("tearDown");
    }

}
