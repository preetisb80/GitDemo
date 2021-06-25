import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\preeti\\eclipse-workspace\\SeleniumTesting\\src\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		//System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		//https://book.spicejet.com/Register.aspx
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\preeti\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();  // launch chrome
			driver.get(url);
			
			driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
			driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		}
		else if (browserName.equals("Firefox"))
		{
			//
		}
		else
		{
			//Internet Explorer
		}
		
		
	}
	

}
