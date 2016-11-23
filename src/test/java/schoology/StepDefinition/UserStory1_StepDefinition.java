package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import schoology.PageObjects.SchoologyHomePage;

public class UserStory1_StepDefinition {

	WebDriver driver = TestBase.driver;
	SchoologyHomePage schoologyHomePage;
	
	@Given("^User is on schoology$")
	public void User_is_on_Homepage(){
		schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();	
	}
	@Given("^User clicks corporate$")
	public void User_clicks_corporate() throws Throwable {
		schoologyHomePage.clickCorporate();
	    
	}
}
