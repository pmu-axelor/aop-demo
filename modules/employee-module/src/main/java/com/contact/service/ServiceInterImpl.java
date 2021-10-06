package com.contact.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.axelor.employee.db.Contact;

public class ServiceInterImpl implements ServiceInter {
	
	protected Logger log = LoggerFactory.getLogger(getClass());

@Override
public String say(Contact contact) {
	
	return String.format(" Welcome, ' %s ! ' ", contact.getName());
}

@Override
public String hello() {
	
	return "hello hii!!";
}
}
