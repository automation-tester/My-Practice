package basicsnative;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBase {
	
	public static AndroidDriver<AndroidElement> basicCapabilities() throws MalformedURLException {
		
		/*File f=new File("ApkEmulator");
		File apk=new File(f,"ApiDemos-debug.apk");*/
		
		File f1=new File("APKRealDevice");
		File apk1=new File(f1,"BookMyShow–Movie Tickets Plays_v5.4.2_apkpure.com.apk");
		
		
		//Create an instance of DesiredCapabilities class
		DesiredCapabilities cap=new DesiredCapabilities();
		
		//Provide the automation name
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
		
		//provide platform name
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");//Note this capability is need not to give in the latest versions of appium
		
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod Device");//Note this capability is need not to give in the latest versions of appium

//********************************************************************************************************************************************		
		//provide tha path of APK file,  for the better understanding add the apk file to project
		//cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		
//******************************************************************************************************************************************************************		
		cap.setCapability(MobileCapabilityType.APP, apk1.getAbsolutePath());

		
		//Create an instance of Andriod driver
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
		
	}

}
