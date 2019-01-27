package com.example.rest.webservices.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Component;
import com.example.rest.webservices.dto.Employee;

@Component
public class EmployeeDetailService {
	
	public static List<Employee> lst = new ArrayList<>();
	
	public static int counter = 3;
	
	public EmployeeDetailService() {
		System.out.println("Default Constructor Invoked In Service Layer");
	}
	
	static {
		lst.add(new Employee(1,"ABC","CHN","IT",new Date()));
		lst.add(new Employee(2,"DEF","BAN","BPO",new Date()));
		lst.add(new Employee(3,"GHI","KER","HR",new Date()));
	}
	
	//GET ALL DETAILS OF AN EMPLOYEE
	public List<Employee> getAllEmployeeDetails(){
		return lst;
	}
	
	//GET PARTICULAR DETAILS OF AN EMPLOYEE
	public Employee getEmployeeDetails(String getId) {
		if(Integer.valueOf(getId)!=0) {
			for(Employee e: lst) {
				if(e.getId()==Integer.valueOf(getId)) {
					return e;
				}
			}
		}
		return null;	
	}
	
	//POST - ADD DETAILS OF AN EMPLOYEE
	public Employee addEmployee(Employee e) {
		if(e.getId()==0 && (e.getEmpName()!=null && e.getEmpName().trim().length()>0)) {
			e.setId(++counter);
			lst.add(e);
		}else {
			return null;
		}
		return e;
	}
}
