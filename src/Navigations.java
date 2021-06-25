import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		// back and forward button simulation:
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();  // to navigate forward 
		
		Thread.sleep(5000);
		
		driver.navigate().back();		// to navigate backward
		
		driver.navigate().refresh();	// to refresh the web page
		
		

	}

}
