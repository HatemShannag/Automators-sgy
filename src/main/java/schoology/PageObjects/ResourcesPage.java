package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ResourcesPage {

	WebDriver driver;
	public static final By RESOURCES_CHECK_BOX = By.xpath("//label[contains(.,'Research')]");
	public static final By ASSERT_FILTER_RESULTS_LOC = By.linkText("Schoology Named Editor's Choice by PC Mag!");
	
	public ResourcesPage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Assert.assertTrue(checkAssert());
	}
	
	public boolean checkAssert(){
		if (driver.getCurrentUrl().contains("resources")){
			System.out.println("Resources Page Successfully Loaded");
			return true;
		} else{
			System.out.println(driver.getCurrentUrl());
			System.out.println("Page did not load successfully");
			return false;
		}
	}
	
	public ResourcesPage clickCheckBox(){
		driver.findElement(RESOURCES_CHECK_BOX).click();
		return this;
	}
	public void AssertResearchFilter(){
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);	
		wait.until(ExpectedConditions.elementToBeClickable(ASSERT_FILTER_RESULTS_LOC));
		System.out.println("Filtered by Research Results");
		} catch (Exception NotFiltered) {
			System.out.println("NOT Filtered by Research Results");
		}
}

}