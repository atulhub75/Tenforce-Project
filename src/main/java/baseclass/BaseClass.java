package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeTest
	public  void Setup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		driver =new ChromeDriver(options); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.tenforce.com/");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();	}

}
