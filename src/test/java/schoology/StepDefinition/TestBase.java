package schoology.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {

	static WebDriver driver;
	
	@Before
	public void openBrowser(){
		String pathToDriver = System.getProperty("user.dir")+ "\\drivers\\chromedriver.exe"; //drivers and chromedriver is the same for everyone
		//System.out.println(pathToDriver);
		System.setProperty("webdriver.chrome.driver", pathToDriver);
		driver = new ChromeDriver();
		driver.get("https://www.schoology.com/");
		driver.manage().window().maximize();
		
	}
//	@After
//	public void closeBrowser(){
//		driver.close();
//	}
}
