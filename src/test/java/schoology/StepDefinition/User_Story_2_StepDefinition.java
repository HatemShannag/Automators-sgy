package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.ResourcesPage;
import schoology.PageObjects.SchoologyHomePage;

public class User_Story_2_StepDefinition {
	
	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	ResourcesPage resourcesPage;
	
	@Given("^User is on schoology landing page$")
	public void User_is_on_schoology_landing_page() throws Throwable {
		schoologyHomePage = new SchoologyHomePage(driver);
		
	}

	@When("^User clicks resources tab and is on resources page$")
	public void User_clicks_resources_tab_and_is_on_resources_page() throws Throwable {
		resourcesPage = schoologyHomePage.clickResources();
	}

	@When("^User checks Research box under Type header$")
	public void User_checks_Research_box_under_Type_header() throws Throwable {
	    resourcesPage.clickCheckBox();
	}

	@Then("^research results are displayed$")
	public void research_results_are_displayed() throws Throwable {
	   resourcesPage.AssertResearchFilter();
	}
}
