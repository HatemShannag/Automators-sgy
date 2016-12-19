package schoology.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventsPage {

	WebDriver driver;
	public EventsPage (WebDriver driver){
		this.driver = driver;
	}
	public static final By REGISTER_ALL_LOC = By.xpath("//a[contains(.,'Register Now')]");
	
	public boolean checkAssert(){
		if(driver.getCurrentUrl().contains("events")){
			System.out.println("Pass");
			return true;
		} else {
			System.out.println("fail");
			driver.getCurrentUrl();
			return false;
		}
	}
	public void assertRegisterNowButton(){
		try{
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(REGISTER_ALL_LOC));
			System.out.println("button is clickable");
		} catch (Exception ELEMENTNOTCLICKABLE){
			System.out.println("button not clickable");
		}
	}

}
