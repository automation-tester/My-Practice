package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	
	//
	public static Timeouts implicitWait(WebDriver driver, int time){
		
		return driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		
	}
	
	
	public static WebElement explicitWaitIfElementVisible(WebDriver driver, int time, WebElement element){
		WebDriverWait wait=new WebDriverWait(driver, time);
		
		
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	public static void action(WebDriver driver){
		
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.id(""))).sendKeys(Keys.SHIFT);
	}
	
	public static void select(WebDriver driver){
		
		Select s1=new Select(driver.findElement(By.id("")));
		s1.isMultiple();
		
	}
	
	
	

}
