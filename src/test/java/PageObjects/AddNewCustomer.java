package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	WebDriver driver;

	public AddNewCustomer(WebDriver driver) {
		// super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//ul[@class='menusubnav']//li[2]")
	WebElement linkNewCustomer; 
	
	@FindBy(id="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")
	WebElement frame1;
	
	@FindBy(id="ad_iframe")
	WebElement frame2;
	
	@FindBy(css ="div[id='dismiss-button']")
	WebElement AdCloseButton;

	@FindBy(xpath ="//input[@name='name']")
	WebElement customerName;

	@FindBy(xpath ="//input[@value='m']")
	WebElement genderBtn;

	@FindBy(xpath ="//input[@id='dob']")
	WebElement dob;

	@FindBy(xpath ="//textarea[@name='addr']")
	WebElement address;

	@FindBy(name ="city")
	WebElement city;

	@FindBy(name ="state")
	WebElement state;

	@FindBy(name ="pinno")
	WebElement pinNumber;

	@FindBy(name ="telephoneno")
	WebElement teleNumber;

	@FindBy(name ="emailid")
	WebElement emailId;

	@FindBy(name ="password")
	WebElement custPassword;

	@FindBy(name ="sub")
	WebElement submitBtn;

	public void clickAddNewCustomer() throws InterruptedException {

		linkNewCustomer.click();
		Thread.sleep(3000);
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		AdCloseButton.click();
		//driver.findElement(By.xpath("//div[@id='dismiss-button']/div/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
	
	}
	public void customerName(String name) {
		customerName.sendKeys(name);

	}

	public void customerGender() {
		genderBtn.click();

	}

	public void customerDob(String dd, String mm, String yyyy) {
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yyyy);

	}

	public void customerAddress(String custAddress) {
		address.sendKeys(custAddress);

	}

	public void customerCity(String Custcity) {

		city.sendKeys(Custcity);
	}

	public void customerState(String custState) {

		state.sendKeys(custState);
	}

	public void customerPin(String pinNo) {

		pinNumber.sendKeys(pinNo);
	}

	public void customerTele(String teleNo) {

		teleNumber.sendKeys(teleNo);
	}

	public void customerEmail(String email) {
		emailId.sendKeys(email);

	}

	public void customerPwd(String password) {
		custPassword.sendKeys(password);

	}

	public void submit() {
		submitBtn.click();

	}
}
