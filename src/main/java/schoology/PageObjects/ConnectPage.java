package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectPage {

	WebDriver driver;
	
	public ConnectPage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}
	
	public static final By EVENTS_LOC = By.xpath("//a[contains(@class,'icon-events')]");
	public static final By ALL_EVENTS_LOC = By.xpath("//a[contains(.,'All Events')]");
	
	public ConnectPage clickEvents(){
		driver.findElement(EVENTS_LOC).click();
		return this;
	}
	
	public void tryingSomethingOut(){
		//trying something out with git
	}
	
	@SuppressWarnings("deprecation")
	public EventsPage clickAllEvents(){
		WebElement element = driver.findElement(By.xpath("//a[contains(.,'All Events')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(element).pause(4000).click().build().perform();
		return new EventsPage(driver);
	}
}
