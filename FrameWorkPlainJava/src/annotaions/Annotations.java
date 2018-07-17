package annotaions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(threadPoolSize=3)
public class Annotations {
	
	
	
	
	@Test
	public void test1(){
		
		System.out.println("test1 executed");
		
	}
	
	
	@Test
	public void test2(){
		
		System.out.println("test2 executed");
	}
	
	
	

}
