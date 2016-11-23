package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import schoology.PageObjects.SchoologyHomePage;

public class UserStory1_StepDefinition {

	WebDriver driver = TestBase.driver;
	
	@Given("^User is on schoology$")
	public void User_is_on_Homepage(){
		SchoologyHomePage schoologyHomePage = new SchoologyHomePage(driver);
		schoologyHomePage.checkPageTitle();	
	}
}
