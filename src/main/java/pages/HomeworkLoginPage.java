package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeworkLoginPage {
	WebDriver driver;
	 
	 public HomeworkLoginPage(WebDriver driver) {
	  this.driver = driver;  
	 } 
	 // Element Library
	 @FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	 public WebElement UserName;
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 public WebElement Password;
	 @FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	 public WebElement SignInButton;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='MV3Tnb']")
	 public WebElement about;
	 
	// Methods to interact with the elements
	  public void enterUserName(String userName) {
		//  about.click();
	   UserName.sendKeys(userName);
//	   try {
////	    Thread.sleep(3000);
//	   } catch (InterruptedException e) {
//	    e.printStackTrace();
//	   }
	  }
	  
	  public void enterPassword(String password) {
	   Password.sendKeys(password);
	   Password.clear();
	   try {
	    Thread.sleep(3000);
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	  }
	  
	  public void clickSignInButton() {
	   SignInButton.click();
	   try {
	    Thread.sleep(3000);
	   } catch (InterruptedException e) {
	    e.printStackTrace();
	   }
	  } 

	  public String getPageTitle() {
	   return driver.getTitle();
	  }
}






