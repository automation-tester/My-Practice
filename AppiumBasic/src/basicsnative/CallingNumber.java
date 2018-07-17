package basicsnative;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CallingNumber extends BaseAppPackAndActi {
	
	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver=packageAndActivityGeneric("com.android.contacts", "com.android.contacts.DialtactsActivityAlias");
		
		driver.findElementByAccessibilityId("eight").click();
		driver.findElementByAccessibilityId("one").click();
		driver.findElementByAccessibilityId("two").click();
		driver.findElementByAccessibilityId("three").click();
		driver.findElementByAccessibilityId("two").click();
		driver.findElementByAccessibilityId("five").click();
		driver.findElementByAccessibilityId("three").click();
		driver.findElementByAccessibilityId("two").click();
		driver.findElementByAccessibilityId("seven").click();
		driver.findElementByAccessibilityId("nine").click();
		
		driver.findElementById("com.android.contacts:id/sim1_dial_btn").click();
		
		
		
		
	}
	
	

}
