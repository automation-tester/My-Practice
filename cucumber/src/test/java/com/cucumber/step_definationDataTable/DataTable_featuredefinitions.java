package com.cucumber.step_definationDataTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTable_featuredefinitions {
	
	
public static WebDriver driver;
	
	@Given("^user opens browser and launches gmail url$")
	public void user_opens_browser_and_launches_gmail_url() throws Throwable{
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--disable-web-security");
		option.addArguments("--no-proxy-server");
		option.addArguments("--disable-infobars");
		
		/*Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		option.setExperimentalOption("prefs", prefs);
		*/
		driver=new ChromeDriver(option);
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	
	@When("^user navigated to the page$")
	public void user_navigated_to_the_page() throws Throwable{
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		String actual=driver.getTitle();
		Assert.assertTrue("Title not validated properly ", actual.equals("Gmail"));	
	}
	
	
	@Then("^user verifies the username text box display and enter username$")
	public void user_verifies_the_username_text_box_display_and_enter_username(DataTable table) throws Throwable{
		
		Assert.assertTrue(driver.findElement(By.id("identifierId")).isDisplayed());
		driver.findElement(By.id("identifierId")).click();
		
		List<List<String>> data=table.raw();
		driver.findElement(By.id("identifierId")).sendKeys(data.get(0).get(1));
	}
	
	
	@Then("^clicks on next link$")
	public void clicks_on_next_link() throws Throwable{	
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	}
	
	@Then("^user verifies the password text box display and enter password$")
	public void user_verifies_the_password_text_box_display_and_enter_password(DataTable table) throws Throwable{
		
		List<List<String>> data=table.raw();
		
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(0));
	}
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws Throwable{
	
		driver.quit();
	}
	


}
