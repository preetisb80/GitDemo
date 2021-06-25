package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	/*
@BeforeSuite--Setup system property for chrome browser
@BeforeTest--Launch chrome browser
@BeforeClass--Login to App
@BeforeMethod--Enter the url
@Test--Google title test
@AfterMethod--Log out from app
@BeforeMethod--Enter the url
@Test--Search Test
@AfterMethod--Log out from app
@AfterClass--Close Browser
@AfterTest--Delete all cookies
PASSED: GoogleTitleTest==Generate Report
	*/
	
	//Pre-conditions--starting with @Before
	
	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite--Setup system property for chrome browser");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launch chrome browser");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass--Login to App");
	
	
	}
	
	/*
	 * @BeforeMethod
	 * @Test-1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test-2
	 * @AfterMethod
	 */
	
	@BeforeMethod
	public void enterUrl() {
	System.out.println("@BeforeMethod--Enter the url");	
	}
	
	//Test cases--starting with @Test annotations
	
	@Test
	public void GoogleTitleTest() {
		System.out.println("@Test--Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test--Search Test");
	}
	
	//Post Conditions--starting with @After Annotations
			
	@AfterMethod
	public void logOut() {
		System.out.println("@AfterMethod--Log out from app");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest--Delete all cookies");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass--Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite--Generate Test Report");
	}

}
