package programsaskedininterview;

import java.util.Scanner;

public class TypicalPrograms {
	
	public static void main(String[] args) {
		
		enumprint();
		
		System.out.println("Enter the number");
		int numb=(new Scanner(System.in)).nextInt();
		int output=0;
		int temp=numb/10;  //100/10=10  1000/10=100
		for(int i=0;i<temp;i++)
		{
			output=output+11;
			
			if(i==(temp-1))
			{
				output=output+(1);
			}
			System.out.print(output+" ");
		}	
	}

//////////////////////////////////////////////
	
/////////////////////////////////////////////Enum related programs///////////////////////////////////////////////////////////////////////////
	
	public static void enumprint(){
		//How to call enum and print it
		
		System.out.println("Enum jan is "+Month.Jan); //enum can be called by using enum name and object contains only enum value
		System.out.println("Enum jan is "+Month.Feb);
		System.out.println("Enum jan is "+Month.March);
		System.out.println("Enum jan is "+Month.April);
		System.out.println("Enum jan is "+Month.May);
		
		//we can pass enum as argument for switch statement
		
		Month mon=Month.Jan;
		switch (mon) {
		case Jan:
			System.out.println("Starting month of the year");
			break;
		case Feb:
			System.out.println("Second month in the year");
		default:
			System.out.println("It is not belong to any month");
			break;
		}
	}

}
