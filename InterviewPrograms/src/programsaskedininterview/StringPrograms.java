package programsaskedininterview;

public class StringPrograms {
	
	//mutability concept of String, String Buffer, String builder
	public static void mutabalityOfString(){
		//The main difference between String, String Buffer and String builder is that String Objects are immutable in nature whereas StringBuffer and StringBuilder Objects are Mutable in nature
		
		//Mutabality wrt to string-- Once we create on Object of the String we cant change the it if we reintialize then will create new Object
		// equals method of the Object class can be overridden to compare the contents of String Object.
		String s1=new String("Automation"); // it will create 2 objects in the heap and string constant pool area
		s1.concat("testing");               // it will create 1 object in string constant pool area
		System.out.println(s1+" immutable wrt String");
		
		//Mutabality wrt to StringBuffer-- Once we create object of stringbuffer we can change the content 
		//Methods are synchonized
		//Thread safety is there
		//Performance wise it is slow
		//equals method of the Object class can't be overridden, it will used to compare the references( equlas method work same as '==')
		StringBuffer sf=new StringBuffer("Automation");
		sf.append("Testing");
		System.out.println(sf+" mutabale wrt StringBuffer");
		
		//Mutability wrt String Builder-- Once we create object of stringbuilder we can change the content
		//Methods are not synchonized
		//No Thread safety
		//Performance wise it is fast
		//equals method of the Object class can't be overridden, it will used to compare the references( equlas method work same as '==')
		StringBuilder sb=new StringBuilder("Automation");
		sb.append("testing");
		System.out.println(sb+" mutable wrt StringBuilder");
		
		
		String s2=new String("Naveen");
		String s3=new String("Naveen");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));  //it will override the equals method and compares the contents
		
		StringBuffer sb1=new StringBuffer("Naveen");
		StringBuffer sb2=new StringBuffer("Naveen");
		System.out.println(sb1==sb2);         //it will compare the references
		System.out.println(sb1.equals(sb2)); // it will not override the equals method and it compares the references
	}
	
///////////////////////////////////////////////String vs String buffer vs String builder differences//////////////////////////////////////////
	
///////////////////////////////////////////////Revese the String ////////////////////////////////////////////////////////////////////////////
	//Using String class  methods
	public static void reverseString(){
		
		String actual="criminal";
		String expected="";
		
		for(int i=actual.length()-1;i>=0;i--)
		{
			expected=expected+actual.charAt(i);
		}
		
		System.out.println("Reveresed String is "+expected);
	}
	
	//Using StringBufferMethod
	public static void reverseStringusingStringBuffer(){
		
		StringBuffer sb=new StringBuffer();
		sb.append("automation");
		System.out.println("Reversed string using StringBufferClass "+sb.reverse());
	}
	
	
	public static void methodsOfStringJava(){
		
		String s1="criminal";
		System.out.println("Size of the string "+s1.length());
		
		System.out.println("charecter at "+s1.charAt(5));
		
		System.out.println("String starts with "+s1.startsWith("cha"));
		
		System.out.println("String ends with "+s1.endsWith("cro"));
		
		String s2="case";
		
		System.out.println("Concatinated string is "+s1.concat(s2));
		
		char[] arr=s1.toCharArray();
		int num=arr.length;
		for(int j=0;j<num;j++){
			System.out.println("charecter array "+arr[j]);
		}
		System.out.println("Index of charecter "+s1.indexOf('i'));
		
		System.out.println("String is empty or not "+s1.isEmpty());
		
		System.out.println("Extract the text "+s1.substring(0, 2));
		
		System.out.println("Replace the string "+s1.replace('i', 'o'));
	
	}
	
	public static void stringMutability(){
		
		StringBuffer s1=new StringBuffer("123");
		String s2="123";
		s1.append("abc");
		System.out.println(s1);
		s2=s2.concat("abc");
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		mutabalityOfString();
		
		reverseString();
		
		reverseStringusingStringBuffer();
		
		 methodsOfStringJava();
		 
		 stringMutability();
		
	}

}
