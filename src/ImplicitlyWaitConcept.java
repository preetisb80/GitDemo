import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		// Implicitly wait is dynamic wait
		/* Avoid using Thread.sleep(); as everytime the script will wait be forced to wait for 30 seconds even if 
		 * its not required.With implicitly wait if suppose we give 30 seconds wait time and the page loads in 5 seconds ,
		 * then it will ignore remaining 25 seconds and move to next line
		*/

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.spicejet.com");
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	}
	

}
