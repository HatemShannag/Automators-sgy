package schoology.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.classfile.Annotation.element_value;

public class BlogPage {

	WebDriver driver;
	
	public BlogPage(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
	
	}
	
	public static final By COMMUNITY_TAB_LOC = By.xpath("//input[@value='121']");
	public static final By FIRST_ARTICLE_LOC = By.partialLinkText("Preparing Future Educators");
	
	public BlogPage clickCommunity(){
	
		driver.findElement(By.xpath("//input[@value='121']")).click();
		
		return this;
		
	}
	
	public void assertCommunityResults(){
		try{
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(FIRST_ARTICLE_LOC));
		System.out.println("Results Filtered");
		} catch (Exception ResultsNotFiltered){
			System.out.println("Results NOT filtered");
		}
	
}
}