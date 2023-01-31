package test.ohrm.Profile.Menu_06;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import main.ohrm.Profile.Menu_06.Ohrm_My_Info_Base;
import main.ohrm.Profile.Menu_06.Ohrm_My_Info_Pom;

public class Ohrm_My_Info_Run extends Ohrm_My_Info_Base {
	
	WebDriver mainDriver = driverLaunch();
	Ohrm_My_Info_Pom myInfo = new Ohrm_My_Info_Pom(mainDriver);
	
	@BeforeClass
	private void ohrm_homepage_launch() {
		loginUrl("https://opensource-demo.orangehrmlive.com/");
		wait(5);
	}
	
	@Test
	private void ohrm_correct_login() throws InterruptedException {
//		inputValue(myInfo.getUser(),"arockiam");
//		inputValue(myInfo.getPass(),"Victor@123");
//		buttonClick(myInfo.getLoginButton());
		
		boolean contains = mainDriver.getCurrentUrl().contains("dashboard");
		if(!contains) {
			inputValue(myInfo.getUser(),"admin");
			inputValue(myInfo.getPass(),"admin123");
			buttonClick(myInfo.getLoginButton());
			
//			buttonClick(myInfo.getPim());
//			buttonClick(myInfo.getAddButton());
//			inputValue(myInfo.getPimFirstName(),"Arockiam");
//			inputValue(myInfo.getPimMiddleName(),"Victor");
//			inputValue(myInfo.getPimLastName(),"Mark");
//			inputValue(myInfo.getPimEmpId(),"12345");
//			buttonClick(myInfo.getPimCreateLogin());
//			inputValue(myInfo.getPimUserName(),"arockiam");
//			inputValue(myInfo.getPimPassword(),"Victor@123");
//			inputValue(myInfo.getPimConfirmPwd(),"Victor@123");
//			buttonClick(myInfo.getPimSave());
//System.out.println("Toast Msg: "+myInfo.getToastMsg().getText());
//System.out.println(myInfo.getToastMsg().getText().equals("Success"));
//			
//			if(myInfo.getToastMsg().getText().equals("Success")) {
				buttonClick(myInfo.getViewAdminModule());
				inputValue(myInfo.getAdminUserName(), "arockiam");
				buttonClick(myInfo.getAdminSearch());
				Thread.sleep(5000);
				wait(5);
				buttonClick(myInfo.getAdminEdit());
				buttonClick(myInfo.getAdminUserRole());
//			}
//			inputValue(myInfo.getUser(),"arockiam");
//			inputValue(myInfo.getPass(),"Victor@123");
//			buttonClick(myInfo.getLoginButton());
		}
	}
	
	@Test(priority = 1)
	private void my_info() {
		System.out.println("my info method...........!");
		
//		buttonClick(myinfo.getMyinfo());
//		inputValue(myinfo.getInfoFirstName(), "java");
		
	}
	
//	@AfterClass
//	private void ohrm_logout() {
//		wait(5);
//		Ohrm_My_Info_Pom login = new Ohrm_My_Info_Pom(mainDriver);
//		buttonClick(login.getSelectLogOut());
//		buttonClick(login.getLogOut());
//	}

}
