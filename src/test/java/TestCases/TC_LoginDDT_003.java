package TestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import Utilities.DataReader;

public class TC_LoginDDT_003 extends BaseTest {
	
	@Test(dataProvider="LoginData")
	public void loginDDT(HashMap<String,String> input) {
		
		LoginPage lp=new LoginPage(driver);
		lp.LoginUser(input.get("userLoginId"), input.get("pwd"));
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}else {
			lp.LogoutUser();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e){
			return false;
		}
	}
	
	@DataProvider
	public Object[][] LoginData() throws IOException
	{

		DataReader dr=new DataReader();
		List<HashMap<String,String>> data = dr.getJsonData(System.getProperty("user.dir")+"//src//test//java//TestData//LoginData.json");
		return new Object[][]  {{data.get(0)}, {data.get(1) } };
		
	}

}
