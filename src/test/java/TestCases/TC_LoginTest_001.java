package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseTest {

	@Test
	public void loginTest() throws IOException {
		LoginPage lp=new LoginPage(driver);
		lp.LoginUser(userId, pwd);
	
	
	if(driver.getTitle().equals("Guru99 Bank ManagerHomePage")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	}
}
