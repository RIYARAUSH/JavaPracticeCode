package Java.one;
import Java.Try;
class child extends Try{
	void func()
	{
		protectedfunc();
	}
}
//import Java.two;
public class TryOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Try o =new Try();

		//o.privatefunc();
		///o.defaultfunc();
		o.publicfunc();
		//o.protectedfunc();
		child ch= new child();
		ch.func();

	}
}







//Class
//Public class is accessible outside your package
//Default class is not accessible outside the package

//one is inherited by cjhild class
