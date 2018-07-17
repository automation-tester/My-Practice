package basicsnative;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAppPackAndActi{
	
	public static AndroidDriver<AndroidElement> packageAndActivityGeneric(String appPackage,String appActivity) throws MalformedURLException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO F1s");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		
		cap.setCapability("appPackage", appPackage);
		
		cap.setCapability("appActivity", appActivity);
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
