package Java;

public class FunctionTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6,c=18,d=56,e=12;
		add(a,b,c,d,e);
		subtraction(c,e);
		int i= multiply(a,b,c);
		System.out.println("For multiplication your result is "+i);
		int h=div(88,8);
	    System.out.println("For division your result is " +h);
	    System.out.println(multiply(15,6,5));
	}

	private static int div(int c, int b) {
		// TODO Auto-generated method stub
	int i=c/b;
	return i;
		
	}

	private static int multiply(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a*b*c;
		
	}

	private static void subtraction(int c, int e) {
		// TODO Auto-generated method stub
		
		System.out.println(c-e);
		
	}

	private static void add(int a, int b, int c, int d, int e) {
		// TODO Auto-generated method stu
		int i;
		i=a+b+c+d+e;
		System.out.println("Your addition result is "+i);
	}

}

