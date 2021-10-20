package com.axelor.employee.db.repo;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.axelor.employee.db.Address;
import com.axelor.employee.db.Employee;

public class EmployeeRepository extends AbstractEmployeeRepository{
    
//	private static final String SEPARATOR = ",";
	
	@Override
	public Map<String, Object> populate(Map<String, Object> json, Map<String, Object> context){
		
		  
		 if (!context.containsKey("json-enhance")) {
		      return json;
		    }
		 try {
		     Long id = (Long) json.get("id");
		      Employee employee = find(id);
		      List<Address> list = employee.getAddresses();
		   
		      /*String listCommaSeparated = list.stream()
                      .collect(Collectors.joining(","));*/
		      
		     StringBuilder strbul=new StringBuilder();
		      for(Address str: list) {
		    	     strbul.append(str.getCity());
		    	     strbul.append(",");
		      }
		      
		   /*String css=strbul.toString();
		   System.out.println(css.length() + " " +SEPARATOR.length());
		        css.substring(0, css.length() - SEPARATOR.length());*/
		      
		    //  String strObj = String.join(",", strbul.toString());
		      
		      json.put("$address", strbul.toString());
		    //  System.out.println(json);
		     } catch (Exception e) {
		    	 System.out.println(e);
		    }
		  return json;
	}
}
