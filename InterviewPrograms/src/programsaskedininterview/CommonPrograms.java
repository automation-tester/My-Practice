package programsaskedininterview;

import java.util.Scanner;

public class CommonPrograms {
	
///////////////////////////////////////////////////progrm to print febonacci series/////////////////////////////////////////////////////////
	public static void febinocciSeries(){
		//initialize numbers 0,0,1
		int a=0, b=0, c=1;
		
		//Read the number for which we need find the febinocci series
		System.out.println("Enter number");
		int n=new Scanner(System.in).nextInt();
		
		for(int i=1;i<=n;i++)
		{
			//put b to a
			a=b;
			//put c to b
			b=c;
			
			//add a nd b
			c=a+b;
			
			//print a
			System.out.print(a+"");
		}	
	}
	
///////////////////////////////////////////////////Febonacci series ended////////////////////////////////////////////////////////////////////
	
/////////////////////////////////////////////////////factorial number///////////////////////////////////////////////////////////////////////	
	
	public static void factorialNumber(){
		
		int number=5;
		
		//initialize fact to 1
		int fact = 1;
		
		for(int i=5;i>=1;i--)  // for(int i=1;i<=5;i++)
		{
			//multiply first number with second number
			fact=fact*i;
		}
		
		System.out.print("Factorial of number "+fact);
	}
	
///////////////////////////////////////////factorial of number is completed///////////////////////////////////////////////////////////////////	

//////////////////////////////////////////////Reverse number and check if it is palindrome or not////////////////////////////////////////////
	
	public static void palindromeOrNotWRTNumber(){
		
		int number=5665;
		int reverse=0;
		
		//reverse number
		while(number>0)
		{
			//multiply reverse number with 10 and add modulus of number by 10
			reverse=(reverse*10)+(number%10);
			
			//quotient to the main number
			number=number/10;
		}
		System.out.println("Reverse number is "+reverse);	
		
		//palindrome or not
		if(reverse==number){
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		
	}
	
////////////////////////////////////////////////palindrome program w r t number is complated /////////////////////////////////////////////////
	
////////////////////////////////////////////////Swap numbers /////////////////////////////////////////////////////////////////////////////////
	
	
	
///////////////////////////////////////Swap numbers/////////////////////////////////////////
	
////////////////////////////////////How to remove junk charecters///////////////////////////
	
	public static void junkCharecters(){
		
		String junk="%@$# selenium *#%^ tester @&&% ";
		
		//we can remove the junk charecters in two ways 1. check chrecter by charecter in the string and then check it is matching with ascii values then remove
		// 2. write the regular expressions [^a-zA-Z0-9] and replace with ""
		
		junk=junk.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After removing junk "+junk);
		
	}
	
	
///////////////////////////////////	removing junk charecters////////////////////////////// 
	
	public static void main(String[] args) {
		System.out.println("Febinocci sereis");
		febinocciSeries();
		
		System.out.println("\nFactorial of number");
		factorialNumber();
		
		System.out.println("\nPlanidrome or not wrt to number");
		palindromeOrNotWRTNumber();
		
		System.out.println("\nRemoving junk charecters");
		junkCharecters();
	}

}
