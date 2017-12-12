package com.junit.customjunit2;

import com.junit.customjunit.TestResult;

public class TestRunner extends TestCase {

    public TestRunner(String fName) {
        super(fName);
    }

    public void test1() {
        System.out.println(assertThat(1, 3-1));
    }

    public void test2() {
        System.out.println(assertThat(1, 2-1));
    }

    public boolean assertThat(int target1, int target2) {
        return target1 == target2;
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
