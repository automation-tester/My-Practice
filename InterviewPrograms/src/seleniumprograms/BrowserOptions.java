package seleniumprograms;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;

public class BrowserOptions {
	
	WebDriver driver;
	
	//ChromeOptions and the FireFoxOptions classes will have multiple not static methods to set the browser options
	
	
	@Test(enabled=false)
	public void browserOptions(){
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//1. setbinary: this method will be used to set the path of the browser exe files
		options.setBinary("./exefiles/chrome.exe");
		driver=new ChromeDriver(options);
		driver.get("http://www.gmail.com");	
	}
	
	
	//ssl certification using browserOptions class
	@Test(enabled=false)
	public static void sslCertification(){
		//way >> 1. create options class object
		// 2. using the object call for setAcceptInSecureCert method in Chrome and FF browser
		//	  In IE browser call setCapabilities and set capability as Access_SSl_Cert
		// then pass the options object to the driver class
		
		//Way >> 1. Create desiredCapabilities class and set the capabilities as ACCess_SSl_Certificate and pass cap to driver classes in FF and Chrome
		// In IE we need to use the Javascript code driver.get(javascript:document.getElementById('overridelink').click());
		// to identify the elements and perform operation in javascript the syntax is javascript:document.getElementById("")
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.cacert.org/");
		driver.quit();
		System.setProperty("webdriver.ie.driver", "./exefiles//IEDriver.exe");
		
		InternetExplorerOptions ie=new InternetExplorerOptions();
		ie.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		InternetExplorerDriver dr=new InternetExplorerDriver(ie);
		dr.get("https://www.cacert.org/");
		dr.quit();
		
	}
	
	@Test(enabled=false)
	public void proxySettings(){
		//with the latest version of selenium we can set http, ftp, ssl socs proxy using browserOptions classes and ProxyClass
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		String proxyAdrress="";	
		Proxy p=new Proxy();
		p.setFtpProxy(proxyAdrress);
		p.setHttpProxy(proxyAdrress);
		options.setProxy(p);
	}
	
	@Test(enabled=true)
	public void disableNotifications(){
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://drupal-stage-web.weather.com/en-IN");
		
	}

}
