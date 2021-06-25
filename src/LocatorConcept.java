import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		driver.get("https://phptravels.org/register.php");	// enter url
		
		//driver.get("https://book.spicejet.com/Register.aspx");

		//1. xPath:
		
		//2. id:
		
		driver.findElement(By.id("inputFirstName")).sendKeys("Tom");
		driver.findElement(By.id("inputLastName")).sendKeys("Alter");
		
		//3. name:
		driver.findElement(By.name("email")).sendKeys("abc_123@gogle.com");
		
		
		//4. linkText:
		
		//5. partialLinktext:
		
		//6: CSSSelector:
		
		driver.findElement(By.cssSelector("#address1")).sendKeys("anthony hopkins");
		
		//7. className:
		
		//8. 
		
		//driver.quit();
	}

}
