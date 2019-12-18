package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver dr;
	private By navBar = By.xpath("//div[@id='mobileMenuMain']//nav");
	private By accountDropDown = By.cssSelector("div[class='mini-menu'] ul li:nth-child(3)");
	private By currencyDropDown = By.cssSelector("div[class='mini-menu'] ul li:nth-child(1)");
	private By language = By.xpath("//a[@id='dropdownLangauge']");
	private By login;
	private By signUp;
	private By centerText = By.xpath("//div[@class='section-title']//h2[1]");
	private By appStore = By.cssSelector("//div[@class='footer_bg']//li[1]");
	private By playStore = By.cssSelector("//div[@class='footer_bg']//li[2]");

	public HomePage(WebDriver dr) {
		this.dr = dr;
	}

	public WebElement getNavBar() {
		return dr.findElement(navBar);
	}

	public void clickNavBar() {
		getNavBar().click();
	}

	public WebElement getaccountDropDown() {
		return dr.findElement(accountDropDown);
	}

	public void clickaccountDropDown() {
		getaccountDropDown().click();
	}

	public WebElement getcurrencyDropDown() {
		return dr.findElement(currencyDropDown);
	}

	public void clickcurrencyDropDown() {
		getcurrencyDropDown().click();
	}

	public WebElement getLanguage() {
		return dr.findElement(language);
	}

	public void clickLanguage() {
		getLanguage().click();
	}

	public WebElement getLogin() {
		return dr.findElement(login);
	}

	public void clickLogin() {
		getLogin().click();
	}

	public WebElement getSignUp() {
		return dr.findElement(signUp);
	}

	public void clickSignUp() {
		getSignUp().click();
	}

	public WebElement getCenterText() {
		return dr.findElement(centerText);
	}

	public WebElement getappStore() {
		return dr.findElement(appStore);
	}

	public void clickappStore() {
		getappStore().click();
	}

	public WebElement getplayStore() {
		return dr.findElement(playStore);
	}

	public void clickplayStore() {
		getplayStore().click();
	}

}
