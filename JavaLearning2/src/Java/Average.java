package Java;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("*******AVERAGE OF MARKS********");
		System.out.println("how many subject you have");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("No, atleast you have to insert 2 numbers");
	
		}
		System.out.println("Please enter your marks");
		float sum=0;
		for (int i = 0; i < num; i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		sum=(sum/num);
		
		System.out.println("You have scored "+sum+"%");
		
	}

}
