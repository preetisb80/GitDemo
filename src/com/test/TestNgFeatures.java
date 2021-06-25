package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test
	public void logintest() {
		System.out.println("Login Test");
	//	int i = 9/0;		//to fail the login page
	}
	
	@Test(dependsOnMethods = "logintest")		//if LoginTest() fails then this method will also fail
	public void HomePageTest() {
		System.out.println("home Page test");
	}

	@Test(dependsOnMethods = "logintest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	
	@Test(dependsOnMethods = "logintest")
	public void RegPageTest() {
		System.out.println("Registration Page Test");
	}
	
	
	
}
