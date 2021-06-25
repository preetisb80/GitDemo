import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");	// enter url
		
		//absolute xpath : not recommended
		//1.performance issues 
		//2.not reliable
		//3. can be changed anytime in future
		
		//driver.switchTo().frame("mainpanel");  //if frames are present
		
		//xpath using class locator
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");

		//xpath using id locator		
	//	driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Python");
		
		//xpath using contains keyword
		
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
	
		/*
		//How to handle dynamic id :use contains keyword,starts-with,ends-with
		
		//id = test_123
		//By.id (test_123)
		 
		 //starts-with
		//id = test_456
		//id = test_789
		//id = test_test_7890_test
		  
		 //ends-with
		//id = 1234_test_t
		//id = 23456_test_t
		//id = 6789_test_t
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendkeys("Test");	
		  
		//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendkeys("Test");	
		   
		//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendkeys("Test");	
		  
		*/
		
		//custom xpath : for links
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
			
			

	}

}
