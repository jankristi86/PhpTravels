package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	public WebDriver dr;
	private By signBtn = By.cssSelector("div[class='mini-menu'] ul li:nth-child(3) a:nth-child(2)");
	private By firstName = By.cssSelector("input[name='firstname']");
	private By lastName = By.cssSelector("input[name='lastname']");
	private By phone = By.cssSelector("input[name='phone']");
	private By email = By.cssSelector("input[name='email']");
	private By pass = By.cssSelector("input[name='password']");
	private By confirmPass = By.cssSelector("input[name='confirmpassword']");
	private By signUp = By.cssSelector("button[class*='signupbtn']");

	public SignUpPage(WebDriver dr) {
		this.dr = dr;
	}

	public WebElement getSignBtn() {
		return dr.findElement(signBtn);
	}

	public void clickSignBtn() {
		getSignBtn().click();
	}

	public WebElement getFirstName() {
		return dr.findElement(firstName);
	}

	public void clickFirstName() {
		getFirstName().click();
	}

	public void sendKeysFirstName(String str) {
		getFirstName().clear();
		getFirstName().sendKeys(str);
	}

	public WebElement getLastName() {
		return dr.findElement(lastName);
	}

	public void clickLastName() {
		getLastName().click();
	}

	public void sendKeysLastName(String str) {
		getLastName().clear();
		getLastName().sendKeys(str);
	}

	public WebElement getPhone() {
		return dr.findElement(phone);
	}

	public void clickPhone() {
		getPhone().click();
	}

	public void sendKeysPhone(String str) {
		getPhone().clear();
		getPhone().sendKeys(str);
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

	public WebElement getPass() {
		return dr.findElement(pass);
	}

	public void clickPass() {
		getPass().click();
	}

	public void sendKeysPass(String str) {
		getPass().clear();
		getPass().sendKeys(str);
	}

	public WebElement getConfirmPass() {
		return dr.findElement(confirmPass);
	}

	public void clickConfirmPass() {
		getConfirmPass().click();
	}

	public void sendKeysConfirmPass(String str) {
		getConfirmPass().clear();
		getConfirmPass().sendKeys(str);
	}

	public WebElement getSignUp() {
		return dr.findElement(signUp);
	}

	public void clickSignUp() {
		getSignUp().click();
	}

}
