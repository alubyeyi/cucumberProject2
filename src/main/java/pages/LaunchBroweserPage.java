package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LaunchBroweserPage extends TestBase {

	 @FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	 public WebElement UserName;
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	 public WebElement Password;
	 @FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	 public WebElement SignInButton;
	
	
}
