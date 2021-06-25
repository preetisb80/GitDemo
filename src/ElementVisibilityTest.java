import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		//isDisplayed() vs isEnabled() vs isSelected() 
		/* isDisplayed() is the method used to verify presence of a web element within the web page.The method returns "true" value if the specified web element is present on the web page and a "false" value if the web element is not present on the webpage
		 * is Diplayed() is capable to check the presence of all kinds of web elements available
		 * 
		 * isEnabled() is the method used to verify if the element is enabled or disabled within the webpage
		 * isEnabled() is primarily used for buttons
		 * 
		 * isSelected() is the method used to verify if the web element is selected or not
		 * isSelected() method is pre-dominantly used with radio buttons,check boxes and drop downs
		 * 
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		driver.get("https://register.freecrm.com/register/");	// enter url
				
		//1. isDisplayed() :applicable for all the elements:applicable only for checkbox,dropdown,radiobutton
		boolean b1 = driver.findElement(By.name("action")).isDisplayed();
		System.out.println(b1);		//true
		
		//2. is Enabled():
		boolean b2 = driver.findElement(By.name("action")).isEnabled();
		System.out.println(b2);		//true
		
		//3. isSelected():
		boolean b3 = driver.findElement(By.name("action")).isSelected();
		System.out.println(b3);
	}
}
