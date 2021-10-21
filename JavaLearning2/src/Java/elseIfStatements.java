package Java;

public class elseIfStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a = 1;
		if(a>10 && a<100)
			System.out.println("This is a two digit number");
		else if(a>100 && a<1000)
			System.out.println("This is a 3 digit number");
		else if(a>1000 && a<10000)
			System.out.println("This is a 4 digit number");
		else
			System.out.println("This number is more than 5 digits");
	}

}
