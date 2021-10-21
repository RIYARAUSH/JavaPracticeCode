package Java;

import java.util.Iterator;
import java.util.Scanner;

public class Sorting {

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
for (int i = 0; i < size; i++) {
	int num=i;
	int flag;
	for (int j = i+1; j < size; j++) {
		if(a[num]>a[j])
		{
			flag=a[j];
			a[j]=a[num];
			a[num]=flag;
		}
	}
}
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
