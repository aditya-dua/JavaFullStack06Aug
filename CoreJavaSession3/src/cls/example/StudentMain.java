package cls.example;

import java.util.Scanner;
import static java.lang.Math.*;
public class StudentMain {

	static {
		System.out.println("StudentMain is Loading..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student.printHelloWorld();
		Student stu= new Student();
		System.out.println(stu.isTrue);
		Scanner scIn = new Scanner(System.in);
		System.out.print("Please input your id ");
		stu.setId(scIn.nextInt());
		System.out.print("Please input your name ");
		stu.setName(scIn.next());
		System.out.print("Please input your age ");
		stu.setAge(scIn.nextInt());
		System.out.print("Please input your email ");
		stu.setEmailId(scIn.next());
		
		
		System.out.println("The number of objects of class are:"+Student.studentCount);
		scIn.close();
		
		Student stu1= new Student(2,"ABC",23,"abc@abc.com");
		System.out.println("The number of objects of class are:"+Student.studentCount);

		stu.display();
		
	}

}
