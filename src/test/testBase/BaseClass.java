package testBase;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {

	public WebDriver driver;

	@BeforeClass
	public void setup(){
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
//		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown(){
		driver.quit();
	}

	//Creating random numeric, string and both
	public String randomString(){

		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomNumber(){

		String generatedNumber = RandomStringUtils.randomAlphanumeric(10);
		return generatedNumber;
	}
	public String randomAlphaNumber(){ //get random Password

		String generatedNumber = RandomStringUtils.randomAlphanumeric(5);
		String generatedString = RandomStringUtils.randomAlphabetic(3);

		return (generatedNumber+"@"+generatedString);
	}




}
