import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.get("https://www.ebay.com/");	// enter url
		
		driver.get("https://www.facebook.com/");	// enter url
		
		
		//1. Get the total number of links in the page
		//2. Get the text of each link on the page
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
	
		//size of linkList:
		System.out.println(linkList.size());
		
		//print text of each link on the page
		
		for(int i = 0;i<linkList.size();i++)
		{
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}
	}

}
