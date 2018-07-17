package annotaions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {
	
	@BeforeClass
	public void doItBeforeClass(){
		
	System.out.println("This will run before each class executes");	
	}
	
	@BeforeSuite
	public void doItBeforeSuite(){
		
	System.out.println("This will run before suite");	//example testng suite
	}
	
	
	@AfterClass
	public void doItAfterClass(){
		
	System.out.println("This will run before each class executes");	
	}
	
	@AfterSuite
	public void doItAfterSuite(){
		
	System.out.println("This will run after suite");	//example testng suite
	}


}
