package com.axelor.employee.module;

import com.axelor.app.AxelorModule;
import com.axelor.employee.contact.service.ServiceInter;
import com.axelor.employee.contact.service.ServiceInterImpl;

public class ContactModule extends AxelorModule{

	@Override
	protected void configure() {
      bind(ServiceInter.class).to(ServiceInterImpl.class);
	}
}
