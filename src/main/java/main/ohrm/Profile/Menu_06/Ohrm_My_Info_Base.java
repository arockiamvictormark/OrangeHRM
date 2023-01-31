package main.ohrm.Profile.Menu_06;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrm_My_Info_Base {
	
	public static WebDriver baseDriver;
	
	public static WebDriver driverLaunch() {
		baseDriver=new ChromeDriver();
//		baseDriver.manage().window().maximize();
		return baseDriver;
	}
	
	public static void loginUrl(String url) {
		baseDriver.get(url);
	}
	
	public static void wait(int t) {
		baseDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
	}
	
	public static void inputValue(WebElement we,String eValue) {
		we.clear();
		we.sendKeys(eValue);
	}
	
	public static void buttonClick(WebElement we) {
		we.click();
	}

}
