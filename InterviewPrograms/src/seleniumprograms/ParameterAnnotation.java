package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	
	
	static WebDriver driver;
	
	@Test
	
	@Parameters({"url","browser"})
	public void parameter(@Optional String url,@Optional String browser){
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver=new ChromeDriver();
		}
		driver.get(url);
		
	}

}
