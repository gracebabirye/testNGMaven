package com.maven.testNGMaven;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNgMavenExampleTest {

	@Test
	public void exampleOfTestNgMaven() {
		System.out.println("This is TestNG-Maven Example");
	}

	@Test
	public void testAdd() {
		String str = "TestNG is working fine";
		assertEquals("TestNG is working fine", str);
	}

	@Test
	public void LoginTest() {
		System.out.println("Successfully Logged In");
	}

	@Test
	public void LogoutTest() {
		System.out.println("Successfully Logged Out");
	}
	
	@Test(priority = 2) // Second Highest Priority
	   public void a_test() {
	 }
	@Test(priority = 3) // Lowest Priority
	   public void c_test() {
	}
	 
	@Test(priority = 1) // Highest Priority
	   public void b_test() {
	}

}