package HeadOrTailsGame;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1= new Player("thuyen");
		Player player2= new Player("duyen");
		Scanner key1= new Scanner (System.in);
		Scanner key2= new Scanner (System.in);
		player1.Go("head");
		
		do {
				System.out.println("Player 1: Enter your guess");
				String guess1= key1.nextLine();
				player1.Go(guess1);
				//System.out.println("Your code");
				System.out.println("Player 2: Enter your guess");
				String guess2= key2.nextLine();
				player2.Go(guess2);
				
		}while (player1.getPoint()!=5 || player2.getPoint()!=5);
	}

}
