package exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=8;
		int []arr = new int[5];
		
		//System.out.println(arr[a]);
		
		//System.out.println(a/0);
		
		//System.out.println("ExceptionMain.main()");
		
		
		File f= new File("mytestFile.txt");
		
		if(a>0){
			try {
				System.out.println(a/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			
		}
		try {
			//System.out.println(a/0);
			Scanner sc = new Scanner(f);
			BufferedReader br;
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File is not Found"+f);
			e.printStackTrace();
			e.getLocalizedMessage();
			e.getMessage();
			System.err.println(e.getStackTrace());
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
		System.out.println("I am continued...");
		
		
	}
	
	

}
