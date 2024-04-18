//package steps;
//
//import org.openqa.selenium.support.PageFactory;
//
//import io.cucumber.java.After;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//import pages.LoginPage;
//import pages.TestBase;
//
//public class LoginStepDefinition extends TestBase {
//	LoginPage loginPage;
//	String name;
//	String password;
//
//	@Given ("User is on codefios login page")
//	public void userisoncodefiosloginpage() {
//		initDriver();
//		driver.get("https://qa.codefios.com/login/");
//		
//	}
//	@Given ("user navigate to the website")
//	public void userNavigateToWebsite() {
//		initDriver();
//		driver.get("https://qa.codefios.com/login/");
//		
//	}
//	
//	@When ("User enters username as {string}")
//	public void user_enters_username(String username) {
//		loginPage = PageFactory.initElements(driver, LoginPage.class);
//		loginPage.enterUserName(username);
//	}
//	@When("User enters password as {string}")
//	public void user_enters_password_as(String password) {
//	    loginPage.enterPassword(password);
//	}
//
//	@When ("User clicks on sign in button")
//	public void user_clicks_on_sign_in_button() {
//		loginPage.clickSignInButton();
//		
//	}
//	@Then("User should be landing on dashboard page")
//	public void user_should_be_landing_on_dashboard_page() {
//		takeScreenshot(driver);
//		String expectedTitle = "codefios QA";
//		String actualTitle = loginPage.getPageTitle();
//		Assert.assertEquals("Titles are not matching!",expectedTitle, actualTitle);
//		
//	}
//	//@When("User enters {string} from mysql database")
//	//public void user_enters_from_mysql_database(String credentials) {
//	//	if(credentials.equalsIgnoreCase("username")) {
////			loginPage.enterUserName(getDataFromDatabase);
////			
////		}else if(credentials.equalsIgnoreCase("password")) {
////			loginPage.enterPassword(getDataFromDatabase);
////		}else {
////				System.out.println("Unable to retrieve data from DB!");}
////		
////	    
////	}
//
//
//	   @After
//	   public void tearDown() {
//		   driver.close();
//		   driver.quit();
//	   }
//}
