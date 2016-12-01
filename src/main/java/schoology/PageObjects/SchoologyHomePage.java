package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class SchoologyHomePage {

	WebDriver driver;
	public static final By CORPORATE_LOC = 	By.id("corporate-body-home");
	public static final By RESOURCES_TAB_LOC = By.id("resources-header");
	public static final By SIGN_UP_TAB_LOC = By.id("signup-header");
	public static final By LOG_IN_TAB_LOC = By.id("login-header");
	public static final By BLOG_TAB_LOC = By.id("blog-header");
	public static final By ABOUT_TAB_LOC = By.id("about-header");
		
	public SchoologyHomePage (WebDriver driver){
	this.driver = driver;
	
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	Assert.assertTrue(checkAssert());
	}
	
	public AboutPage clickAbout(){
		driver.findElement(ABOUT_TAB_LOC).click();
		return new AboutPage(driver);
	}
	
	public BlogPage clickBlog(){
		driver.findElement(BLOG_TAB_LOC).click();
		return new BlogPage(driver);
	}
	
	public LoginPage clickLogIn(){
		driver.findElement(LOG_IN_TAB_LOC).click();
		return new LoginPage(driver);
	}
	
	public RegisterPage clickSignUp(){
		driver.findElement(SIGN_UP_TAB_LOC).click();
		return new RegisterPage(driver);
	}
	
	public CorporatePage clickCorporate(){
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(CORPORATE_LOC).click();
		return new CorporatePage(driver);
	}
	
	public ResourcesPage clickResources(){
		driver.findElement(RESOURCES_TAB_LOC).click();
		return new ResourcesPage(driver);
	}

	public boolean checkAssert(){
		if(driver.getCurrentUrl().contains("schoology")){
			System.out.println("SchoologyHomePagePassed");
			return true;
		} else{
			System.out.println("Fail");
			return false;
		}
	}

}

