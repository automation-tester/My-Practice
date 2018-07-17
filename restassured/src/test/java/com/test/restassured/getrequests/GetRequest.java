package com.test.restassured.getrequests;

import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.restassured.restclients.RestGetClient;
import com.restassured.testbsae.BaseClass;

public class GetRequest extends BaseClass{
	
	public BaseClass base;
	public String endpointUrl;
	public String serviceUrl;
	public String uri;
	public CloseableHttpResponse closableRes;
	
	
	@BeforeMethod
	public void preconfig(){
		
		base=new BaseClass();
		endpointUrl=prop.getProperty("endpointurl");
		serviceUrl=prop.getProperty("serviceurl");
		uri=endpointUrl+serviceUrl;
	}

	
	@Test
	public void firstGetRequest() throws ClientProtocolException, IOException{
		
		RestGetClient getreq=new RestGetClient();
		closableRes=getreq.get(uri);
		
		
		//Status code
		int statusCode=closableRes.getStatusLine().getStatusCode();
		System.out.println("Status code is "+statusCode);
		
		Assert.assertEquals(statusCode,Response_status_code_200,"status code is wrong");
		
		//Responsebody
		String stringres=EntityUtils.toString(closableRes.getEntity(), "UTF-8");
		
		//To convert responsebody to JSON format
		JSONObject jsonFormat=new JSONObject(stringres);
		
		System.out.println("JSON output is "+jsonFormat);
		
		
		//To get the header array output
		Header[] headerarray=closableRes.getAllHeaders();
		
		//create hash map
		HashMap<String, String> headersList=new HashMap<String, String>();
		for (Header header : headerarray) {
			//add values from the header array to hashmap
			headersList.put(header.getName(), header.getValue());
			
		}
		
		System.out.println("All the headers are "+headersList);
		
	}
		
	
	
	@Test
	public void secondGetRequestwithHeader() throws ClientProtocolException, IOException{
		
		RestGetClient getreq=new RestGetClient();
		
		HashMap<String, String> headers=new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		
		closableRes=getreq.get(uri+prop.getProperty("pathvariable"),headers);
		
		//Status code
		int statusCode=closableRes.getStatusLine().getStatusCode();
		System.out.println("Status code is "+statusCode);
				
		Assert.assertEquals(statusCode,Response_status_code_200,"status code is wrong");
				
		//Responsebody
		String stringres=EntityUtils.toString(closableRes.getEntity(), "UTF-8");
				
		//To convert responsebody to JSON format
		JSONObject jsonFormat=new JSONObject(stringres);
				
		System.out.println("JSON output is "+jsonFormat);
				
		
		//To get the header array output
		Header[] headerarray=closableRes.getAllHeaders();
				
		//create hash map
		HashMap<String, String> headersList=new HashMap<String, String>();
		for (Header header : headerarray) {
		//add values from the header array to hashmap
		headersList.put(header.getName(), header.getValue());
					
		}
				
		System.out.println("All the headers are "+headersList);
		
	}
	
	
	/*@Test
	public void thirdGetRequest() throws ClientProtocolException, IOException{
		
		RestGetClient getreq=new RestGetClient();
		getreq.get(uri+"/23");
	}*/
	
	
}
