package com.spring.first.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.first.entity.employee;
import com.spring.first.service.employeservice;


@RestController       
public class Mycontorller {
	
	
	@Autowired            // that means automatically creat object 
	private employeservice employeeservice;
	
	//get the home page
	@GetMapping("/home")
	public String home() {
		return "Welcome to the first URL Pages";
	}
		
		//get the employee details
		@GetMapping("/employee")
		public List<employee> getEmployee(){
			
			return this.employeeservice.getEmployee();
			
		}
		
		
		
		//get the particular employee id 
		@GetMapping("/employee/{employeeId}")
		public employee getEmployee(@PathVariable String employeeId) {
			return this.employeeservice.getEmployee(Long.parseLong(employeeId));
		}
		
	
		//add the employee
		@PostMapping("/emplye")
		public employee addemployee(@RequestBody employee employe) {
			return this.employeeservice.addemployee(employe);
		}
		
		
		//update the employee using PUT request
		@PutMapping("/empoy")
		public employee updatemployee(@RequestBody employee empl) {
			return this.employeeservice.updatemployee( empl);
	}
		
		
		//delete the employee
		@DeleteMapping("/employee/{employeeid}")
		public ResponseEntity<HttpStatus> deletemployee(@PathVariable String employeeid) {
			try {
			
				this.employeeservice.deletemployee(Long.parseLong(employeeid));
				return new ResponseEntity<>(HttpStatus.OK);
			}
			 catch (Exception e) {
				// TODO: handle exception
				 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

}
