package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		//super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="uid")
	WebElement userId;

	@FindBy(name="password")
	WebElement userPwd;

	@FindBy(name="btnLogin")
	WebElement submit ;
	
	@FindBy(css="a[href='Logout.php']")
	WebElement btnLogout ;
	
	public void LoginUser(String username,String password) {
		userId.sendKeys(username);
		userPwd.sendKeys(password);
		submit.click();
		
	}
	public void LogoutUser() {
		btnLogout.click();
	}

}
