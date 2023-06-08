package Additionalcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;

public class Loginpage extends Waitforelement {

	public Loginpage(WebDriver wd) {
		super(wd);
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
	
	By Signin=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")");
	
	//Select google option
	By Googlesign=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")");
	
	//Select the Mail account
	By Gmailaccount=MobileBy.id("com.google.android.gms:id/account_name");
	 
	public void Login() {
		waitForElementToAppearAndClick(Signin);
		waitForElementToAppearAndClick(Googlesign);
		waitForElementToAppearAndClick(Gmailaccount);
	}

}
