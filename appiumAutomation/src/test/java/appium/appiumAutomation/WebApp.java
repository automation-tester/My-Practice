package appium.appiumAutomation;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import basePackage.DataFromAndToExcel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objects.HomePage;

public class WebApp extends BaseClass {
	
	static String excelName="./Exceldata/inputdata.xlsx";
	static String sheetName="Login";
	
	
	@Test
	public void loginPage() throws IOException{
		AndroidDriver<AndroidElement> driver=webAppCapabilities();
		
		String userName=DataFromAndToExcel.readDataFromExcel(excelName,sheetName,0,1);
		String password=DataFromAndToExcel.readDataFromExcel(excelName,sheetName,1,1);
		
		driver.get("http://www.westlaw.com.au");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HomePage h=new HomePage(driver);
		h.userName.sendKeys(userName);
		h.passWord.sendKeys(password);
		h.signIn.click();
		
	}
	
	

}
