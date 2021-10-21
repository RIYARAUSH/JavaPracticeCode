package Java;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("How many number you want to sort, please enter less than 10");
		int size= sc.nextInt();
		int[] a =new int[10];
		System.out.println("Please enter "+size+" numbers ");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		int num ;
		System.out.println("hhh");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+"  ");
		}
		for (int j = 1; j < size; j++) {
			
		for (int i = 0; i < size-1; i++) {
			if (a[i]>a[i+1]) {
				num=a[i];
				a[i]=a[i+1];
				a[i+1]=num;
			}
		}
		}
		System.out.println();
		System.out.println(" Here, Your numbers are in ascending order: ");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		System.out.println(" Here, Your numbers are in descending order: ");
		for (int i = size-1; i >=0; i--) {
			System.out.print(a[i]+"  ");
		}
	
	}

}
