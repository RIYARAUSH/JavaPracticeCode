package Java;
class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuessGame game=new GuessGame();
		game.startGame();

	}

}


 class GuessGame{
	Player p1;
	Player p2;
	Player p3;
public void startGame() {
	p1=new Player();
	p2=new Player();
	p3=new Player();
	
	int guessp1=0;
	int guessp2=0;
	int guessp3=0;
	boolean p1isRight=false;
	boolean p2isRight=false;
	boolean p3isRight=false;
	int Targetnum=8;
	int sel=1;
	System.out.println(" i'm thinking number between 0 to 9 ");
	if(sel==1) {
		System.out.println("Number to guess is "+Targetnum);
		p1.guess();
		p2.guess();
		p3.guess();
		guessp1=p1.number;
		System.out.println(" player 1 guessed "+guessp1);
		guessp2=p2.number;
		System.out.println(" player 2 guessed "+guessp2);
		guessp3=p3.number;
		System.out.println(" player 3 guessed "+guessp3);
		if (guessp1==Targetnum) {
			p1isRight=true;	
		}
		if (guessp2==Targetnum) {
			p2isRight=true;	
		}
		if (guessp3==Targetnum) {
			p3isRight=true;	
			
		}
		if (p1isRight || p2isRight || p3isRight) {
			System.out.println("We have a winner");
			System.out.println(" Player 1 is "+ p1isRight);
			System.out.println(" Player 2 is "+ p2isRight);
			System.out.println(" Player 3 is "+ p3isRight);
			System.out.println(" Game is over");
		//----------------------------------------------------------
		}
		else {
			System.out.println(" You haven't guessed right one so, Try Again ");
		}//else
	}//while
	sel--;
}//method
	
}//class

 class Player{
	int number=0;
	public void guess(){
		number=(int)(Math.random()*10);
		System.out.println(" i'm Guessing "+number);
		
	}
}