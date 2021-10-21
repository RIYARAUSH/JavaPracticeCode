package Java;

import java.util.Scanner;

public class FullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalrow;
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter no of rows");
		totalrow=sc.nextInt();
		for (int i = 1; i <= totalrow; i++) {
			for (int j = 1; j <= (totalrow-i); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
