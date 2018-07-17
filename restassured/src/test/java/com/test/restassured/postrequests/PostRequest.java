package com.test.restassured.postrequests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restassured.data.Users;
import com.restassured.restclients.RestPostClient;
import com.restassured.testbsae.BaseClass;

public class PostRequest extends BaseClass {
	
	public BaseClass base;
	public String endpointusrl;
	public String serviceurl;
	public String uri;
	public RestPostClient postClient;
	public CloseableHttpResponse postResponse;
	
	@BeforeMethod
	public void setup(){
		base=new BaseClass();
		endpointusrl=prop.getProperty("endpointurl");
		serviceurl=prop.getProperty("serviceurl");
		uri=endpointusrl+serviceurl;
	}
	
	
	@Test
	public void firstPostRequest() throws JsonGenerationException, JsonMappingException, IOException{
		
		postClient=new RestPostClient();
		
		HashMap<String, String> headers=new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
	
		//convert java to JSON
		ObjectMapper mapper=new ObjectMapper();
		Users user=new Users("harish", "QA");
		
		//write the values to json file
		mapper.writeValue(new File("./JSON/payload.json"), user);
		
		//read json in String format
		String payload=mapper.writeValueAsString(user);
		
		postResponse=postClient.post(uri, payload, headers);
		
		//status code
		int statusCode=postResponse.getStatusLine().getStatusCode();
		System.out.println("Status code is "+statusCode);
		Assert.assertEquals(statusCode, Response_status_code_201,"Status code is wrong");
		
		//Responsebody
		String responseBody=EntityUtils.toString(postResponse.getEntity(), "UTF-8");
		JSONObject json=new JSONObject(responseBody);
		System.out.println("Response body "+json);
		
		//JSON to java
		Users userout=mapper.readValue(responseBody, Users.class);
		
		Assert.assertEquals(user.getName(),userout.getName());
		
		Assert.assertEquals(user.getJob(),userout.getJob());
		
		System.out.println(userout.getId());
		
		System.out.println(userout.getCreatedAt());
		
		
	}

}
