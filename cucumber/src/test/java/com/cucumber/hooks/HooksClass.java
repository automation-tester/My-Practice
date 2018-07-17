package com.cucumber.hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	
public static WebDriver driver;
	
	@Before
	public WebDriver user_opens_browser_and_launches_gmail_url() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-web-security");
		option.addArguments("--no-proxy-server");
		option.addArguments("--disable-infobars");
		
		/*Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		option.setExperimentalOption("prefs", prefs);
		*/
		driver=new ChromeDriver(option);
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	
	}
	
	@After
	public void user_closes_the_browser() throws Throwable{
		
		driver.quit();
		driver=null;
	}
	
	

	
	
}
