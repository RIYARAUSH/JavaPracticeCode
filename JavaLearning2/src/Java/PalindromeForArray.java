package Java;

public class PalindromeForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,4,5};
		int[] arr2=new int[arr1.length];
		int j=0;
		for (int i = arr1.length-1; i >= 0; i--) {
			arr2[j]=arr1[i];
			j=j+1;
		}
		System.out.println("Element of arr 2 are");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i]==arr2[i]) {
				System.out.println("palindrome");
				
			} else {
				System.out.println("array is not palindrome");

			}
		}
		

	}

}
