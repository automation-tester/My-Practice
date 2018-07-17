package hybridApp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridBase {
	
	public static void main(String[] args) throws MalformedURLException{
		
	File f=new File("APKRealDevice");
	File apk=new File(f,"WebView Test_v1.0.16_apkpure.com.apk");
	
	
	//Create an instance of DesiredCapabilities class
	DesiredCapabilities cap=new DesiredCapabilities();
	
	//Provide the automation name
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "appium");
	
	//provide platform name
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");//Note this capability is need not to give in the latest versions of appium
	
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Andriod Device");//Note this capability is need not to give in the latest versions of appium
	
	cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());

	
	//Create an instance of Andriod driver
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	driver.findElementByAccessibilityId("Open navigation drawer").click();
	
	int options=driver.findElementsByClassName("com.snc.test.webview2:id/design_menu_item_text").size();
	
	for(int i=0;i<=options;i++)
	{
		if(driver.findElementsById("com.snc.test.webview2:id/design_menu_item_text").get(i).getText().equals("WebView"))
		{
			driver.findElementsById("com.snc.test.webview2:id/design_menu_item_text").get(i).click();
		}
	}
	
	driver.findElementByClassName("android.widget.EditText").clear();
	
	driver.findElementByClassName("android.widget.EditText").sendKeys("google.com");
	
	System.out.println("current app view "+driver.getContext());
	
	driver.findElementById("android:id/button1").click();
	
	Set<String> s=driver.getContextHandles();
	
	for (String views : s) {
		
		System.out.println("view is "+views);
	}
	
	driver.context("WEBVIEW_com.snc.test.webview2");
	
	//driver.findElement(By.)
	driver.context("WEBVIEW_chrome");
	
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing web apps");
	
	driver.context("NATIVE_APP");
	
	driver.findElementByAccessibilityId("Open navigation drawer").click();
	
	
	
	}

}
