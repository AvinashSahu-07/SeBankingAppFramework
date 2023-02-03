package TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import PageObjects.AddNewCustomer;
import PageObjects.LoginPage;

public class TC_AddCustomer_002 extends BaseTest{
	
	@Test
	public void AddCustomer() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.LoginUser(userId, pwd);
		Thread.sleep(3000);
		
		AddNewCustomer cust=new AddNewCustomer(driver);
		
		cust.clickAddNewCustomer();
		cust.customerName("Avinash");
		cust.customerGender();
		cust.customerDob("23","02","1999");
		Thread.sleep(3000);
		cust.customerAddress("House02");
		cust.customerCity("CKP");
		cust.customerState("Jharkhand");
		cust.customerPin("833102");
		cust.customerTele("963198570");
		
		String userEmail=randomString()+"123@gmail.com";
		cust.customerEmail(userEmail);
		cust.customerPwd("Avi1244");
		cust.submit();
		
		
	}
	
	public String  randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}

}
