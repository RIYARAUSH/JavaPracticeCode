package Java;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("You have to give two numbers to swap it");
		System.out.println("Please enter greater one");
		int a=sc.nextInt();
		System.out.println("Please enter smaller one");
		int b=sc.nextInt();
		a=a-b;
		b=b+a;
		a=b-a;
		System.out.println("Your number after swap is "+a+" "+b);
	}

}
