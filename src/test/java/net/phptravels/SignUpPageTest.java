package net.phptravels;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUpPage;
import resources.Base;

public class SignUpPageTest extends Base {

	public static Logger log = LogManager.getLogger(Base.class.getName());
	SignUpPage sp = new SignUpPage(dr);
	HomePage hp = new HomePage(dr);

	@BeforeTest
	public void initialize() throws IOException {
		dr = initializeDriver();
		dr.get(prop.getProperty("url"));
		log.info("driverinitialized");
		dr.manage().window().maximize();

	}

	@Test(dataProvider = "getData")
	public void registerOneUser(String fName, String lName, String mobile, String email, String pass, String confPass) {
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hp.clickaccountDropDown();
		sp.clickSignBtn();

		sp.getFirstName().sendKeys(fName);
		sp.getLastName().sendKeys(lName);
		sp.getPhone().sendKeys(mobile);
		sp.getEmail().sendKeys(email);
		sp.getPass().sendKeys(pass);
		sp.getPass().sendKeys(confPass);
		sp.clickSignUp();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][6];
		data[0][0] = "John";
		data[0][1] = "Doe";
		data[0][2] = "0800123123";
		data[0][3] = "user@phptravels.com";
		data[0][4] = "demouser";
		data[0][5] = "demouser";

		return data;

	}

	@AfterTest
	public void tearDown() {
		dr.close();
		dr = null;
	}

}
