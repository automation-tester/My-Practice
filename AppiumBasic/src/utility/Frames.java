package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Frames {
	
	public static int findingFrameNumbers(WebDriver driver, By by)
	{
		int i;
		int numberOfFrames=driver.findElements(By.tagName("iframe")).size();
		
		for(i=0;i<=numberOfFrames;i++)
		{
			//find in which frem the element is present
			int countOfElement=driver.findElements(by).size();
			if(countOfElement>0)
			{
				break;
			}
			else
			{
				System.out.println("Contuine searching of element");
			}
		}
		return i;
		
	}
	
	
	public void softassertion(){
		
		
		
	}
}
