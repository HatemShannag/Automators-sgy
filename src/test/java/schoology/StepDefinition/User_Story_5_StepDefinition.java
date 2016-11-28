package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.RegisterPage;
import schoology.PageObjects.SchoologyHomePage;

public class User_Story_5_StepDefinition {

	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	RegisterPage registerPage;
	
	@Given("^User is on schoology home page and clicks Sign Up$")
	public void User_is_on_schoology_home_page_and_clicks_Sign_Up() throws Throwable {
		
	    schoologyHomePage = new SchoologyHomePage(driver);
	   registerPage = schoologyHomePage.clickSignUp();
	    
	}

	@When("^User clicks Student$")
	public void User_clicks_Student() throws Throwable {
	   registerPage.clickStudent();
	}

	@When("^User enters access code \"([^\"]*)\"$")
	public void User_enters_access_code(String code) throws Throwable {
	   registerPage.enterCode(code);
	}

	@When("^user clicks Continue$")
	public void user_clicks_Continue() throws Throwable {
	    registerPage.clickContinue();
	}
	
	@When("^User enters first.name \"([^\"]*)\"$")
	public void User_enters_first_name(String firstName) throws Throwable {
	    registerPage.enterFirstName(firstName);
	}

	@When("^user enters last name \"([^\"]*)\"$")
	public void user_enters_last_name(String lastName) throws Throwable {
	  registerPage.enterLastName(lastName);
	}

	@When("^user enters email address \"([^\"]*)\"$")
	public void user_enters_email_address(String email) throws Throwable {
	 registerPage.enterEmail(email);   
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws Throwable {
	    registerPage.enterPassword(password);
	}

	@When("^user confirms password \"([^\"]*)\"$")
	public void user_confirms_password(String password) throws Throwable {
	   registerPage.reEnterPassword(password);
	}

	@When("^user selects birth month \"([^\"]*)\"$")
	public void user_selects_birth_month(String month) throws Throwable {
	    registerPage.monthDropDown(month);
	}

	@When("^user selects birthday \"([^\"]*)\"$")
	public void user_selects_birthday(String day) throws Throwable {
	 registerPage.dayDropDown(day);
	}

	@When("^user selects year \"([^\"]*)\"$")
	public void user_selects_year(String year) throws Throwable {
	    registerPage.yearDropDown(year);
	}

	@Then("^user asserts Register button is clickable$")
	public void user_asserts_Register_button_is_clickable() throws Throwable {
	    registerPage.assertRegister();
	}
}
