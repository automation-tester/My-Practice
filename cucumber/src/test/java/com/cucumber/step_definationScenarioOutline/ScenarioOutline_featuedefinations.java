package com.cucumber.step_definationScenarioOutline;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioOutline_featuedefinations {
	
	
public static WebDriver driver;
	
	@Given("^user opens browser and launches gmail \"([^\"]*)\"$")
	public void user_opens_browser_and_launches_gmail_url(String arg) throws Throwable{
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
		driver.get(arg);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}
	
	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters_usename(String arg) throws Throwable{
		
		driver.findElement(By.id("identifierId")).sendKeys(arg);
		
	}
	
	@Then("^user enters \"([^\"]*)\" password$")
	public void user_enters_password(String arg) throws Throwable{
		
		driver.findElement(By.name("password")).sendKeys(arg);
		
	}
	
	
	@Then("^clicks on next link$")
	public void clicks_on_next_link() throws Throwable{	
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	}
	
	
	@Then("user closes the browser")
	public void user_closes_the_browser() throws Throwable{
	
		driver.quit();
	}
	
	@When("^user navigated to the page$")
	public void user_navigated_to_the_page() throws Throwable{
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		String actual=driver.getTitle();
		Assert.assertTrue("Title not validated properly ", actual.equals("Gmail"));	
	}

}
