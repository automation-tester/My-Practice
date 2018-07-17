package seleniumprograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Basics {
	
	
	WebDriver driver;
	
	@Test
	public void basicslearing()
	{
	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-infobars");
	options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
	driver=new ChromeDriver(options);
	
	driver.get("https://chercher.tech");
	
	driver.manage().window().maximize();
	//driver.manage().window().setSize(new Dimension(200, 200));
	}
}
