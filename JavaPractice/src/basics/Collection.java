package basics;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {
	
	public static void main(String[] args) {
		
		
		arraylist();
		
	}
	
	//ArrayList
	public static void arraylist(){
		
		//Since we are not using generic type arraylist
		ArrayList s1=new ArrayList();
		s1.add("crime");
		s1.add("tax");
		
		ArrayList a=new ArrayList();
		a.add(5);
		a.add("kiran");
		a.addAll(s1);
		System.out.println(a);
		
		a.add(1, "harish");
		System.out.println(a);
		
		a.remove(1);
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.contains("hhhh"));
		
		System.out.println(a.toArray());
		
	}

}
