package Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddStringAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str=new Scanner(System.in);
		String r1="1 2 3";
		//String[] suum=new String[10];
		String[] num=r1.split(" ");
		int lenstr=num.length;
		System.out.println(lenstr+" size");
		int[] arr1=new int[10];
		int[] arr2=new int[10];
		int[] sum=new int[10];
		System.out.println("enter array list");
		 for (int i = 0; i < lenstr; i++) 
		 { 
			 arr2[i]=str.nextInt(); 
		 }
		 for (int i = 0; i< lenstr; i++)
		 {
			 arr1[i]=Integer.parseInt(num[i]); 
			 }
		 
		  for (int i = 0; i < lenstr; i++) 
		  {
			  System.out.print(arr1[i]+" ");
			  }
		 
		  for (int i = 0; i < lenstr; i++)
		  {
			  sum[i]=arr1[i]+arr2[i];
		  }
		  System.out.println();
		  System.out.println(" yur sum is ");
		  for (int i = 0; i < lenstr; i++) 
		  {
			  System.out.print(sum[i]+" ");
			  }

	}

}
