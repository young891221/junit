package com.junit.customjunit;

public class TestCaseSample extends TestCase {

    public TestCaseSample(String testName) {
        super.testName = testName;
    }

    public void test() {
        Assert.assertTrue(9-3, 6);
    }

    public static void main(String[] args) {
        TestResult testResult = new TestResult();
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new TestCaseSample("test"));
        testSuite.run(testResult);
        testResult.printTestCount();
    }
}
