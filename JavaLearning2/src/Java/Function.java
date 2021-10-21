package Java;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		int a=5;
		int b=7;
		print(a,b);
		print(34,67);
		add(10.5,45.6);
		int sorry=subtract(47,56);
		System.out.println(sorry);

	}
	 private static int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return (i-j);
	}
	private static void add(double d, double e) {
		// TODO Auto-generated method stub
		 System.out.println(d+e);
		
	}
	private static void print(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}
	static void print()
	{
		System.out.println("Hello World");
	}
}