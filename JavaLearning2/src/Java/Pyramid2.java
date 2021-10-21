package Java;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rownum;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter number of rows");
rownum=sc.nextInt();
for (int i = 1; i <= rownum; i++) {
	for (int j = 1; j <= rownum-i; j++) {
		System.out.print(" ");
	}
	for (int k = 1; k <= i; k++) {
		System.out.print("* ");
	}
	System.out.println();
	
}
	}

}
