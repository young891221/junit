package com.junit.customjunit;

import java.lang.reflect.Method;

public class TestCaseSample extends TestCase {

    public TestCaseSample(String testName) {
        super.testName = testName;
    }

    @Override
    public void run(TestResult testResult) {
        super.setUp();
        try {
            Method method = this.getClass().getMethod(super.testName, null);
            method.invoke(this, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.tearDown();
    }

    public void test() {
        Assert.assertTrue(9-3, 6);
    }

    public static void main(String[] args) {
        new TestCaseSample("test").run(new TestResult());
    }
}
