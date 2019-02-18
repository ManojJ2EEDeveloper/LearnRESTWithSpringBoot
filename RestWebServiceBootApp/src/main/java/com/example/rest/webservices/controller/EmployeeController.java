package com.example.rest.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.webservices.dto.Employee;
import com.example.rest.webservices.service.EmployeeDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Employee Management System", description = "Operations pertaining to employee in Employee Management System")
public class EmployeeController {
	
	@Autowired
	EmployeeDetailService employeeDetailService;
	
	@ApiOperation(value = "View a list of available employees")
	@GetMapping("/users")
	public List<Employee> getAllEmployeeDetails() {
		return employeeDetailService.getAllEmployeeDetails();
	}
	
	@ApiOperation(value = "View a list of available employees")
	@GetMapping("/user/{getId}")
	public Employee getEmployeeDetails(@PathVariable String getId) {
		return employeeDetailService.getEmployeeDetails(getId);
	}
	
	@ApiOperation(value = "Add an Employee")
	@PostMapping("/createUser")
	public String createUser(@RequestBody Employee addNewEmployee) {
		Employee e =  null;
		e = employeeDetailService.addEmployee(addNewEmployee);
		
		if(e!=null) {
			return "Employee " + e.getEmpName() + " Added Successfully!!";
		}
		return "Employee Service Failed";
	}
	
	@ApiOperation(value = " an Employee")
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable String id) {
		Employee e = employeeDetailService.deleteEmployee(id);
		return "Employee " + e.getEmpName() + " Deleted Successfully";	
	}
}
 