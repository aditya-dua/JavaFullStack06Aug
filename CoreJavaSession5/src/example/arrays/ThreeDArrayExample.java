package example.arrays;

import java.util.Scanner;

public class ThreeDArrayExample {

	public static void main(String[] args) {


		int arr[][][] = new int[2][2][2];

		Scanner sc = new Scanner(System.in);

		for(int i = 0;i<2;i++){
			for(int j = 0;j<2;j++){
				for(int k=0;k<2;k++)
					arr[i][j][k] = sc.nextInt();
			}
		}


		/*for(int i =0 ;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();		
		}*/

		for (int[][] is : arr) {
			System.out.println("New 2-D array");	
			for (int i[] : is) {
				for (int j : i) {
					System.out.print(j+ " ");
				}
				System.out.println();	
			}

		}

	}
}
