package basicsnative;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Miscellanious  extends AppiumBase{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		System.out.println("the screen is locked"+driver.isLocked());
		
		System.out.println("The current activity is"+driver.currentActivity());
		
		System.out.println("The current running app is"+driver.getContext());
		
		System.out.println("the prientaion is"+driver.getOrientation());
		
		// tap, longress and handling popup
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("Clicked on views");
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("returned to back");
		
		driver.pressKeyCode(AndroidKeyCode.HOME);
		System.out.println("Navigated to home page");
		

		
		
		
	}

}
