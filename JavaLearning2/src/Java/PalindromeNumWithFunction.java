package Java;

import java.util.Scanner;

public class PalindromeNumWithFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=4675;
		Scanner sc=new Scanner(System.in); 
		System.out.println("PALINDROME CHECK");
		System.out.println();
		System.out.println("Please enter a number");
		int i=sc.nextInt();
		palindrome(i);
	}
private static void palindrome(int i) {
		// TODO Auto-generated method stub
		int temp=i;
		int rev=0,rem;
		while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reversed no is "+rev);
		if (i==rev) {
			System.out.println();
			System.out.println(i+" is palindrome");
			
		} else {
			System.out.println();
			System.out.println(i+" is not palindrome");
		}
	}
}
