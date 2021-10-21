package Java;

import java.util.Scanner;

public class TestPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of row");
		num=sc.nextInt();
		int s=1;
		for (int i = 1; i <=num; i++) {
			s=i;
			for (int k =1 ; k<=num-i; k++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j<=i; j++) {
			System.out.print(s+" ");
			s=s+5;
			
			}
			//System.out.println("hello");
			System.out.println();
		}


	}

}
