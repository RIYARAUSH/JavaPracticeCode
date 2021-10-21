package Java;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=748657;
        int temp=no;
        int rev=0,rem;
        while (temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
        if (no==rev) {
			System.out.println(rev+" is palindrome");
		} else {
			System.out.println(rev+" is not palindrome");

		}
	}

}
