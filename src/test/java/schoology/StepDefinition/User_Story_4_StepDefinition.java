package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.AboutPage;
import schoology.PageObjects.SchoologyHomePage;

public class User_Story_4_StepDefinition {

	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	AboutPage aboutPage; 
	
	
	
	@Given("^User is on schoology home page and clicks About.$")
	public void User_is_on_schoology_home_page_and_clicks_About() throws Throwable {
	    schoologyHomePage = new SchoologyHomePage(driver);
	    aboutPage = schoologyHomePage.clickAbout();
	}

	@When("^User clicks Contact$")
	public void User_clicks_Contact() throws Throwable {
	    aboutPage.clickContact();
	}

	@When("^User selects \"([^\"]*)\" from dropdown$")
	public void User_selects_from_dropdown(String mediaInquiry) throws Throwable {
	    aboutPage.dropDownBox(mediaInquiry);
	}

	@When("^user enters first_name \"([^\"]*)\"$")
	public void user_enters_first_name(String firstName) throws Throwable {
	    aboutPage.enterFirstName(firstName);
	}
	
	@When("^user enters last_name \"([^\"]*)\"$")
	public void user_enters_last_name(String lastName) throws Throwable {
	  aboutPage.enterLastName(lastName);
	}

	@When("^user enters Email \"([^\"]*)\"$")
	public void user_enters_Email(String email) throws Throwable {
	    aboutPage.enterEmail(email);
	}

	@When("^user enters phone_number \"([^\"]*)\"$")
	public void user_enters_phone_number(String number) throws Throwable {
	    aboutPage.enterPhoneNumber(number);
	}

	@When("^user enters Institution \"([^\"]*)\"$")
	public void user_enters_Institution(String institution) throws Throwable {
	    aboutPage.enterInstitution(institution);
	}

	@When("^user enters job_title \"([^\"]*)\"$")
	public void user_enters_job_title(String jobTitle) throws Throwable {
	    aboutPage.enterJobTitle(jobTitle);
	}

	@Then("^User asserts submit button$")
	public void User_asserts_submit_button() throws Throwable {
	    aboutPage.assertSubmitButton();
	}
}
