package com.axelor.employee.contact.web;

import com.axelor.employee.contact.service.ServiceInter;
import com.axelor.employee.contact.service.ServiceInterImpl;
import com.axelor.employee.db.Company;
import com.axelor.employee.db.Contact;
import com.axelor.employee.db.Employee;
import com.axelor.employee.db.repo.ContactRepository;
import com.axelor.inject.Beans;
import com.axelor.meta.CallMethod;
import com.axelor.meta.schema.actions.ActionView;
import com.axelor.meta.schema.actions.ActionView.ActionViewBuilder;
import com.axelor.rpc.ActionRequest;
import com.axelor.rpc.ActionResponse;
import com.axelor.rpc.Context;
import com.axelor.rpc.Response;
import com.google.inject.Inject;

public class HelloController {
   
	 public void say(ActionRequest request, ActionResponse response) {
		
		 
		 Context context = request.getContext();
		 
		 Contact contact = context.asType(Contact.class);
		 System.err.println(contact);
		 
		if(contact.getId() != null) {
			    contact = Beans.get(ContactRepository.class).find(contact.getId());
		}
		System.err.println(contact);  
		
		String mssg = Beans.get(ServiceInter.class).say(contact);
		     response.setFlash(mssg);
		 
		     
		 
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
		 //   response.setError("this is a error");
		   //    response.setAlert("this is a warning message"); 
		     //     response.setNotify("this is to notify you");
		 
		
		
		response.setAttr("state", "value", "kolkata");
		response.setAttr("phone", "title", "Phone");
		
		
		
		ActionViewBuilder actionViewBuilder = ActionView.define("Contacts").model(Contact.class.getName()).add("grid", "contact-grid");
		response.setView(actionViewBuilder.map()); 
		
   }
	
	public void checkForEmployee(ActionRequest request, ActionResponse response) {
		Employee emp = request.getContext().asType(Employee.class);
		Beans.get(ServiceInter.class).check(emp);
	}
	 
}
