package basePackage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static Logger log=Logger.getLogger(BaseClass.class);
	
	
	@BeforeSuite
	public void startAppium() throws IOException, InterruptedException{
		
		//We need to create a batch file which contains "path for node.ece" "path for main.js"
		// execute the batch file using Runtime.getRunTime().exec("cmd /c start batchfilepath)
		
		Runtime.getRuntime().exec("cmd /c start C:/Users/u6043473/appium/appiumserver.bat");
		log.info("Launched appium server ");
		Thread.sleep(20000);
	}
	
	public static AndroidDriver<AndroidElement> nativeAppCapabilities() throws MalformedURLException{
		
		File f=new File("apkfiles");
		File apk=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();	
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		log.info("Launched andriod driver for native app testing");
		return driver;
	}
	
	public static AndroidDriver<AndroidElement> webAppCapabilities() throws MalformedURLException{
		
		DesiredCapabilities cap=new DesiredCapabilities();	
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		log.info("Launched andriod driver for mobile we app testing");
		return driver;
	}


}
