package scanner;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a Java Session.";
		
		Scanner sc = new Scanner(str) ;
		
		// Scanner has any elements in it.
		
		System.out.println("Scanner has elements or not: "+sc.hasNext());
		
		System.out.println("Scanner's Next String is: "+sc.next());
		
		System.out.println("Scanner has elements or not: "+sc.hasNext());

		System.out.println("Scanner's Next Line is: "+sc.nextLine());
		
		System.out.println("Scanner has elements or not: "+sc.hasNext());

		sc.close();
		
		Scanner scIn = new Scanner(System.in);
		
		System.out.print("Pleas Enter your Name: ");		
		String name = scIn.next();
		
		System.out.print("Pleas Enter your Age : ");
		int age = scIn.nextInt();
		
		
		System.out.println("Name is : "+name);
		System.out.println("Age is  : "+age);

		
				
	}

}
