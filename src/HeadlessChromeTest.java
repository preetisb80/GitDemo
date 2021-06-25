import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessChromeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		//Thread.sleep(2000);
		System.out.println("Before login title is :"+driver.getTitle());		//before login--
		
		driver.findElement(By.name("email")).sendKeys("preetisb80@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Bluesea123$");
		
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).click();

	}

}
