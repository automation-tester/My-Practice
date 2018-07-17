package basicsnative;

import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeVericleAndHorizontal extends AppiumBase{
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=basicCapabilities();
		Dimension size=driver.manage().window().getSize();
		int starty=(int) (size.height*.50);
		int endy=(int) (size.height*.20);
		int startx= (size.width)/2;
	
		

	}

}
