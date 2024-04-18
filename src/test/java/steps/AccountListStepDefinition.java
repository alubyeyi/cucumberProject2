package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountListPage;
import pages.TestBase;

public class AccountListStepDefinition extends TestBase {
	
	AccountListPage accountListPage;
	String AccountName;
	String password;
	String Description;
	
	@Then("User should be landing on Account List page")
	public void User_clicks_on_Account_List_link() {
		accountListPage = PageFactory.initElements(driver, AccountListPage.class);

		  String expectedTitle = "Account List";
		  String actualTitle = accountListPage.validateListAccountPage();
		  Assert.assertEquals("Title does not match!", expectedTitle, actualTitle);

	}
	 @When ("User clicks on Add Account button")
	 public void UserclickonAddAccountButton() {
		 accountListPage.ClickAddAccount();
	 }
	 @When ("User enters Account name as {string}")
	 public void User_enters_Account_name(String accountName) {
		 accountListPage.enterAccountName(accountName);
	 }
     @When ("User enters description as {string}")
     public void User_enters_description(String description) {
    	 accountListPage.enterDescription(description);
     }
     @When ("User enters intial balance as {string}")
     public void User_enters_initial_balance(String initialBalance) {
    	 accountListPage.enterInitialBalance(initialBalance);
     }
     @When ("User enters account Number as {string}")
     public void User_enters_account_number(String accountNumber) {
    	accountListPage.enterAccountNumber(accountNumber); 
     }
     @When ("User enters contact Person as {string}")
     public void user_enters_contact_person(String contactPerson) {
    	accountListPage.enterContactPerson(contactPerson); 
     }
     @When ("User clicks on save button")
     public void user_clicks_on_save_button() {
    	 accountListPage.clickSaveButton();
     }

 	@Then("User should be able to see account added alert")
 	public void user_should_be_able_to_see_account_added_alert() {
 		String expectedtext = "Account Added Successfully.";
 	    String actualtext = accountListPage.getAcctAddedAlertText();
 		Assert.assertEquals("Alert not found!",expectedtext, actualtext);
 		takeScreenshot(driver);
 		
 		
 	}
}
