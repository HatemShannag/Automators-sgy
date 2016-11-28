package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CorporatePage {

	WebDriver driver;
	public static final By FIRST_NAME_LOC = By.id("FirstName");
	public static final By LAST_NAME_LOC = 	By.id("LastName");
	public static final By JOB_FUNCTION_LOC = By.id("Job_Function__c");
	public static final By PHONE_NUMBER_LOC = By.id("Phone");
	public static final By EMAIL_LOC = By.id("Email");
	public static final By COMAPANY_LOC = By.id("Company");
	public static final By NUMBER_OF_EMPLOYEES_LOC = By.id("NumberOfEmployees");
	public static final By COUNTRY_LOC = By.id("Country");
	public static final By COMMENT_LOC = By.id("Comment__c");
	public static final By SUBMIT_LOC = By.className("mktoButton");
	
	
	public CorporatePage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
	Assert.assertTrue(checkAssert());	
	}
	public boolean checkAssert(){
		if(driver.getCurrentUrl().contains("corporate")){
			System.out.println("CorporatePagePassed");
			return true;
		} else{
			System.out.println("CorporatePageFail");
			System.out.println(driver.getCurrentUrl());
			return false;
		}
	}
	
	public CorporatePage enterFirstName(String firstName){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(FIRST_NAME_LOC).sendKeys(firstName);
		return this;
	}
	public CorporatePage enterLastName(String lastName){
		driver.findElement(LAST_NAME_LOC).sendKeys(lastName);
		return this;
	}
	public CorporatePage selectJobFuntion(String jobFuntionDropDown){
		Select jobFuntion = new Select(driver.findElement(JOB_FUNCTION_LOC));
		jobFuntion.selectByVisibleText(jobFuntionDropDown);
		return this;
	}
	public CorporatePage enterPhoneNumber(String number){
		driver.findElement(PHONE_NUMBER_LOC).sendKeys(number);
		return this;
	}
	public CorporatePage enterEmail(String email){
		driver.findElement(EMAIL_LOC).sendKeys(email);
		return this;
	}
	public CorporatePage enterCompany(String company){
		driver.findElement(COMAPANY_LOC).sendKeys(company);
		return this;
	}
	public CorporatePage selectNumberOfEmployees(String employeeDropDown){
		Select numberOfEmployees = new Select(driver.findElement(NUMBER_OF_EMPLOYEES_LOC));
		numberOfEmployees.selectByVisibleText(employeeDropDown);
		return this;
	}
	public CorporatePage chooseCountry(String countryName){
		Select country = new Select(driver.findElement(COUNTRY_LOC));
		country.selectByVisibleText(countryName);
		return this;
	}
	public CorporatePage enterComment(String comment){
		driver.findElement(COMMENT_LOC).sendKeys(comment);
		return this;
	}
	public void assertSubmitButton(){
		try{
		WebDriverWait wait = new WebDriverWait(driver,30); 
		wait.until(ExpectedConditions.elementToBeClickable(SUBMIT_LOC));
		System.out.println("Submit button is clickable");
		} catch (Exception ButtonNotClickable) {
			System.out.println("Submit button not clickable");
		}
	}
}
