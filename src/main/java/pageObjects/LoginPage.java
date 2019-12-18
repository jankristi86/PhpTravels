package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver dr;

	private By email = By.xpath("//input[@placeholder='Email']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By submit = By.cssSelector("button[class*='loginbtn']");

	public LoginPage(WebDriver dr) {
		this.dr = dr;
	}

	public WebElement getEmail() {
		return dr.findElement(email);
	}

	public void clickEmail() {
		getEmail().click();
	}

	public void sendKeysEmail(String str) {
		getEmail().clear();
		getEmail().sendKeys(str);
	}

	public WebElement getPassword() {
		return dr.findElement(password);
	}

	public void clickPassword() {
		getPassword().click();
	}

	public void sendKeysPassword(String str) {
		getPassword().clear();
		getPassword().sendKeys(str);
	}

	public WebElement getSubmit() {
		return dr.findElement(submit);
	}

	public void clickSubmit() {
		getPassword().click();
	}

}
