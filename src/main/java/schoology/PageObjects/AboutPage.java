package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutPage {
	
	WebDriver driver;
	public AboutPage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	}
	
	public static final By CONTACT_TAB_LOC = By.xpath("//a[contains(@class,'contact')]");
	public static final By DROP_DOWN_LOC = By.id("contactFormStart");
	public static final By FIRST_NAME_LOC = By.id("FirstName");
	public static final By LAST_NAME_LOC = By.id("LastName");
	public static final By EMAIL_LOC = By.id("Email");
	public static final By PHONE_NUMBER_LOC = By.id("Phone");
	public static final By INSTITUTION_LOC = By.id("Company");
	public static final By JOB_TITLE_LOC = By.id("Title");
	public static final By SUBMIT_BUTTON_LOC = By.xpath("//button[contains(.,'Submit')]");
	
	public void assertSubmitButton(){
		try{
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(SUBMIT_BUTTON_LOC));
		System.out.println("Submit Button is Clickable");
			} catch (Exception ButtonNotClickable){
			System.out.println("Submit Button is NOT Clickable");
			}
	}
	
	public AboutPage enterJobTitle(String jobTitle){
		driver.findElement(JOB_TITLE_LOC).sendKeys(jobTitle);
		return this;
	}
	
	public AboutPage enterInstitution(String institution){
		driver.findElement(INSTITUTION_LOC).sendKeys(institution);
		return this;
	}
	
	public AboutPage enterPhoneNumber(String number){
		driver.findElement(PHONE_NUMBER_LOC).sendKeys(number);
		return this;
	}
	
	public AboutPage enterEmail(String email){
		driver.findElement(EMAIL_LOC).sendKeys(email);
		return this;
	}
	
	public AboutPage enterLastName(String lastName){
		driver.findElement(LAST_NAME_LOC).sendKeys(lastName);
		return this;
	}
	
	public AboutPage enterFirstName(String firstName){
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_NAME_LOC)).sendKeys(firstName);
		return this;
	}
	
	public AboutPage clickContact(){
		driver.findElement(CONTACT_TAB_LOC).click();
		return this;
	}
	public AboutPage dropDownBox(String mediaInquiry){
		Select select = new Select(driver.findElement(DROP_DOWN_LOC));
		select.selectByVisibleText(mediaInquiry);
		return this;
	}
}
