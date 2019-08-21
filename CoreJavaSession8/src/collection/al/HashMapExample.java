package collection.al;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// MAsters in the 
		// CODE & DESC
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "INDIA");
		hm.put(2, "USA");
		hm.put(3, "England");
		hm.put(4, "Canada");
		hm.put(5, "USA");
		hm.put(6, "USA");
		hm.put(7, "USA");
		hm.put(8, "USA");
		
		System.out.println(hm.get(2));
		
		System.out.println(hm.containsKey(1));
		System.out.println(hm.containsValue("india"));

		Set<Integer> setKeys = hm.keySet();
		
		for (Integer integer : setKeys) {
			System.out.println(integer+ " VALUE: "+hm.get(integer));
		}
		
		HashMap<String, Employee> hmE = new HashMap<String, Employee>();
		
		hmE.put("EMP001", new Employee("Aditya", "23452345", 1, 1));
		hmE.put("EMP002", new Employee("DEF", "23452345", 1, 1));
		hmE.put("EMP001", new Employee("ABC", "23452345", 1, 1));
	
		Set<String> setKeyEmp = hmE.keySet();
		
		for (String integer : setKeyEmp) {
			System.out.println(integer+ " VALUE: "+hmE.get(integer));
		}
		
		
	}
}
