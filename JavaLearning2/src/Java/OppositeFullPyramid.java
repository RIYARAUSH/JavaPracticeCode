package Java;

import java.util.Scanner;

public class OppositeFullPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rownum,star;
Scanner sc=new Scanner(System.in);
System.out.println("enter total row");
rownum=sc.nextInt();
star=rownum;
for (int i = 1; i <=rownum; i++) {
	for (int j = 1; j <=i-1; j++) {
		System.out.print(" ");
	}
	for (int k = 1; k <= (star*2)-1; k++) {
		System.out.print("*");
	}
	star--;
	System.out.println();
	
}
	}

}
