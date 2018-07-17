package pack2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	public void doItBeforTest(){
		
		System.out.println("This method executes before all test cases");
	}
	
	@BeforeMethod
	public void doItBeforMethod(){
		
		System.out.println("This method executes before each test cases");
	}
	
	
	@Test
	public void test1(){
		
		System.out.println("test1 executed");
		
	}

}
