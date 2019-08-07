package scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		
		String str = "Hello World";
		Scanner sc = new Scanner(str);
				
		String s = sc.next();
		
		if(sc.hasNext()){
			String name = sc.next();
			System.out.println(s +  ":"+ name);
		}else{
			System.out.println("No more elements in the scanner.");
		}
		
	}
}
