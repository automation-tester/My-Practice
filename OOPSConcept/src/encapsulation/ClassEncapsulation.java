package encapsulation;

public class ClassEncapsulation {
	
	// encapsulation can be achived by declaring the variable or member as private
	
	private String name;
	public String name1;
	
	private void myname(String myname){
		name=myname;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String myname)
	{
		myname(myname);
	}
	
	public static void main(){
		System.out.println("crme");
	}
	
	
	public void callprivate(){
		System.out.println(name="selenium");
		System.out.println(name1);
	}
	
	

}
