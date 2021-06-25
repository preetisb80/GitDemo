import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	// enter url
		
		driver.findElement(By.name("name3e1b3e39")).sendKeys("Anthony Hopkins");
		
		

		//Handle dropbox :
	//	Select select = new Select(driver.findElement(By.id("populatedCountryCodephonenumber")));
	//	select.selectByVisibleText("+92");
		
		// Handle ListBox
		
		//WebElement ListBox = driver.findElement(By.className("selected-dial-code")); 
	//	ListBox.sendKeys("+1");

	}

}
