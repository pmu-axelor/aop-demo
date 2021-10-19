package com.axelor.employee.contact.service;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axelor.employee.db.Contact;
import com.axelor.employee.db.Employee;

public class ServiceInterImpl implements ServiceInter {
	
	protected Logger log = LoggerFactory.getLogger(getClass());

@Override
public String say(Contact contact) {
	
	return String.format(" Welcome, ' %s ! ' ", contact.getName());
}

@Override
public void says(Contact contact) {
	
	System.err.println("this is from says method of impl");
	
}
/*
@Override
public String hello() {
	
	return "hello hii!!";
} */

@Override
public String something() {
	
	return "Gujarat";
}

@Override
public void check(Employee employee) {
    
	if(employee.getSalary() <= 20000) {
		employee.setTransientTest("LOW" + employee.getSalary());
	}
	else if(employee.getSalary() > 20000 && employee.getSalary() < 40000) {
		employee.setTransientTest("AVERAGE" + employee.getSalary());
	}
	else {
		    employee.setTransientTest("HIGH" + employee.getSalary());
	}
	
}
}
