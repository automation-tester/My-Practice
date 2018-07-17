package basicsnative;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import basicswebapp.BaseWeb;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WebApplication extends BaseWeb{
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=webAppCapabilities();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://cricbuzz.com");
		
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		
		driver.findElement(By.linkText("Home")).click();
		
		System.out.println(driver.getCurrentUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h4[text()='Cricket Videos']")));
		//jse.executeScript("window.scrollBy(0,580)", "");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if(driver.findElement(By.xpath("//h4[text()='Cricket Videos']")).getAttribute("class").contains("header"))
		{
			System.out.println("pass");
		}
		else {
			
			System.out.println("fail");
			
		}
		
		
		
	}
	
	

}
