package com.axelor.employee.contact.web;

import com.axelor.employee.contact.service.ServiceInter;
import com.axelor.employee.contact.service.ServiceInterImpl;
import com.axelor.employee.db.Company;
import com.axelor.employee.db.Contact;
import com.axelor.employee.db.repo.ContactRepository;
import com.axelor.inject.Beans;
import com.axelor.meta.CallMethod;
import com.axelor.meta.schema.actions.ActionView;
import com.axelor.meta.schema.actions.ActionView.ActionViewBuilder;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Response;
import com.google.inject.Inject;

public class HelloController {
   
	 
	/*@Inject ServiceInter serviceInter;*/
	
	 public void say(ActionRequest request, ActionResponse response) {
		
		 Contact contact = request.getContext().asType(Contact.class);
		 System.err.println(contact);
		 
		if(contact.getId() != null) {
			    contact = Beans.get(ContactRepository.class).find(contact.getId());
		}
		System.err.println(contact);  
		
		Beans.get(ServiceInter.class).say(contact);
		
		
		
		
		 
		       /*String message = serviceInter.say(contact);
		       
		       response.setFlash(message);*/
		 
	 }
	 
	 public void says(ActionRequest request, ActionResponse response) {
		
		 Contact contact = request.getContext().asType(Contact.class);
		 System.err.println(contact);
		 
		if(contact.getId() != null) {
			    contact = Beans.get(ContactRepository.class).find(contact.getId());
		}
		System.err.println(contact);  
		
		
		Beans.get(ServiceInter.class).says(contact);
		
		response.setFlash("street is changed");
		
		response.setAttr("state", "value", "Gujarat");
		response.setAttr("phone", "title", "Phone");
		ActionViewBuilder actionViewBuilder = ActionView.define("Contacts").model(Contact.class.getName()).add("grid", "contact-grid");
		response.setView(actionViewBuilder.map());
		
		
 }
	 
	/* @CallMethod
	 public Response validate(String email) {
		 
		 Response response = new ActionResponse();

		 if(email == null) {
			 response.addError("email", "Email Required");
		 }else if(!email.matches("^(.+)@(.+)$")) {
			 response.addError("email", "Invalid Email");
		 }
		return response;
		 
	 }*/
	
	 
}
