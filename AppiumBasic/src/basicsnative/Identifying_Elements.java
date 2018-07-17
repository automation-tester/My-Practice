package basicsnative;

import java.net.MalformedURLException;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Identifying_Elements extends AppiumBase{

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		//identify xpath, id, className,
		driver.findElementByXPath("//*[@text='Preference']").click();
		System.out.println("Clicked on Preferences");
		
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		System.out.println("Clicked on preferences dependencies");
		
		driver.findElementByXPath("//*[@text='Example preference dependency']").isDisplayed();
		System.out.println("Verified the text display");
		
		driver.findElementById("android:id/checkbox").click();
		System.out.println("Selected the wifi check box");
		
		
		driver.findElementByXPath("//*[@text='WiFi settings']").click();
		System.out.println("Clicked on Wifisettings");
		
		driver.findElementById("android:id/edittext_container").sendKeys("bdfgd");
		System.out.println("Entered the wifi password");
		
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}
}
