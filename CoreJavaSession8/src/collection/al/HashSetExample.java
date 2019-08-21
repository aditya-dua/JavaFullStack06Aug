package collection.al;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(8);
		al.add(17);
		al.add(10);
		al.add(10);
		
		HashSet<Integer> hsInt1 = new HashSet<Integer>(al);
		
		for (Integer integer : hsInt1) {
			System.out.println(integer);
		}
		
		al=new ArrayList<Integer>(hsInt1);
		
		for (Integer integer : hsInt1) {
			System.out.println(integer);
		}
		
		HashSet<Integer> hsInt = new HashSet<Integer>();
		
		hsInt.add(10);
		hsInt.add(12);
		hsInt.add(3);
		hsInt.add(4);
		hsInt.add(7);
		hsInt.add(null);
		
		if(hsInt.add(10)){
			System.out.println("Element inserted  in the set.");
		}else{
			System.out.println("Element already present in the set.");
		}
		for (Integer integer : hsInt) {
			System.out.println(integer);
		}
		
		
	}
}
