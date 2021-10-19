package com.axelor.employee.contact.service;

import com.axelor.employee.db.Contact;
import com.axelor.employee.db.Employee;
import com.axelor.meta.CallMethod;

public interface ServiceInter {

	  public String say(Contact contact);
	  
	  public void says(Contact contact);
	  
	  @CallMethod
	  public String something();
	  
	  public void check(Employee employee);
	  
	 // public String hello();*/
}