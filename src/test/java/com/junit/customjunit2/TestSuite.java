package com.junit.customjunit2;

import com.junit.customjunit.TestResult;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test {
    private List<Test> tests;

    public TestSuite() {
        tests = new ArrayList<>();
    }

    @Override
    public void run(TestResult testResult) {
        tests.stream().forEach(test -> test.run(testResult));
    }

    public void addTest(Test test) {
        tests.add(test);
    }
}
