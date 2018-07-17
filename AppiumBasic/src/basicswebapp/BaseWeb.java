package basicswebapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseWeb {
	
	public static AndroidDriver<AndroidElement> webAppCapabilities() throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod device");
		
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		return driver;
	}

}
