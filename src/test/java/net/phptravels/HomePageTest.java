package net.phptravels;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.HomePage;
import resources.Base;

public class HomePageTest extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	HomePage hp = new HomePage(dr);

	@BeforeTest
	public void initialize() throws IOException {
		dr = initializeDriver();
		dr.get(prop.getProperty("url"));
		log.info("driverinitialized");
	}

	@Test
	public void validateNavBar() {
		if (hp.getNavBar().isDisplayed()) {
			log.info("nav bar is displayed");
		} else
			log.info("nav bar is missing");
	}

	@Test
	public void validateAccountDropDown() {
		if (hp.getaccountDropDown().isDisplayed()) {
			log.info("account dropdown is displayed");
		} else
			log.info("account dropdown is missing");
	}

	@Test
	public void validateEurCurrency() {
		if (hp.getcurrencyDropDown().isDisplayed()) {
			log.info("currency dropdown is displayed");
		} else
			log.info("currency dropdown is missing");
	}

	@Test()
	public void validateText() {
		Assert.assertEquals(hp.getCenterText().getText(), "Featured Cars");
		log.info("successfully validated featured cars text");

	}

	@AfterTest
	public void closeDriver() {
		dr.close();
		dr = null;
	}
}
