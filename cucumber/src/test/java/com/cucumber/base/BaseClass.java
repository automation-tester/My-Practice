package com.cucumber.base;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.aventstack.extentreports.gherkin.model.Scenario;

public class BaseClass {
	
	@BeforeClass
	public void cleanUp(){
		System.out.println("Cleaning the proxy");
	}
	
	@AfterClass
	public void uponFailure(){
		if(fa)
	}

}
