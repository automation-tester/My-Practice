package com.cucumber.step_definationMultipleScenarios;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef2 {
	
	public WebDriver driver;
	
	public StepDef2(HooksClass getdriver) throws Throwable{
		driver=getdriver.user_opens_browser_and_launches_gmail_url();
	}
	
	@Then("^clicks on next link$")
	public void clicks_on_next_link() throws Throwable{	
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
	}
	
	
	@When("^user navigated to the page$")
	public void user_navigated_to_the_page() throws Throwable{
		driver.findElement(By.xpath("html/body/nav/div/a[2]")).click();
		String actual=driver.getTitle();
		Assert.assertTrue("Title not validated properly ", actual.equals("Gmail"));	
	}	

}
