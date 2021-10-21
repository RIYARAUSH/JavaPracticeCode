package Java;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Double number1 =13.5, number2;
Boolean flag= true;
System.out.println("+ number = "+ +number1);  // step 1
System.out.println("After step 1 number1 is: "+ number1);
System.out.println();

System.out.println("- number = "+ -number1);  // step 2
System.out.println("After step 2 number1 is: "+ number1);
System.out.println();

System.out.println("++ number = "+ ++number1);  // step 3
System.out.println("After step 3 number1 is: "+ number1);
System.out.println();

System.out.println("-- number = "+ --number1);  // step 4
System.out.println("After step 4 number1 is: "+ number1);
System.out.println();

System.out.println(" number ++ = "+ number1++);  // step 5
System.out.println("After step 5 number1 is: "+ number1);
System.out.println();

System.out.println("!flag = "+!flag);
System.out.println();
System.out.println(flag);


	}

}
