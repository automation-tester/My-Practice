package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class SslCertification {
	
	@Test
	public void sslHandling(){
		
		
		
		//firefox type 2
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		FirefoxDriver driver1=new FirefoxDriver(cap);
		driver1.get("https://www.cacert.org");
		
		
		DesiredCapabilities cap1=new DesiredCapabilities();
		cap1.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver3=new ChromeDriver(cap1);

		System.setProperty("webdriver.ie.driver", "./IEDriver.exe");
		WebDriver driver4=new InternetExplorerDriver();
		driver4.get("https://www.cacert.org");
		driver4.get("javascript:document.getElementById('overridelink').click();");
		
	}

}
