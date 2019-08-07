package example.string;

public class StringCreation {

	public static void main(String[] args) {
		// Creation of String
		System.out.println("Arg 0 is :"+args[1]);
		String a = "Aditya";
		System.out.println(a);

		//String b = "Adi";

		String str = new String("Aditya");
		//str = "";
		String str1 = "Aditya";

		if(a==str){
			System.out.println("a and str are same");
		}else{
			System.out.println("a and str are not same");

		}

		if(a==str1){
			System.out.println("a and str1 are same");
		}else{
			System.out.println("a and str1 are not same");

		}

		if(str1==str){
			System.out.println("str1 and str are same");
		}else{
			System.out.println("str1 and str are not same");

		}


		System.out.println("CharAt Function "+str1.charAt(3));
		str = "adi@adi.com";
		String usern= "ADI@adi.com";


		if(str.compareToIgnoreCase(usern)==0){
			System.out.println("You should be able to login.");

		}
		System.out.println("You should be able to "+usern.toUpperCase());

		//Assignment : 3 : User Input
		//& : And in Java 
		//System.out.println("And of 1 & 1 is :"+(0 & 0));


	}
}
