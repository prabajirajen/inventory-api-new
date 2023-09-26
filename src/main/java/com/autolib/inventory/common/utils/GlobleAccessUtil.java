package com.autolib.inventory.common.utils;

import java.util.HashMap;
import java.util.Map;

public class GlobleAccessUtil {
	
	public static Map<String,String> successResponse(){
		
		Map<String, String> response = new HashMap<String, String>();
		
		response.put("StatusCode", "01");
		response.put("StatusDesc", "Successfully Process the Request");
		
		return response;	
	}

	public static Map<String,String> failedResponse(){
		
		Map<String, String> response = new HashMap<String, String>();
		response.put("StatusCode", "02");
		response.put("StatusDesc", "Failed to Process the Request");
		
		return response;	
	}
	

	public static Map<String,String> successResponsees(){
		
		Map<String, String> response = new HashMap<String, String>();
		
		response.put("StatusCode", "01");
		response.put("StatusDesc", "Successfully Process the Request");
		
		return response;	
	}

}
