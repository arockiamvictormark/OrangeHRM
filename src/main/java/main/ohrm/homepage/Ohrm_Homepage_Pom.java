package main.ohrm.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ohrm_Homepage_Pom {
	
	WebDriver pomDriver;

	public Ohrm_Homepage_Pom(WebDriver mainDriver) {
		pomDriver=mainDriver;
		PageFactory.initElements(pomDriver, this);
	}
	
	@FindBy(name = "username")
	private WebElement user;	
	public WebElement getUser() {
		return user;
	}

	@FindBy(name = "password")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(className = "oxd-userdropdown-name")
	private WebElement selectLogOut;	
	public WebElement getSelectLogOut() {
		return selectLogOut;
	}

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOut;
	public WebElement getLogOut() {
		return logOut;
	}

}
