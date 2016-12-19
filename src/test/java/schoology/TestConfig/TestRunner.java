package schoology.TestConfig;

	import org.junit.runner.RunWith;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
				features = "schoology-UserStories", //name of the folder, where are you feature files located
				glue = {"schoology.StepDefinition"}, //where is the step definition going to be
				tags = {"@User_Story_1"}, //in google.feature you have to place this tag if you want to run it
				format = {"pretty", "html:target/cucumber"}
				)
	public class TestRunner {

	}

