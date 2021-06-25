import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		driver.get("https://html.com/input-type-file/");	// enter url
		
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\preeti\\Downloads\\extent.html");
	}

}
