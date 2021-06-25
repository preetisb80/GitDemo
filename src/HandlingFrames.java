import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		//driver.get("https://classic.freecrm.com/index.html?e=1");	// enter url

		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("preetisb2804@gmail.com");
		driver.findElement(By.name("password")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click(); 
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame("mainpanel"); // switchto().frame("")  brings control to that particular frame if frames are used
		// switchTo().frame("") can use int value or string value
		
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/span")).click();
		
		
	}

}
