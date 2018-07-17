package utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class WebdriverCommonUtil {
	
	public static void switchtoAlertIfPresent(WebDriver driver){
		
		try{
			Alert alert=driver.switchTo().alert();
			
		}catch (Exception e) {
			System.out.println("Alert is not present");
			
		}
		
	}

}
