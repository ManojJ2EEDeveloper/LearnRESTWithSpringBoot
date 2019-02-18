package com.example.rest.webservices.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All Details about the Employee")
public class Employee {
	
	@ApiModelProperty(notes="ID will be Primary Key")
	public int id;
	@ApiModelProperty(notes="Name Cannot be Empty")
	public String empName;
	public String location;
	public String department;
	public Date empDOB;
	
	public Employee() {
		System.out.println("Employee Default Constructor Invoked!!");
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", location=" + location + ", department=" + department
				+ ", empDOB=" + empDOB + "]";
	}
	
	public Employee(int id, String empName, String location, String department, Date empDOB) {
		super();
		this.id = id;
		this.empName = empName;
		this.location = location;
		this.department = department;
		this.empDOB = empDOB;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getEmpDOB() {
		return empDOB;
	}
	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}

}
