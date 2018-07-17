package com.cucumber.step_definationMultipleScenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import cucumber.api.java.en.Then;

public class MultipleScenarios_featuedefination {
	
public WebDriver driver;
	
	public MultipleScenarios_featuedefination(HooksClass getdriver) throws Throwable{
		driver=getdriver.user_opens_browser_and_launches_gmail_url();
	}
	
	@Then("^user enters \"([^\"]*)\"$")
	public void user_enters_usename(String arg) throws Throwable{
		
		driver.findElement(By.id("identifierId")).sendKeys(arg);
		
	}
	
	@Then("^user enters \"([^\"]*)\" password$")
	public void user_enters_password(String arg) throws Throwable{
		
		driver.findElement(By.name("password")).sendKeys(arg);
	}

}
