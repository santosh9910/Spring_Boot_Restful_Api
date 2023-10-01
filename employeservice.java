package com.spring.first.service;

import java.util.List;

import com.spring.first.entity.employee;

public interface employeservice {

	
	public List<employee> getEmployee();
	
	
	public employee getEmployee(long employeeId);
	
	public employee addemployee(employee employe);
	
	public employee updatemployee(employee empl);
	
	public void deletemployee(long parseLong);
	
	
	
}
