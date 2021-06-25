import java.util.concurrent.TimeUnit;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
	
		driver.findElement(By.name("email")).sendKeys("preetisb80@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Bluesea123$");
		
		//driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		//To highlight login button--we will use JavaScriptExecutor
		
		
		//executeScript -- to execute JavaScript code
		WebElement loginBtn = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
				
		Thread.sleep(2000);
		flash(loginBtn,driver);			//highlight the element
		Thread.sleep(2000);
		drawBorder(loginBtn,driver);	//draw a border
		
	
		//take screenshot and store as a file format
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		//now copy the screenshot to desired location using copyFile method
		FileUtils.copyFile(src, new File("C:\\selenium_screenshot\\element.png"));
		
		Thread.sleep(2000);
		/*
		//generate alert
		
		generateAlert(driver,"There is an issue with login button on login page");
		
		*/
		
		//click on any element by using Javascript Executor
		clickElementByJS(loginBtn,driver);
		
		//Refresh Browser By Selenium:
		driver.navigate().refresh();
		
		//Refresh Browser by using Javascript Executor
		refreshBrowserByJS(driver);
		
		//get the title of the page by JS:
		System.out.println(getTitleByJS(driver));
		
		//get the page text:
		System.out.println(getPageInnerText(driver));
		
		//Scroll page down :
	//	scrollPageDown(driver);
		
		WebElement forgorPwdLink = driver.findElement(By.xpath	("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(forgorPwdLink,driver);
	}
	
	public static void flash(WebElement element,WebDriver driver)
	{
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i =0;i<10;i++)
		{
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}

	private static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try
		{
			Thread.sleep(20);
			
		} catch(InterruptedException e)
		{
			
		}
	}

	public static void drawBorder(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border = '3px solid red'", element);
		
	}
	
	public static void generateAlert(WebDriver driver,String message) 
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element,WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)").toString();
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
