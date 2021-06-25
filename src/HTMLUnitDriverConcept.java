import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws Exception {
		
		//www.freecrm.com
		//username:preetisb2804@gmail.com
		//password: test@123
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//HtmlUnitDriver is not available in Selenium 3.x version
		//Download HtmlUnitDriver jar files
		
		//Advantages:
		//1. Testing is happening behind the scenes--no web browser launched
		//2. Very fast--execution of test cases-- very fast--performance of script
		
		//Disadvantages:
		//Not suitable for Actions class--user actions--mousemovement,double click,drag and drop
		
		//Also called ghost driver--Headless Browser
		//HtmlUnitDriver--Java
		//PhantomJS--JavaScript
		
		
		
		//WebDriver driver = new ChromeDriver();  // launch chrome
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://ui.cogmento.com/");	// enter url
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		System.out.println("Before login title is :"+driver.getTitle());		//before login--
		
		driver.findElement(By.name("email")).sendKeys("preetisb80@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Bluesea123$");
		
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();
		
		Thread.sleep(2000);
		System.out.println("After login title is:"+driver.getTitle());		//after login--
				
				
		//*[@id="ui"]/div/div/form/div/div[3]
		//xpath ://input[@name="email"]
	}

}
