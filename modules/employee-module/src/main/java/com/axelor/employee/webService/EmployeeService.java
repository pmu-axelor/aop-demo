package com.axelor.employee.webService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.axelor.employee.db.Employee;
import com.axelor.employee.db.repo.AbstractEmployeeRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.inject.Inject;

/*@Path("/employees")
public class EmployeeService {
    
	@Inject
	 AbstractEmployeeRepository employeeRepo ;
	
	JsonNodeFactory jsonNodeFactory = JsonNodeFactory.instance;
	
	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JsonNode getEmployee() {
		ObjectNode mainNode=jsonNodeFactory.objectNode();
		
		List<Employee> employeeList = employeeRepo.all().fetch();
		
		ArrayNode arrayNode = jsonNodeFactory.arrayNode();
		
		for(Employee e : employeeList) {
			ObjectNode employeeNode = jsonNodeFactory.objectNode();
			
			employeeNode.put("name", e.getName());
			employeeNode.putPOJO("0", e);
			
			arrayNode.add(employeeNode);
			
		}
		
		mainNode.put("status",0);
		mainNode.set("data", arrayNode);
		
		return mainNode;
		
	}
	 
}*/
