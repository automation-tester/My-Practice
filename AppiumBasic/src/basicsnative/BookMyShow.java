package basicsnative;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BookMyShow extends AppiumBase{
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		//System.out.println(driver.findElementById("com.bt.bms:id/language_english").getAttribute("checked"));
		
		driver.findElementById("com.bt.bms:id/language_text_view_label").click();
		System.out.println("Clicked on lets get started");
		
		driver.findElementByXPath("//*[@text='SKIP']").click();
		System.out.println("Clicked on Skip");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Trending in Jukebox\"));");
		System.out.println("Scrolled");
		
		driver.findElementsById("com.bt.bms:id/view_bottom_item_iv").get(3).click();
		System.out.println("Clicked on welcome guest");
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Settings\"));");
		System.out.println("Scrolled to settings");
		
		driver.findElementByAndroidUIAutomator("text(\"Settings\")").click();
		System.out.println("Clicked on settings");
		
		System.out.println(driver.findElementByAndroidUIAutomator("text(\"M-Ticket\")").isSelected());
		
		Point point=driver.findElementById("com.bt.bms:id/settings_f_b_switch").getLocation();
		
		TouchAction t=new TouchAction(driver);
		System.out.println(point.x);
		System.out.println(point.y);
		
		driver.findElementById("com.bt.bms:id/settings_f_b_switch").click();
		
		driver.findElementById("com.bt.bms:id/option_two").click();
		System.out.println("Clicked on the no thanks");
		
		driver.findElementById("com.bt.bms:id/fnb_btn_for_submit").click();
		System.out.println("Clicked on subit button");
		
		t.tap(point.x+20, point.y+30);
		
		
		
		
		
		
		
	}

}
