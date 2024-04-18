package steps;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomeworkLoginPage;
import pages.LoginPage;
import pages.TestBase;

public class HomeworkLoginStepDefinition extends TestBase {
	
	LoginPage loginPage;
	String name;
	String password;
	 HomeworkLoginPage homeworkLoginPage;


	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}
	@Given("User is on codefios login page")
	public void userIsOnCodefiosLoginPage() 
	{
		driver.get("https://codefios.com/ebilling");
		
	}
	
	@When ("User enters username as {string}")
	public void userEntersUserName(String username) {
		homeworkLoginPage.enterUserName(username);
	}
	@When("User enters password as {string}")
	public void userEntersPassword(String password) {
		homeworkLoginPage.enterPassword(password);
	}

	@When ("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		homeworkLoginPage.clickSignInButton();
		
	}
	@Then("User should be landing on dashboard page")
	public void user_should_be_landing_on_dashboard_page() {
		takeScreenshot(driver);
		String expectedTitle = "codefios QA";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals("Titles are not matching!",expectedTitle, actualTitle);
		
	}
	
	   @After
	   public void tearDown() {
		   driver.close();
		   driver.quit();
	   }
}



