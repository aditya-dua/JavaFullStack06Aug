package collection.al;

import java.util.ArrayList;

public class EmployeeMainExample {

	public static void main(String[] args) {
		
		ArrayList<Employee>   empList = new ArrayList<Employee>();
		
		Employee e = new Employee("2121", "1212", 3, 1);
		
		empList.add(new Employee("Aditya", "346536356", 1, 1));
		empList.add(new Employee("ABC", "234213423452", 2, 1));
		empList.add(new Employee("DEF", "32454235", 3, 1));
		empList.add(new Employee("GHI", "234524345", 4, 1));
		empList.add(e);
		empList.add(null);
		empList.add(null);

		empList.remove(new Employee("DEF", "32454235", 2, 1));
		
		
		// create a student class
		// create a list of studnets
		// add 10 elements
		// print the list
		// remove elements absed on index and object
		// sort the elememts
		// check if the list contaons a particular student
		// print the list
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}
}
