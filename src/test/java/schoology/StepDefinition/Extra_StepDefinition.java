package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.ConnectPage;
import schoology.PageObjects.EventsPage;
import schoology.PageObjects.SchoologyHomePage;

public class Extra_StepDefinition {

	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	ConnectPage connectPage;
	EventsPage eventsPage;
	
	@Given("^User is on schoology home page and clicks Connect$")
	public void User_is_on_schoology_home_page_and_clicks_Connect() throws Throwable {
	    schoologyHomePage = new SchoologyHomePage(driver);
	    connectPage = schoologyHomePage.clickConnect();
	    
	}

	@When("^User clicks Events$")
	public void User_clicks_Events() throws Throwable {
	    connectPage.clickEvents();
	}

	@When("^User clicks All Events$")
	public void User_clicks_All_Events() throws Throwable {
	  eventsPage = connectPage.clickAllEvents();
	}

	@Then("^User is on Events page$")
	public void User_is_on_Events_page() throws Throwable {
	    eventsPage.checkAssert();
	    eventsPage.assertRegisterNowButton();
	}

	}


