package Java;

import java.util.Scanner;

public class OppPyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,star;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of rows");
		row=sc.nextInt();
		star=row;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print("* ");
			}
			star--;
			System.out.println();
		}
		for (int i = 1; i <=row-1; i++) {
			for (int j = 1; j <=(row-1)-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=(i)+1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
