package com.contact.web;

import com.axelor.employee.db.Contact;
import com.axelor.meta.CallMethod;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Response;
import com.contact.service.ServiceInterImpl;
import com.google.inject.Inject;

public class HelloController {
   
	 
	@Inject ServiceInterImpl serviceInterImpl;
	
	 public void say(ActionRequest request, ActionResponse response) {
		
		 Contact contact = request.getContext().asType(Contact.class);
		       String message = serviceInterImpl.say(contact);
		       
		       response.setFlash(message);
		 
	 }
	 
	 @CallMethod
	 public Response validate(String email) {
		 
		 Response response = new ActionResponse();

		 if(email == null) {
			 response.addError("email", "Email Required");
		 }else if(!email.matches("^(.+)@(.+)$")) {
			 response.addError("email", "Invalid Email");
		 }
		return response;
		 
	 }
	
	 
}
