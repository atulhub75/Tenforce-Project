package testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.CareerPage;
import pages.HomePage;

public class HomeTest extends BaseClass {
	
	public HomePage ts;
	public CareerPage hp;

	String actualtext="TenForce on Tour: Our Summer Road Trip Through Texas & Louisiana's EHS Events";
	
	
	@Test
	public void homePageTest() {
		ts=new HomePage(driver);
		ts.ClickAboutUs();
		ts.ClickonCareer();
		
		hp=new CareerPage(driver);
		hp.ClickLife();
		String text=hp.getTrip();
		Assert.assertEquals(actualtext, text);
		
	}
	
}
