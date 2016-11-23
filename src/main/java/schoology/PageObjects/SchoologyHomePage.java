package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SchoologyHomePage {
	
	WebDriver driver;
	public static final By CORPORATE_BUTTON_LOC = By.id("corporate-body-home");

	public SchoologyHomePage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public void checkPageTitle() {
		Assert.assertTrue(driver.getTitle().contains("Schoology"));
	}
	
	public void clickCorporate(){
		driver.findElement(CORPORATE_BUTTON_LOC).click();
	}
}

