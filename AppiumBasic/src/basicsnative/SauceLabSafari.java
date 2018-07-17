package basicsnative;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class SauceLabSafari {
	
	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities dc=DesiredCapabilities.iphone();
		dc.setCapability("platformName", "iOS");

		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);

		dc.setCapability("platformVersion", "10.1");

		//cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.1");

		dc.setCapability("appiumVersion", "1.7.2");

		dc.setCapability("deviceName", "iPhone Simulator");

		dc.setCapability("browserName", "safari");
		
		IOSDriver<IOSElement> driver=new IOSDriver<>(new URL("http://harishrbhn:6a19acf6-cbca-44fc-9319-e86ad7eb731e@ondemand.saucelabs.com:80/wd/hub"), dc);
		
		driver.get("http://www.google.com");
	}

}
