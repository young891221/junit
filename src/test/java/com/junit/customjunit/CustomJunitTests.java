package com.junit.customjunit;

public class CustomJunitTests {

	public static void main(String[] args) {
		TestCase.setUp();
		Assert.assertTrue(minusTest(), 6);
		TestCase.tearDown();
	}

	private static int minusTest() {
		return 9-3;
	}

}
