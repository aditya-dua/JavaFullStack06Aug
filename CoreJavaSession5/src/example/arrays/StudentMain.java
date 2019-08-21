package example.arrays;

import java.util.Scanner;

public class StudentMain {

	
	public static void main(String[] args) {
		
		Student [] stu = new Student[5];
		
		Scanner sc=new Scanner(System.in);
		for(int i =0;i<5;i++){
			
			stu[i] = new Student();
			
			stu[i].name =sc.next();
			stu[i].id=i;
			
			stu[i].display();
		}
		
		//Object[] stu1 = new Student[5];
		
		
	}
}
