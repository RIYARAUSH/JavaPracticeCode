package Java;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="itti";
		String rev="";
		for (int i = t.length()-1; i<=0; i--) {
			rev=rev+t.charAt(i);
			
		}
		
		if(t.equals(rev))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
