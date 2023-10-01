package com.spring.first.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spring.first.entity.employee;

@Service
public class employeeserviceImpl implements employeservice {

	List<employee> list;
	
	public employeeserviceImpl(){
		list = new ArrayList<>();
		list.add(new employee(10276, " Santosh Gupta ", 790526351 , " Software Engineer", "Delhi"));
		list.add(new employee(10277, " Shubham Gupta ", 705273515 , " Software Engineer", "Noida"));
		list.add(new employee(10278, " Adi Singh ", 790547351 , " AS Engineer", "Lucknow"));
	}
	
	
	@Override
	public List<employee> getEmployee() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		
		employee c=null;
		for(employee ee :list)
		{
			if(ee.getEmployee_ID()==employeeId) {
				c = ee;
				break;
			}
		}
		return c;
	}


	@Override
	public employee addemployee(employee employe) {
		// TODO Auto-generated method stub
		list.add(employe);
		return employe;
	}
	
	@Override
	public employee updatemployee(employee empl) {
		// TODO Auto-generated method stub
		list.forEach(e ->{
			if(e.getEmployee_ID() == empl.getEmployee_ID()) {
				e.setEmployee_name(empl.getEmployee_name());
				e.setEmployee_phone(empl.getEmployee_phone());
				e.setEmployee_field(empl.getEmployee_field());
				e.setAddress(empl.getAddress());
			}
		});
		return empl;
	}


	@Override
	public void deletemployee(long parseLong) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e->e.getEmployee_ID()!=parseLong).collect(Collectors.toList());
	}


	
}
