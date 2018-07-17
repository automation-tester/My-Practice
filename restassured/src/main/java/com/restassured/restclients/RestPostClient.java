package com.restassured.restclients;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestPostClient {
	
	
	//POST method with headers
	
	public CloseableHttpResponse post(String url, String payload, HashMap<String, String> headermap) throws ClientProtocolException, IOException 
	{
		
		CloseableHttpClient httpClient=HttpClients.createDefault();
		HttpPost httpPost=new HttpPost(url);
		
		httpPost.setEntity(new StringEntity(payload));
		
		for (Map.Entry<String, String> entry:headermap.entrySet()) {
			
			httpPost.addHeader(entry.getKey(), entry.getValue());
		}
		
		CloseableHttpResponse httpresponse=httpClient.execute(httpPost);
		return httpresponse;
	}
	
	

}
