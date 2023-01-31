package main.ohrm.Profile.Menu_06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ohrm_My_Info_Pom {

	public Ohrm_My_Info_Pom(WebDriver mainDriver) {
		PageFactory.initElements(mainDriver, this);
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
	
	@FindBy(xpath = "//a[contains(@href,'viewPimModule')]")
	private WebElement pim;
	public WebElement getPim() {
		return pim;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	private WebElement addButton;
	public WebElement getAddButton() {
		return addButton;
	}
	
	@FindBy(name = "firstName")
	private WebElement pimFirstName;	
	public WebElement getPimFirstName() {
		return pimFirstName;
	}
	
	@FindBy(name = "middleName")
	private WebElement pimMiddleName;	
	public WebElement getPimMiddleName() {
		return pimMiddleName;
	}
	
	@FindBy(name = "lastName")
	private WebElement pimLastName;	
	public WebElement getPimLastName() {
		return pimLastName;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement pimEmpId;
	public WebElement getPimEmpId() {
		return pimEmpId;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")
	private WebElement pimCreateLogin;
	public WebElement getPimCreateLogin() {
		return pimCreateLogin;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")
	private WebElement pimUserName;
	public WebElement getPimUserName() {
		return pimUserName;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")
	private WebElement pimPassword;	
	public WebElement getPimPassword() {
		return pimPassword;
	}

	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")
	private WebElement pimConfirmPwd;
	public WebElement getPimConfirmPwd() {
		return pimConfirmPwd;
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement pimSave;
	public WebElement getPimSave() {
		return pimSave;
	}
	
	@FindBy(xpath = "/html/body/div/div[2]/div/div[1]/div[2]/p[1]")
	private WebElement toastMsg;	
	public WebElement getToastMsg() {
		return toastMsg;
	}
	
	@FindBy(xpath = "//a[contains(@href,'viewAdminModule')]")
	private WebElement viewAdminModule;
	public WebElement getViewAdminModule() {
		return viewAdminModule;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	private WebElement adminUserName;
	public WebElement getAdminUserName() {
		return adminUserName;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")
	private WebElement adminSearch;
	public WebElement getAdminSearch() {
		return adminSearch;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/button[2]")
//	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/button[2]")
	private WebElement adminEdit;
	public WebElement getAdminEdit() {
		return adminEdit;
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")
	private WebElement adminUserRole;
	public WebElement getAdminUserRole() {
		return adminUserRole;
	}

	@FindBy(xpath = "//a[contains(@href,'viewMyDetails')]")
	private WebElement myinfo;	
	public WebElement getMyinfo() {
		return myinfo;
	}
	
	@FindBy(name = "firstName")
	private WebElement infoFirstName;
	public WebElement getInfoFirstName() {
		return infoFirstName;
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
