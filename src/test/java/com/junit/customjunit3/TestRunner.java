package com.junit.customjunit3;

import com.junit.customjunit.TestResult;

public class TestRunner extends TestCase {

    public TestRunner(String testName) {
        super(testName);
    }

    private static boolean assertInt(int x, int y) {
        return x == y;
    }

    public void test1() { //리플렉션 private은 안되넹...
        System.out.println(assertInt(2, 3-1));
    }

    public void test2() {
        System.out.println(assertInt(2, 4-1));
    }

    public static void main(String[] args) {
        TestResult testResult = new TestResult();
        TestSuite testSuite = new TestSuite();

        testSuite.addTest(new TestRunner("test1"));
        testSuite.addTest(new TestRunner("test2"));

        testSuite.run(testResult);
        testResult.printTestCount();
    }
}
