
package Java;

import java.util.Scanner;

public class Example {
	public static int area(int a,int b) {
		int s=a*b;
		return s ;
	}
	public static void main(String[] args)
	{
		System.out.println("Trying to find out area of rectangle");
		System.out.println();
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter Length");
		int r=sc.nextInt();
		System.out.println("Enter height");
		int h=sc.nextInt();
		System.out.println("Length of rectangle is: "+r);
		System.out.println("Height of rectangle is: "+h);
		int a= area(r,h);
		System.out.println();
		System.out.println("Area of rectangle is: "+a);

	}
}


