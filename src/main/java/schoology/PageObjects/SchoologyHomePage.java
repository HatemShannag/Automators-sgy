package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SchoologyHomePage {
	
	WebDriver driver;

	public SchoologyHomePage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public void checkPageTitle() {
		Assert.assertTrue(driver.getTitle().contains("Schoology"));
	}
}

