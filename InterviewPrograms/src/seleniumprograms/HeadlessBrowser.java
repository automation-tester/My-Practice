package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.Zip;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	
	//Runing the testscripts without opening the browser ui
	
	//Disadvantages: it is not recomended to go for the headless browser testing because we cant able headless browser testing will not find bugs as we do using UI
	
	//Headless  browser testing can be done using Chrome, Firefox, Htmlunit, panthonJS
	
	@Test
	public void headlessChrome(){
		
		//set the path of the chrome browser
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Create ChromeOptions class Object
		ChromeOptions chr=new ChromeOptions();
		
		//Create headless browser using setHeadLess method and set it to true
		chr.setHeadless(true);
		
		ChromeDriver driver=new ChromeDriver(chr);
		driver.get("http://www.gmail.com");
		
		System.out.println("Title of the video is "+driver.getTitle());	
	}
	
	
	@Test(enabled=false)
	public void headlessFFF(){
		
		//set the path of the chrome browser
		//System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		//Create ChromeOptions class Object
		FirefoxOptions ff=new FirefoxOptions();
		
		//Create headless browser using setHeadLess method and set it to true
		ff.setHeadless(true);
		
		FirefoxDriver driver=new FirefoxDriver(ff);
		driver.get("http://www.gmail.com");
		
		System.out.println("Title of the video is "+driver.getTitle());	
	}

	
	@Test
	public void zipAndUnzipUsingSelenium() throws IOException{
		//We can zip and unzip the contents using the zip(), unzip() methods present under Zip class of selenium.io
		Zip.zip(new File("C:/Users/u6043473/Documents/My Learning Documents"));
		
	}
}
