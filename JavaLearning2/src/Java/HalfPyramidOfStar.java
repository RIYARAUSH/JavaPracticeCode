package Java;

import java.util.Scanner;

public class HalfPyramidOfStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("How many rows you want, enter number");
int num=sc.nextInt();
for (int i = 1; i <=num; i++) {
	for (int j = 1; j <=i; j++) {
		System.out.print("* ");
		
	}
	System.out.println();
	
}
	}

}
