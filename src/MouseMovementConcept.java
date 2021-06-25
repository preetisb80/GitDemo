import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\eclipse-workspace\\SeleniumTesting\\src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  // launch chrome
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		/*
		 * driver.get("http://www.spicejet.com");
		 * 
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().
		 * perform();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * driver.findElement(By.linkText("Student Discount")).click();
		 */
		
		
		
		/*
		 * driver.get("https://www.ebay.com/");
		 * driver.findElement(By.linkText("Sign in")).click();
		 * driver.findElement(By.id("userid")).sendKeys("amytesting21@gmail.com");
		 * driver.findElement(By.id("signin-continue-btn")).click();
		 * driver.findElement(By.id("pass")).sendKeys("pwd123$");
		 * driver.findElement(By.id("sgnBt")).click();
		 */
		
		driver.get("https://www.amazon.com/");
	
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("amytesting21@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("pwd123$");
		driver.findElement(By.id("signInSubmit")).click();
		
		  Actions actions = new Actions(driver);
		  actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		  Thread.sleep(3000);
		  driver.findElement(By.linkText("Account")).click();
		  
		  driver.findElement(By.linkText("Your addresses")).click();
		  
		  //again re-enter password
		  
		/*
		 * driver.findElement(By.id("ap_password")).sendKeys("pwd123$");
		 * driver.findElement(By.id("signInSubmit")).click();
		 */
		  
		  driver.findElement(By.linkText("Add Address")).click();
		  
		  driver.findElement(By.id("ya-myab-address-add-link")).click();
		  
		 
		
	  
		//  driver.quit();
		
	}

}
