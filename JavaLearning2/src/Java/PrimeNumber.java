package Java;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		System.out.println("You have to define range to find prime numbers between them");
		System.out.println("Please enter lower limit of range");
		int a=str.nextInt();
		System.out.println("Now please enter the upper limit of range");
		int b=str.nextInt();
		//int t=(b-a)+1;
		int flag=0;
		int p=0;
		int c=0;
		for (int i = a; i <=b; i++) {
			for (int j = 2; j <=i/2; j++) {
				
				if (i%j==0) {
					flag=1;
					
				} 
				 		
			}
			if (flag==1) {
				System.out.println(i+" is not prime");
				p=p+1;
				
			}
			else {
				System.out.println(i+" is prime");
				c=c+1;
			
			}
			 flag=0;
			
		}
		System.out.println("total prime numbers between given range is "+c);
		System.out.println("total non prime numbers between given range is "+p);

	}

}
