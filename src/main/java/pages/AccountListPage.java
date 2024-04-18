package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountListPage {
	WebDriver driver;
	
	 public AccountListPage(WebDriver driver) {
		  this.driver = driver;  
		 } 
		 // Element Library
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'List Accounts')")
		 public WebElement AccountList;
		 @FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Account')]")
		 public WebElement AddAccount;
		 @FindBy(how = How.XPATH, using = "//input[@id='account_name']")
		 public WebElement AccountName;
		 @FindBy(how = How.XPATH, using = "//textarea[@id='description']")
		 public WebElement Description;
		 @FindBy(how = How.XPATH, using = "//input[@id='balance']")
		 public WebElement InitialBalance;
		 @FindBy(how = How.XPATH, using = "//input[@id='account_number']")
		 public WebElement AccountNumber;
		 @FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
		 public WebElement ContactPerson;
		 @FindBy(how = How.XPATH, using = "//button[@id='accountSave']")
		 public WebElement SaveButton;
		 @FindBy(how = How.XPATH, using = "//div[contains(text(),'Account Added Successfully')]") 
		   WebElement AccountAddedAlert;  
		 
		 public String validateListAccountPage() {
				return AccountList.getText();

			}
		 public void ClickAddAccount() {
			   AddAccount.click();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void enterAccountName(String accountName) {
			   AccountName.sendKeys(accountName);
			   AccountName.clear();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void enterDescription(String description) {
			   Description.sendKeys(description);
			   Description.clear();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void enterInitialBalance(String initialBalance) {
			   InitialBalance.sendKeys(initialBalance);
			   InitialBalance.clear();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void enterAccountNumber(String accountNum) {
			   AccountNumber.sendKeys(accountNum);
			   AccountNumber.clear();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void enterContactPerson(String contactPerson) {
			   ContactPerson.sendKeys(contactPerson);
			   ContactPerson.clear();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public void clickSaveButton() {
			   SaveButton.click();
			   try {
			    Thread.sleep(3000);
			   } catch (InterruptedException e) {
			    e.printStackTrace();
			   }
			  }
		 public String getAcctAddedAlertText() {
				return AccountAddedAlert.getText();
		 }
		 
		 

}
