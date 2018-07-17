package basicsnative;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndriodUiAutomatorLocator extends AppiumBase {
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Validate the features which all are not clickable
		
		//System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector(),clickable(false)").size());
		
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
	}

}
