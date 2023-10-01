package com.spring.first.entity;

public class employee {
	
	private long employee_ID;
	private String employee_name;
	private long employee_phone;
	private String employee_field;
	private String Address;
	
	
	public employee(int employee_ID, String employee_name, long employee_phone, String employee_field, String address) {
		super();
		this.employee_ID = employee_ID;
		this.employee_name = employee_name;
		this.employee_phone = employee_phone;
		this.employee_field = employee_field;
		Address = address;
	}


	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getEmployee_ID() {
		return employee_ID;
	}


	public void setEmployee_ID(long employee_ID) {
		this.employee_ID = employee_ID;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public long getEmployee_phone() {
		return employee_phone;
	}


	public void setEmployee_phone(long employee_phone) {
		this.employee_phone = employee_phone;
	}


	public String getEmployee_field() {
		return employee_field;
	}


	public void setEmployee_field(String employee_field) {
		this.employee_field = employee_field;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "employee [employee_ID=" + employee_ID + ", employee_name=" + employee_name + ", employee_phone="
				+ employee_phone + ", employee_field=" + employee_field + ", Address=" + Address + "]";
	}
	
	
	
	
	
	
	

}
