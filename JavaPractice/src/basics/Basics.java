package basics;



public class Basics {
	
	public static void main(String[] args) {
		
		printWord();
		
		print1To10Verticle();
		
		print1To10Verticle2();
		
		print1To100TwoDimention();
		
		print1To45TwoDimention();
		
		print45To1TwoDimention();
		
		printLeftHyp();
	}
	
///////print some word//////	
	public static void printWord(){
		
		System.out.println("I am printing \"Hello world\"");
	}
	
	
//////print 1 to 10 in verticle line///
	public static void print1To10Verticle(){
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
////////////or
	
	public static void print1To10Verticle2(){
		int n=1;
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			n++;
		}
	}
	
/////  print 1 to 100 in two dimention//////////
	public static void print1To100TwoDimention(){
		//int n=1;
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                System.out.print( "*   "); // print * needed
                //n++;
            }
            System.out.println();
        }
	}
	
///print 1 to 45 in two dimention ////////
	
	public static void print1To45TwoDimention(){
		//int n=1;
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print("*    "); // print * if needed
               // n++;
            }
            System.out.println();
        }
	}
	
///print 45 to 1 in two dimension /////
	
	public static void print45To1TwoDimention(){
		//int n=1;
        for(int i=0; i<10; i++)
        {
            for(int j=10; j>i; j--)
            {
                System.out.print("*    "); // print * if needed
               // n++;
            }
            System.out.println();
        }
	}
	
	
////left hypotinuese
	
	public static void printLeftHyp(){
		//int n=1;
        for(int i=0; i<5; i++)
        {
            for(int j=4; j>i; j--)
            {
                System.out.print(" "); // print * if needed
               // n++;
            }
            System.out.println("* ");
        }
	}
	
}
