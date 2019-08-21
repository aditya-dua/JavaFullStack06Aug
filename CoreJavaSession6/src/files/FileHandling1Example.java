package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Logical Path

		File f = new File("input//myFirstFile.txt");
		try {
			if(f.exists()){
				// Do Some Operation
				System.out.println("File Exists..."+f.getName()+" SIZE ::"+f.length());

				Scanner sc = new Scanner(f);

				while(sc.hasNext()){
					System.out.println(sc.nextLine());
				}
				sc.close();

				BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));

				bw.append("THIS IS A BUFFERERED WRITER TEXT");
				// 10 lines into file
				// 

				//bw.flush();
				bw.close();

				if(true){

				}else{
					// Write to file
				}

			} else{

				if(f.createNewFile()){
					System.out.println("File Object is created"+f.getName());
				}else{
					System.out.println("File Not Exists, Not Created");
				}
			}
			// 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
