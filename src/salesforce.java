import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class salesforce {


	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\eclipse-workspace\\SeleniumTesting\\src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	/*
		driver.get("https://login.salesforce.com/");	// enter url
		
		driver.findElement(By.id("username")).sendKeys("uname");
		driver.findElement(By.id("password")).sendKeys("pwd");

		driver.findElement(By.xpath("//*[@id = 'Login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		*/
		
		//driver.get("https://www.facebook.com/");
		/* xpath--
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("preetisb80@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'pass']")).sendKeys("Bluesea123$");
		driver.findElement(By.xpath("//button[@value = '1']")).click();
		
		*/
		
		//css selector--
		/*
		driver.findElement(By.cssSelector("input[id = 'email']")).sendKeys("preetisb80@gmail.com");
		driver.findElement(By.cssSelector("input[name = 'pass']")).sendKeys("Bluesea123$");
		driver.findElement(By.cssSelector("button[value = '1']")).click();
		*/
		/*
		driver.get("https://www.rediff.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.cssSelector("input#login1")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("pwd");
		
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		*/
		
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("userid")).sendKeys("preetis6581@gmail.com");
		driver.findElement(By.id("signin-continue-btn")).click();
		driver.findElement(By.id("pass")).sendKeys("pwd123$");
		driver.findElement(By.id("sgnBt")).click();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		data[0][0] = "restricteduser@mail.com";
		data[0][1] = "pass123";
		
		data[1][0] = "spamuser@mail.com";
		data[1][1] = "12333";
		
		data[2][0] ="preetis6581@gmail.com";
		data[2][1] = "pwd123$";
		
		return data;
	}

}
