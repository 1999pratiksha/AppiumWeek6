package Additionalcomponent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileBy;

public class Logoutpage extends Waitforelement {

	public Logoutpage(WebDriver wd) {
		super(wd);
		this.driver=wd;
		PageFactory.initElements(driver, this);
	}
	//Click on Settings
    By Setting=MobileBy.AccessibilityId("Settings");
    
    //Scrollinto view the element
    By ScrollIntoview=MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Sign out\"))");
    
    //Signout
    By Signout=MobileBy.id("android:id/button1");
    
    public void Logout() {
    	waitForElementToAppearAndClick(Setting);
    	waitForElementToAppearAndClick(ScrollIntoview);
    	waitForElementToAppearAndClick(Signout);
    }
}
