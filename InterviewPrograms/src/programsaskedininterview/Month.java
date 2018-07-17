package programsaskedininterview;

public enum Month {
	
	/* 1. enum in java implemented after 1.0 version on the basis of class
	   2. If we want to represent a group of constants then we shuold go for enum
	   3. To create our own data types we go for enum
	   4. Return type of enum is name of the enum
	   5. We need to separate the constants with ','
	   6. There is no rules that we should use ; or not
	   7. all the enum constants are public static and final by default
	   8. enum can be accesed using the enum name . constant ie enum.Jan etc
	   9. Printing the enum will get enum itself
	   10. We can refine enum within the class or outside the class
	   11. enum canot be declared inside the method because it is data memeber.
	   12. we cant use final or abstract for enum, so only applicable modifiers if enum defined outside the class are public, default and strictfp
	   13. if enum is inside the class then we can define it as public, private, protected, static, default and strictfp
	   14. We can pass enum as switch argument after 1.5 v after 1.7v we can pass String also as argument
	   Note(1.5 onwards wrapper classes Byte, Charecter, Short and Integer + enum)
	   
	   enum vs interface
	   1. all the enum classes are immediate direct child of class enum present under java.lang.enum, Since multiple inheritance is not possible in java wrt class enum can't extend any other enum
	   2. Since all the enumbs are final public and static implicitly, so we can't create a child class
	   3. Hence inheritance concept is not applicable for enum explicitly and we can't use extends keyword for enum
	   4. we cant use exnted keyword with respect to enum or class (Because by default enum extends java.lang.enum and it is final)
	*/
	
	Jan 		// it is equals to public static final Month Jan=new Month();
	,Feb		// it is equals to public static final Month Feb=new Month();
	,March		// it is equals to public static final Month March=new Month();
	,April
	,May
	,June
	,July
	,Aug
	,Sep
	,Oct
	,Nov
	,Dec;
	
	

}


