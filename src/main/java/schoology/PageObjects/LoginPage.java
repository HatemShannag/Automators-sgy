package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	public static final By EMIAL_LOC = By.id("edit-mail");
	public static final By PASSWORD_LOC = By.id("edit-pass");
	public static final By LOGIN_LOC = By.id("edit-submit");
	
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public LoginPage enterEmail(String email){
		driver.findElement(EMIAL_LOC).sendKeys(email);
		return this;
	}
	public LoginPage enterPassword(String password){
		driver.findElement(PASSWORD_LOC).sendKeys(password);
		return this;
	}
	public UserHomePage clickLogin(){
		driver.findElement(LOGIN_LOC).click();
		return new UserHomePage(driver);
	}
	
}
