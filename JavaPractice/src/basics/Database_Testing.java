package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database_Testing {
	
	
	public static void main(String[] args) throws SQLException {
		
		String host="localhost";
		String port="3306";  //default
		//url="jdbc:mysql://"+host+":"+port+"/databasename"
		
		//made connection to sql server
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/testing", "root", "Gkgs@1992");
		
		//set path between java and the sql server ie statement
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from empdetails where id='23';");
		
		while(rs.next())
		{
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("location"));
		}
	}
	

}
