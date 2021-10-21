package Java;

import java.util.Scanner;

public class HalfPyramidOfStar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows you want, enter number");
		int num=sc.nextInt();
		int num1=num;
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num1; j++) {
				System.out.print("* ");
			}
			num1--;
			System.out.println();
		}
	}

}
