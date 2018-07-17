package basicsnative;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException {

	File f=new File("ApkEmulator");
	File apk=new File(f,"ApiDemos-debug.apk");
	
	
	//Create an instance of DesiredCapabilities class
	DesiredCapabilities cap=new DesiredCapabilities();
	
	//Provide the automation name
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	
	//provide platform name
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");//Note this capability is need not to give in the latest versions of appium
	
	if(device.equals("emulator"))
	{
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod Emulator");
	}
	else if(device.equals("real"))
	{
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod Device");
	}
	cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());

	
	//Create an instance of Andriod driver
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	return driver;
	
	}

}
