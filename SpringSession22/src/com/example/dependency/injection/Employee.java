package com.example.dependency.injection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {

	private String name;
	private Map<String,Address> address;
	private int empCode;
	private ArrayList<String> phoneNumber;
	
	
	

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", empCode="
				+ empCode + ", phoneNumber=" + phoneNumber + "]";
	}

	public String getName() {
		return name;
	}

	public ArrayList<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(ArrayList<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setName(String name) {
		System.out.println("SETTER CALLED");
		this.name = name;
	}
	public Map<String, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<String, Address> address) {
		this.address = address;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("constructor called");
	}

	public Employee(int empCode,String name,Map<String,Address> add,ArrayList<String> phone) {
		super();
		
		this.empCode = empCode;
		this.name=name;
		this.address=add;
		phoneNumber=phone;
		System.out.println("constructor called -2");
	}
	
	
}
