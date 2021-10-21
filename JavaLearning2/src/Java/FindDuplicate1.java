package Java;

import java.util.Scanner;

public class FindDuplicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[20];
		int[] b=new int[10];
		System.out.println("How many number you are going to enter");
		int size=sc.nextInt();
		System.out.print("Please enter numbers ");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
int k=0;
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]+" has duplicates");
b[k]=a[i];
k++;
				}
			}
		}
		int num=k;
		for ( k = 0; k < num; k++) {
			for (int l = k+1; l < num; l++) {
				if(b[k]==b[l])
				{
					
				}
			}
		}

	}

}
