


import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		// Take the screen shot and store as a file format
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		// now copy the screenshot to desired location using copyFile // method
		
	//	FileUtils.copyFile(src,new File("C:\\Users\\preeti\\Downloads\\google.png"));
		
		

	}

}
