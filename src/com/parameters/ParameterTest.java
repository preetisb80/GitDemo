package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class ParameterTest {

	WebDriver driver;
	
	@Test
	@Parameters({"env","browser","url","emailId"})
	public void yahooLoginTest(String env,String browser,String url,String emailId) {
		if (browser.equals("chrome")) 
		{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  // launch chrome
		}
		driver.get(url);
		
		
		driver.get("https://login.yahoo.com/");

		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId);	//enter the username
		
		driver.findElement(By.id("login-signin")).click();		//click on next
	}
	
	
	
}
