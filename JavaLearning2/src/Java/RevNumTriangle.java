package Java;

public class RevNumTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int s=5;
		int t=5;
		for (int i = 1; i <=n; i++) {
			s=5;
			for (int j = 1; j <=t; j++) {
				System.out.print(s+" ");
				s--;
			}
			t--;
			
			System.out.println();
		}
	}

}
