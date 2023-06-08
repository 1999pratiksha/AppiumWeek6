package Testcases;

import org.testng.annotations.Test;

import Additionalcomponent.Loginpage;
import Additionalcomponent.Logoutpage;
import Desiredcapablity.Desiredcap;
import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class Testcases extends Desiredcap{
	AndroidDriver<AndroidElement> driver;
	
	@Test
	private void Login_Logout() throws MalformedURLException {
		driver=capablities();
		Loginpage logapplication=new Loginpage (driver);
		logapplication.Login();
		Logoutpage logoutapplication=new Logoutpage(driver);
		logoutapplication.Logout();
	}
	
    
}
