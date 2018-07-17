package basicsnative;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends AppiumBase{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// tap, longress and handling popup
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		System.out.println("clicked on views");
		
		driver.findElementByAccessibilityId("Drag and Drop").click();
		System.out.println("Clicked on drag and drop");
		
		TouchAction t=new TouchAction(driver);
		
		t.longPress(driver.findElementById("io.appium.android.apis:id/drag_dot_1")).moveTo(driver.findElementById("io.appium.android.apis:id/drag_dot_3")).release().perform();
		System.out.println("draged and droped the element");
		
	}

}
