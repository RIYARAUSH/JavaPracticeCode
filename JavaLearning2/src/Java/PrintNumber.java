package Java;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println(" ****We are printing numbers here****");
System.out.println("Please enter lower limit");
int num1=sc.nextInt();
System.out.println("Please enter upper limit");
int num2 =sc.nextInt();
System.out.println("THANK YOU\n");
System.out.println("Your numbers are: \n");
for (int i = num1; i <=num2; i++) {
	System.out.print(i+", ");
}
	}

}
