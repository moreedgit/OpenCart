package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")  // "//a[@class='dropdown-item'][normalize-space()='Register']"))
	WebElement myAccountLnk;

	@FindBy(linkText = "Register")
	WebElement RegisterLnk;


	public void clickMyAccount(){
		myAccountLnk.click();
	}
	public void clickRegister(){
		RegisterLnk.click();
	}



}
