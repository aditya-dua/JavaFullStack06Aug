package example.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StuSerialMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s= new Student('a', 1,12);
		
		try {
			FileOutputStream file=new FileOutputStream("student.aditya.encry");
			ObjectOutputStream oStream = new ObjectOutputStream(file);
			oStream.writeObject(s);
			oStream.close();
			file.close();
			
			System.out.println("Student object is serialized...");
			FileInputStream fileI=new FileInputStream("student.aditya.encry");
			ObjectInputStream oStream1 = new ObjectInputStream(fileI);
			
			Student stu=(Student) oStream1.readObject();
			
			oStream1.close();
			fileI.close();
			
			System.out.println(stu);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
