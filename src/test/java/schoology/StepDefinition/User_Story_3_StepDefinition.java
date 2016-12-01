package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import schoology.PageObjects.BlogPage;
import schoology.PageObjects.SchoologyHomePage;

public class User_Story_3_StepDefinition {
	
	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	BlogPage blogPage;
	
	
	@Given("^User is on schoology web application$")
	public void User_is_on_schoology_web_application() throws Throwable {
	    schoologyHomePage = new SchoologyHomePage(driver);
	}

	@When("^User clicks Blog and is on Blog page$")
	public void User_clicks_Blog_and_is_on_Blog_page() throws Throwable {
	   blogPage= schoologyHomePage.clickBlog();
	}

	@When("^User clicks Community tab$")
	public void User_clicks_Community_tab() throws Throwable {
	    blogPage.clickCommunity();
	}

	@Then("^community results are displayed$")
	public void community_results_are_displayed() throws Throwable {
	    blogPage.assertCommunityResults();
	}

}
