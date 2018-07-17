package datahiding;

public class DataHiding {
	
	
	//Confidential data should not go out of the organization or other person for that reason we need to hide the data 
	
	// data hiding can be achived by declaring variable as private 
	
	//after declaring as private then access it by using the methods which returns the value
	
	private double balance;
	
	public double getBalance(){
		//Do validation to check if the user is having account or not
		
		return balance;
		
	}
	

}
