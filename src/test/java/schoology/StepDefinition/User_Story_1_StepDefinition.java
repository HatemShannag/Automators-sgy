package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.CorporatePage;
import schoology.PageObjects.SchoologyHomePage;

public class User_Story_1_StepDefinition {

	WebDriver driver = TestBase.driver; //same for all
	SchoologyHomePage schoologyHomePage;
	CorporatePage corporatePage;
	
	@Given("^User is on schoology home page$")
	public void User_is_on_schoology_home_page() throws Throwable {
		schoologyHomePage = new SchoologyHomePage(driver);
	}

	@When("^User clicks on corporate and is on corporate page$")
	public void User_clicks_on_corporate_and_is_on_corporate_page() throws Throwable {
	   corporatePage =  schoologyHomePage.clickCorporate();
	}

	@When("^user enters first name \"([^\"]*)\"$")
	public void User_enters_first_name(String firstName) throws Throwable {
	  corporatePage.enterFirstName(firstName);
	}

	@When("^User enters last name \"([^\"]*)\"$")
	public void User_enters_last_name(String lastName) throws Throwable {
	   corporatePage.enterLastName(lastName);
	}

	@When("^User selects job function \"([^\"]*)\"$")
	public void User_selects_job_function(String jobFuntionDropDown) throws Throwable {
	    corporatePage.selectJobFuntion(jobFuntionDropDown);
	}

	@When("^User enters phone number \"([^\"]*)\"$")
	public void User_enters_phone_number(String number) throws Throwable {
	    corporatePage.enterPhoneNumber(number);
	}

	@When("^User enters email address \"([^\"]*)\"$")
	public void User_enters_email_address(String email) throws Throwable {
	   corporatePage.enterEmail(email);
	}

	@When("^User enters company \"([^\"]*)\"$")
	public void User_enters_company(String company) throws Throwable {
	   corporatePage.enterCompany(company);
	}

	@When("^User selects number of employees \"([^\"]*)\"$")
	public void User_selects_number_of_employees(String employeeDropDown) throws Throwable {
	    corporatePage.selectNumberOfEmployees(employeeDropDown);
	}

	@When("^User chooses country \"([^\"]*)\"$")
	public void User_chooses_country(String countryName) throws Throwable {
	    corporatePage.chooseCountry(countryName);
	}
	
	@When("^User enters comment \"([^\"]*)\"$")
	public void user_enters_comment(String comment) throws Throwable {
		corporatePage.enterComment(comment);
		
	}

	@Then("^User asserts submit button is clickable$")
	public void User_asserts_submit_button_is_clickable() throws Throwable {
	    corporatePage.assertSubmitButton();
	}
}

	
	

