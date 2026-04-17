package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareerPage {

private  WebDriver driver;
	
	public  CareerPage(WebDriver driver) {
		this.driver=driver;	
		}
	
	
	private By trip=By.xpath("//span[contains(text(),'TenForce on Tour: Our Summer Road Trip Through Tex')]");
	private By life=By.xpath("//a[@class='toolbox-action h5 my-2 mr-4'][normalize-space()='Life at TenForce']");

	
	public void ClickLife() {
		waitForLocator(life,10);
		driver.findElement(life).click();
	}
	
	public String  getTrip() {
		waitForLocator(trip,10);
		return driver.findElement(trip).getText();
	}
	
	public  void waitForLocator(By locator, int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeOut));
	       wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}

	
	

}
