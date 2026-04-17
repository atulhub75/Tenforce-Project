package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	public  HomePage(WebDriver driver) {
		this.driver=driver;	
		}
	
	
	private By about=By.xpath("(//span[@class='h4 is-dashed-b-b is-permalink relative'][normalize-space()='About Us'])[2]");
	private By career=By.xpath("(//a[@class='h4'][normalize-space()='Career'])[2]");

	
	
	
	public void  ClickAboutUs() {
		waitForLocator(about,10);
		driver.findElement(about).click();
	}
	
	public void  ClickonCareer() {
		
		driver.findElement(career).click();
	}
	
	public  void waitForLocator(By locator, int timeOut) {
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		       wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
