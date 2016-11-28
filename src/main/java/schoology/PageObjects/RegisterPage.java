package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	WebDriver driver;
	public static final By CLICK_STUDENT_LOC = By.xpath("//a[contains(.,'Student')]");
	public static final By ENTER_ACCESS_CODE_LOC = By.id("edit-code");
	public static final By CLICK_CONTINUE_LOC = By.id("edit-submit");
	public static final By FIRST_NAME_LOC = By.id("edit-name-first");
	public static final By LAST_NAME_LOC = By.id("edit-name-last");
	public static final By EMAIL_LOC = By.id("edit-login");
	public static final By PASSWORD_LOC = By.id("edit-pass-1");
	public static final By CONFIRM_PASSWORD_LOC = By.id("edit-pass-2");
	public static final By MONTH_LOC = By.id("edit-birthday-month");
	public static final By DAY_LOC = By.id("edit-birthday-day");
	public static final By YEAR_LOC = By.id("edit-birthday-year");
	public static final By REGISTER_LOC = By.id("edit-submit");
	
	public RegisterPage monthDropDown(String month){
		Select selectMonth = new Select(driver.findElement(MONTH_LOC));
		selectMonth.selectByVisibleText(month);
		return this;
	}
	
	public RegisterPage dayDropDown(String day){
		Select selectDay = new Select(driver.findElement(DAY_LOC));
		selectDay.selectByVisibleText(day);
		return this;
	}
	
	public RegisterPage yearDropDown(String year){
		Select selectYear = new Select(driver.findElement(YEAR_LOC));
		selectYear.selectByVisibleText(year);
		return this;
	}
	
	public RegisterPage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public RegisterPage clickStudent(){
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(CLICK_STUDENT_LOC)).click();
		return this;
	}
	
	public RegisterPage enterCode(String code){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(ENTER_ACCESS_CODE_LOC).sendKeys(code);
		return this;
	}
	
	public RegisterPage clickContinue(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(CLICK_CONTINUE_LOC).click();
		return this;
	}
	public RegisterPage enterFirstName(String firstName){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(FIRST_NAME_LOC).sendKeys(firstName);
		return this;
	}
	public RegisterPage enterLastName(String lastName){
		driver.findElement(LAST_NAME_LOC).sendKeys(lastName);
		return this;
	}
	public RegisterPage enterEmail(String email){
		driver.findElement(EMAIL_LOC).sendKeys(email);
		return this;
	}
	
	public RegisterPage enterPassword(String password){
		driver.findElement(PASSWORD_LOC).sendKeys(password);
		return this;
	}
	public RegisterPage reEnterPassword (String password){
		driver.findElement(CONFIRM_PASSWORD_LOC).sendKeys(password);
		return this;
	}
	public void assertRegister(){
		try{
			WebDriverWait wait = new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.elementToBeClickable(REGISTER_LOC));
			System.out.println("Register button is clickable");
		}	catch (Exception ButtonNotCickable){
			System.out.println("Register button NOT clickable");
		}
	}
}
