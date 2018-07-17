package com.restassured.restclients;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestGetClient {

	//GeT without headers
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException{
		
	//Create a Client connection
	CloseableHttpClient	httpClient=HttpClients.createDefault();
	
	//create get request
	HttpGet getReq=new HttpGet(url);
	
	//Execute the request using http client
	CloseableHttpResponse closableRes=httpClient.execute(getReq);
	
	return closableRes;
	
	}
	
	//GET with headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException{
			
	//Create a Client connection
	CloseableHttpClient	httpClient=HttpClients.createDefault();
		
	//create get request
	HttpGet getReq=new HttpGet(url);
	
	for(Map.Entry<String, String> headers:headerMap.entrySet())
	{
		getReq.addHeader(headers.getKey(), headers.getValue());
		
	}
		
	//Execute the request using http client
	CloseableHttpResponse closableRes=httpClient.execute(getReq);
		
	return closableRes;
		
	}
	
	
}
