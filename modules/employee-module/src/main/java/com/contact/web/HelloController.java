package com.contact.web;

import com.axelor.meta.CallMethod;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;

public class HelloController {
   
	 
	 public void say(ActionRequest request, ActionResponse response) {
		
		 String message = "hi helo !!";
		 
		 response.setFlash(message);
		 
	 }
	 
}
