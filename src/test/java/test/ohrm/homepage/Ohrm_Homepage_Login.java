package test.ohrm.homepage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import main.ohrm.homepage.Ohrm_Base;
import main.ohrm.homepage.Ohrm_Homepage_Pom;

public class Ohrm_Homepage_Login extends Ohrm_Base {
	
	WebDriver mainDriver;
	
	@BeforeClass
	private void webdriver_launch() {
		mainDriver = driverLaunch();
	}
	
	@BeforeMethod
	private void ohrm_homepage_launch() {
		loginUrl("https://opensource-demo.orangehrmlive.com/");
		wait(5);
	}
	
	@Test(dependsOnMethods = "ohrm_correct_login")
	private void ohrm_logout() {
		wait(5);
		Ohrm_Homepage_Pom login = new Ohrm_Homepage_Pom(mainDriver);
		buttonClick(login.getSelectLogOut());
		buttonClick(login.getLogOut());
	}
	
	@Test
	private void ohrm_correct_login() {
		Ohrm_Homepage_Pom login = new Ohrm_Homepage_Pom(mainDriver);
		inputValue(login.getUser(),"admin");
		inputValue(login.getPass(),"admin123");
		buttonClick(login.getLoginButton());
	}
	
	@Test(priority = 1)
	private void ohrm_wrong_pwd() {
		Ohrm_Homepage_Pom login = new Ohrm_Homepage_Pom(mainDriver);
		inputValue(login.getUser(),"admin");
		inputValue(login.getPass(),"admins123");
		buttonClick(login.getLoginButton());
	}
	
	@Test(priority = 2)
	private void ohrm_wrong_user() {
		Ohrm_Homepage_Pom login = new Ohrm_Homepage_Pom(mainDriver);
		inputValue(login.getUser(),"admins");
		inputValue(login.getPass(),"admins123");
		buttonClick(login.getLoginButton());
	}
	
	@Test(priority = 3)
	private void ohrm_wrong_userandpwd() {
		Ohrm_Homepage_Pom login = new Ohrm_Homepage_Pom(mainDriver);
		inputValue(login.getUser(),"admins");
		inputValue(login.getPass(),"admins123");
		buttonClick(login.getLoginButton());
	}

}
