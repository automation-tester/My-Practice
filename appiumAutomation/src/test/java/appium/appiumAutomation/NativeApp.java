package appium.appiumAutomation;

import java.net.MalformedURLException;
import org.testng.annotations.Test;

import appObjects.HomePage;
import basePackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * Unit test for simple App.
 */
public class NativeApp extends BaseClass{
	
	@Test
	public void basicTest() throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=nativeAppCapabilities();
		//create object of page objcets class
		
		HomePage home=new HomePage(driver);
		
		home.preferencesLink.click();
	
	}
 
}
