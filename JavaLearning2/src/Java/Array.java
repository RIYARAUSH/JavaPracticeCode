package Java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr1= {23,45,67};
		int[]arr2= new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("Element of Array 1 is");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		
		}
		System.out.println("Element of Array 2 is");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

}
