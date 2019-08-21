package collection.al;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int;
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("SIZE OF THE LIST: "+al.size());
		
		System.out.println("IS THE LIST EMPTY: "+al.isEmpty());
		
		al.add(10);
		al.add(8);
		al.add(17);
		
		
		System.out.println("SIZE OF THE LIST: "+al.size());
		System.out.println("IS THE LIST EMPTY: "+al.isEmpty());
		System.out.println("ELEMENT AT POSITION 1 is: "+al.get(1));

		al.add(1, 15);
		System.out.println("SIZE OF THE LIST: "+al.size());
		System.out.println("ELEMENT AT POSITION 1 is:"+al.get(1));

		System.out.println(al);		
		
		// Way of iterating over ArrayList
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			
			System.out.print(integer+ " ");
		}
		
		System.out.println();
		for (Integer integer : al) {
			System.out.print(integer+ " ");
		}
		
		// Use of Collection class to sort the elements
		Collections.sort(al);
		
		System.out.println();
		for (Integer integer : al) {
			System.out.print(integer+ " ");
		}
		
		al.remove(2);

		System.out.println();
		for (Integer integer : al) {
			System.out.print(integer+ " ");
		}
		
		al.addAll(al);
		
		System.out.println();
		for (Integer integer : al) {
			System.out.print(integer+ " ");
		}
		
	}

}
