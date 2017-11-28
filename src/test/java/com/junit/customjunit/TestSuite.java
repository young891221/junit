package com.junit.customjunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test{
    private List<Test> testElements;

    public TestSuite() {
        testElements = new ArrayList<>();
    }

    @Override
    public void run(TestResult testResult) {
        while(testElements.isEmpty()) {
            Test test = testElements.remove(0);
            test.run(testResult);
        }
    }

    void addTest(Test test) {
        testElements.add(test);
    }
}
