package Java;

public class ReversingStringByWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r1="We are studying java concept";
		System.out.println("My string is: "+r1);
	String[] words= r1.split(" ");
	int size=words.length;
	System.out.println(size+" words are in my string");
	//System.out.println(words[3]);
	System.out.println("After reversing By words my string is: ");
	for (int i = size-1; i >=0; i--) {
		System.out.print(words[i]+" ");
	}

	}

}
