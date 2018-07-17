package basicsnative;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends AppiumBase{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		
		/*AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		
		// tap, longress and handling popup
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

		//tap
		TouchAction t=new TouchAction(driver);
		t.tap(driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")")).perform();
		System.out.println("Tapped on expanded list");
		
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		System.out.println("Clicked on custom adopter");
		
		//long press
		t.perform().press(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).waitAction(Duration.ofMillis(5000)).release().perform();
		//t.longPress(driver.findElementByAndroidUIAutomator("text(\"People Names\")")).release();
		
		System.out.println(driver.findElementById("android:id/title").getText());*/
		
		
		
		//Scroll, swipe, drag and drop
		
		
	}

}
