package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortExample {

	// I want to apply sorting on a custom class in a hashmap.
	// I want to apply sorting on a custom class in a linkedlist.
	
	public static void main(String[] args) {
		
		ArrayList<Employee>  alEmpList = new ArrayList<Employee>();
		alEmpList.add(new Employee("Aditya", 10, "12345678"));
		alEmpList.add(new Employee("aBditya", 12, "dsfgdsgdg"));
		alEmpList.add(new Employee("CAditya", 30, "dbdgbdgb"));
		alEmpList.add(new Employee("ZAditya", 87, "dsfbdfgdfsge"));
		
		for (Employee employee : alEmpList) {
			System.out.println(employee);
		}
			
		System.out.println();
		Collections.sort(alEmpList);
		

		
		for (Employee employee : alEmpList) {
			System.out.println(employee);
		}
		
		Collections.sort(alEmpList, new SortEmployeeID());
		System.out.println();

		for (Employee employee : alEmpList) {
			System.out.println(employee);
		}
	}
}
