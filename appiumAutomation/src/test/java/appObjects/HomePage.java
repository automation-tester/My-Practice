package appObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
	//Create an constructor of this class to capture the driver
	public HomePage(AppiumDriver<AndroidElement>  driver) {
		//concatinate the driver with the findelements using pageFactory to initialize below defined elements
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Preference']")
	public WebElement preferencesLink;
	
	//above method is equals to findElementBy(By.xpath("//*[@text='Preference']"))

}
