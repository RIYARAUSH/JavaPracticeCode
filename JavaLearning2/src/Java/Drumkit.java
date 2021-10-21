package Java;

public class Drumkit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testdrumkit d=new testdrumkit();
d.playTopHat();
d.playSnare();
d.Snare=false;
if (d.Snare==true) {
	d.playSnare();
}
	}

}
class testdrumkit{
	Boolean topHat=true;
	Boolean Snare=true;
	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
	void playSnare() {
		System.out.println("bang bang ba-bang");
	}
}
