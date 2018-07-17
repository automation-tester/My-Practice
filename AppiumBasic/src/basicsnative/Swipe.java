package basicsnative;

import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends HybridBase{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=capabilities("real");
		
		
		// tap, longress and handling popup
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("clicked on views");
		
		driver.findElementByXPath("//*[@text='Date Widgets']").click();
		System.out.println("clicked on date widgets");
		
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		System.out.println("clicked on inline");
		
		driver.findElementByAccessibilityId("9").click();
		
		TouchAction t=new TouchAction(driver);
		
		t.press(driver.findElementByAccessibilityId("15")).waitAction(Duration.ofMillis(2000)).moveTo(driver.findElementByAccessibilityId("35")).release().perform();
		System.out.println(" Swiped from 15 to 35");
		
	}

}
