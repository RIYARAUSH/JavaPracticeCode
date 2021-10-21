package Java;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=5, number2= 7, number3=27;
		Boolean result;
		result= (number1>number2)||(number3<number2); //OR operator
		System.out.println("1st statement is "+result);
		result= (number3>number1)&&(number2>number1);
		System.out.println("2nd statement is "+result);
		Scanner sc=new Scanner(System.in);
		System.out.println("Now enter three number to find out larger one");
		System.out.println("Enter 1st number");
		int num1= sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2= sc.nextInt();
		System.out.println("Enter 3rd number");
		System.out.println();
		int num3= sc.nextInt();

		if ((num1>num2)&&(num1>num3)) {
			System.out.println(num1+" is greater");
		}
		if ((num2>num1)&&(num2>num3)) {
			System.out.println(num2+" is greater");
		}
		if ((num3>num1)&&(num3>num2)) {
			System.out.println(num3+" is greater");
		}
		// OTHER METHOD TO COMPARE 3 GIVEN NUMBERS
		
		if (num1>=num2) {
			if (num1>=num3) {
				System.out.println("First number is greater");
			} else {
				System.out.println("Third number is greater");

			}
		}
		else {
			if (num2>=num3) {
				System.out.println("Second number is greater");
			}
			else {
				System.out.println("Third number is greater");
			}
		}
		
	}
}
