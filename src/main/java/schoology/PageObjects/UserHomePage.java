package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class UserHomePage {
	
	WebDriver driver;
	public static final By COURSE_LOC = By.xpath("//a[contains(.,'Courses')]"); 
	public static final By JOIN_LOC = By.xpath("//a[contains(.,'Join')]");
	public static final By ACCESS_CODE_LOC = By.id("edit-invite-code");
	public static final By ASSERT_JOIN_LOC = By.id("edit-submit");
	
	public UserHomePage (WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		Assert.assertTrue(checkAssertPage());
	}
	
	public UserHomePage enterAccessCode(String accessCode){
		driver.findElement(ACCESS_CODE_LOC).sendKeys(accessCode);
		return this;
	}
	
	public void assertJoin(){
		try{
			WebDriverWait wait = new WebDriverWait(driver,15);
			wait.until(ExpectedConditions.elementToBeClickable(ASSERT_JOIN_LOC));
			System.out.println("Join button is clickable");
		} catch (Exception ButtonNotClickable){
			System.out.println("Join button is NOT clickable");
		}
	}
	
	public UserHomePage clickCourses(){
		driver.findElement(COURSE_LOC).click();
		return this;
	}
	
	public UserHomePage clickJoin(){
		driver.findElement(JOIN_LOC).click();
		return this;
	}
	
	public boolean checkAssertPage(){
		if(driver.getCurrentUrl().contains("home")){
			System.out.println("User is on Home Page");
			return true;
		} else{
			System.out.println("User is not on Home Page");
			System.out.println(driver.getCurrentUrl());
			return false;
		}
	}

}
