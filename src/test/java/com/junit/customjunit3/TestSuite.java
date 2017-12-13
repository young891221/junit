package com.junit.customjunit3;

import com.junit.customjunit.TestResult;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test {
    private List<Test> lists;

    public TestSuite() {
        this.lists = new ArrayList<>();
    }

    @Override
    public void run(TestResult testResult) {
        lists.stream().forEach(test -> test.run(testResult));
    }

    public void addTest(Test test) {
        lists.add(test);
    }
}
