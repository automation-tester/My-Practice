package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng {
	
	WebDriver driver;
	@Test
	public void launchbrowser(){
		
		System.out.println("Launches the browser");
	}
	
	@Test
	public void openWebpage(){
		//System.setProperty("webdriver.ff.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		Assert.assertTrue(driver.getTitle().equals("mhkhk"));
		
	}

}