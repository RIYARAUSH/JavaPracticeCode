package Java;


public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GuessGame1 game=new GuessGame1();
game.startGame1();

	}

}
class GuessGame1{
	players p1;
	players p2;
	players p3;
	public void startGame1() {
		p1=new players();
		p2=new players();
		p3=new players();
	System.out.println(" i'm thinking number between 1 to 9.... ");
	int targetnum=6;
	System.out.println(" Number to guess is "+targetnum);
	p1.guessw();
	p2.guessw();
	p3.guessw();
	int guessp1=p1.number;
	int guessp2=p2.number;
	int guessp3=p3.number;
	Boolean p1isright=false;
	Boolean p2isright=false;
	Boolean p3isright=false;
	System.out.println("Player 1 guessed "+guessp1);
	System.out.println("Player 2 guessed "+guessp2);
	System.out.println("Player 3 guessed "+guessp3);
	if (guessp1==targetnum) {
		p1isright=true;
	}
	if (guessp2==targetnum) {
		p2isright=true;
	}if (guessp3==targetnum) {
		p3isright=true;
	}
	if (p1isright ||p2isright||p3isright) {
		System.out.println("we have a winner");
		System.out.println("Player 1 is "+p1isright);
		System.out.println("Player 2 is "+p2isright);
		System.out.println("Player 3 is "+p3isright);
		System.out.println(" GAME OVER");
	}
	else {
		System.out.println(" TRY AGAIN");
	}
	}
}

class players{
	
	int number=0;
	public void guessw() {
	number=(int)(Math.random()*10);
	System.out.println(" i'm Guessing "+number);
	}
}
