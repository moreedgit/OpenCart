package testCases;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObjects.AcctRegPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_AccountRegistration extends BaseClass { //BaseClass is the part of all the "TestCase" classes

	@Test
	public void verify_account_registration() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		Thread.sleep(1000);
		hp.clickRegister();
		Thread.sleep(1000);

		AcctRegPage regPage = new AcctRegPage(driver);
		regPage.setFirstName("John");
		Thread.sleep(1000);

		regPage.setLastName(randomString().toUpperCase());
		Thread.sleep(1000);

		regPage.setEmail(randomString()+"@gmail.com");
		Thread.sleep(1000);

		regPage.setTelephone(randomNumber());

		String password = randomAlphaNumber(); //to set the same value in password and confirm password
		regPage.setPassword(password);
		regPage.setConfirmPassword(password);
		//Thread.sleep(1000);

		regPage.setPrivacyPolicy();
		regPage.clickContinue();
		//Thread.sleep(1000);

		String confMsg = regPage.getConfirmationMsg();
		Assert.assertEquals(confMsg, "Your Account Has Been Created!");

	}




}
