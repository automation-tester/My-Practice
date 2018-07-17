package encapsulation;

public class ClassB extends ClassEncapsulation{

	public static void main(String[] args) {
	 
		ClassEncapsulation s1=new ClassEncapsulation();
		s1.callprivate();
		s1.main();
		System.out.println(s1.name1);
		s1.setName("crime");
		System.out.println(s1.getName());
	}
	
	
	
}
