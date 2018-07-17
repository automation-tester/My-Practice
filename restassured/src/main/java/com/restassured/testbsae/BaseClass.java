package com.restassured.testbsae;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	
	public Properties prop;
	
	public static int Response_status_code_200=200;
	public static int Response_status_code_500=500;
	public static int Response_status_code_201=201;
	public static int Response_status_code_202=202;
	public static int Response_status_code_400=400;
	public static int Response_status_code_401=401;
	public static int Response_status_code_404=404;
	
	public BaseClass(){
		
		prop=new Properties();
		try {
			FileInputStream f1=new FileInputStream("./src/main/java/com/restassured/config/config.properties");
			
				prop.load(f1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
	}

}
