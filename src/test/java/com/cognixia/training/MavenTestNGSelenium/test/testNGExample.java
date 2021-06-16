package com.cognixia.training.MavenTestNGSelenium.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGExample {
	
	@Test
	public void testFirst() {
		System.out.println("Inside Test First: ");
	}
	@BeforeTest
	public void setup() {
		System.out.println("Inside Setup :");
	}
	@AfterTest
	public void teardown() {
		System.out.println("Inside teardown :");
	}
	@Test
	public void testSecond() {
		System.out.println("Inside Test Second: ");
	}
}
