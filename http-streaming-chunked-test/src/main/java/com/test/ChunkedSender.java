package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class ChunkedSender {
	
	public static void main(String[] args) throws URISyntaxException, ClientProtocolException, IOException {
		
		InputStream input = new FileInputStream(new File("resources/orders.csv"));
		
		String contentType = "text/plain";
		URI uri = new URI("http://localhost:9095/chunkedTest?name=vinay");
		post(input, contentType, uri);
		
	}
	
	public static HttpResponse post(InputStream content, String contentType, URI url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient client = HttpClients.createDefault();
	    InputStreamEntity entity = new InputStreamEntity(content);
	    entity.setChunked(true);
	    entity.setContentType(contentType);

	    HttpPost httpPost = new HttpPost(url);
	    httpPost.setEntity(entity);

	    CloseableHttpResponse response = client.execute(httpPost);
	    
	    System.out.println("Response is: " + response);
		return response;
   }

}
