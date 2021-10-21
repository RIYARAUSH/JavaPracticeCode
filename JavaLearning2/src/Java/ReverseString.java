package Java;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String r1="radar";
String rev="";
System.out.println("You have given string ="+r1);
int len=r1.length();

for(int i=len-1; i >= 0; i--) {
	
	rev=rev+r1.charAt(i);
	
}
System.out.println("Your reversed string is= "+rev);
if(r1.equals(rev)) {
	System.out.println("Your String is palindrome ");
}
else
	System.out.println("Your string is Not palindrome");
	}

}
