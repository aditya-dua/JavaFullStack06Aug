package example.arrays;

public class SingleDArrayExample {

	public static void main(String[] args) {
		//Arguments : args[]
		
		// int a[5];
		
		// Ist Way to declaring an Array : Size is not mentioned
		int[] arr;
		
		// IInd way : Creating an array of integer with size 5.
		int[] arr1 = new int[5];
		
		//IIIrd way of array
		int[] arr2 = {1,2,3};
		
		// 
		int arr3[];
		
		//
		int[] arr4STD= new int[]{1,2,3,4,5,6};
		
		for(int i =0;i<arr4STD.length;i++) 
			System.out.println("The value of i is:"+arr4STD[i]);
		
		// For Each Loop
		for(int aditya: arr4STD)  System.out.println("The value is "+aditya);
	}
}
