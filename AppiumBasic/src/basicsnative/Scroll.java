package basicsnative;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Scroll extends AppiumBase {
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// tap, longress and handling popup
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("clicked on views");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	}

}
