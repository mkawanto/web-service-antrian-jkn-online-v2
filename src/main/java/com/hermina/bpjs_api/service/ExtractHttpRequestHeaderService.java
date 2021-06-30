package com.hermina.bpjs_api.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

//import com.hermina.bpjs_api.model.HttpHeaderModel;

@Service
public class ExtractHttpRequestHeaderService {
	    
	    @Autowired
	    private Environment env;

		public Object extracthHttp(HttpServletRequest http) {
		
			System.out.println(http.getHeader("X-cons-id"));
			
			String consId = http.getHeader("X-Cons-ID");
	    	String timeStamp =  http.getHeader("X-Timestamp");
			String signature = http.getHeader("X-Signature");
			
			HttpHeaders header = new HttpHeaders();
			header.setContentType(MediaType.APPLICATION_JSON);
			header.set("X-Cons-ID", consId);
			header.set("X-Timestamp", timeStamp);
			header.set("X-Signature", signature);
		   
			//final HttpHeaderModel result = new HttpHeaderModel(consId, timeStamp, signature);
			System.out.println(header);
			return header;
		
	   }
	   
	   public String getUrl() {
		   
		  return env.getProperty("spring.url.bpjs");
	   }
		

}
