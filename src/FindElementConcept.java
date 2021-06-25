import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");	// enter url
		
		// How to get the total count of links on the page?
		// How to get the text of each link on the page?
		
		// all the links are represented by <a> html tag
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		// size of linkList:
		System.out.println(linkList.size());
		
		// Print the text of each link on the page
		for(int i =0;i<linkList.size();i++)
		{
			String linkText = linkList.get(i).getText();
			System.out.println(linkText);
		}

	}

}
