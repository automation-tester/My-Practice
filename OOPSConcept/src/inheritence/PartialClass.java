package inheritence;

public abstract class PartialClass {
	
	String ka;
	String s1;
	
	public PartialClass(String ak, String s2) {
		
		this.ka=ak;
		this.s1=s2;
	}
	
	abstract void main();
	
	public void main(int j){
		System.out.println(j);
	}

}
