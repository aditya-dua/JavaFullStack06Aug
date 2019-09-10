package com.example.dependency.injection;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Address add = new Address(1,"Street Number 1","CITY ");
		Employee e= new  Employee();
		e.setAddress(add);
		e.setEmpCode("EMp-001");
		e.setName("Emp Name - 1");
		
		e.getAddress().getCity();
	}
}
