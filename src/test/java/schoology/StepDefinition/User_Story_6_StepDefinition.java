package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.LoginPage;
import schoology.PageObjects.SchoologyHomePage;
import schoology.PageObjects.UserHomePage;



public class User_Story_6_StepDefinition {
	
	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	LoginPage loginPage;
	UserHomePage userHomePage;
	
	@Given("^User is on schoology web application and clicks Log In button$")
	public void User_is_on_schoology_web_application_and_clicks_Log_In_button() throws Throwable {
		
	    schoologyHomePage = new SchoologyHomePage(driver);
	    loginPage =schoologyHomePage.clickLogIn();
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void User_enters_username(String email) throws Throwable {
	    loginPage.enterEmail(email);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void User_enters_password(String password) throws Throwable {
	    loginPage.enterPassword(password);
	}

	@When("^User clicks Continue$")
	public void User_clicks_Continue() throws Throwable {
	    userHomePage = loginPage.clickLogin();
	}

	@When("^User clicks Courses$")
	public void User_clicks_Courses() throws Throwable {
	    userHomePage.clickCourses();
	}

	@When("^User clicks Join$")
	public void User_clicks_Join() throws Throwable {
	    userHomePage.clickJoin();
	}

	@When("^user enters access code \"([^\"]*)\"$")
	public void user_enters_access_code(String accessCode) throws Throwable {
	 userHomePage.enterAccessCode(accessCode);   
	}

	@Then("^User asserts Join button$")
	public void User_asserts_Join_button() throws Throwable {
	 userHomePage.assertJoin();
	}

}
