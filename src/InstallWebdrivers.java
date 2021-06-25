import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstallWebdrivers {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		driver.get("http://www.google.com");	// enter url
		
		String title = driver.getTitle();
		
		if(title.equals("Google")) 
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
	}
	
}
