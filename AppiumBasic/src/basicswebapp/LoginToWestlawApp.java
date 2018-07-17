package basicswebapp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginToWestlawApp extends BaseWeb {
	
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver=webAppCapabilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.westlaw.com.au");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.name("Username")).sendKeys("anzqahyd3");
		
		driver.findElement(By.name("Password")).sendKeys("Westlaw123");
		
		driver.findElement(By.name("SignIn")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//label[@for='Key_cc6183c5d620e81194213863bb3c6a1c']")).click();
		
		driver.findElement(By.name("SignIn")).click();
		
		System.out.println(driver.getTitle());
			
	}

}
