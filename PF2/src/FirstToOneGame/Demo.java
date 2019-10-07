package FirstToOneGame;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player playerA= new Player(50);
		Player playerB= new Player(50);
		Dice dice= new Dice ();
		//System.out.println(dice.Roll());
		int amount;
		int round=0;
		do {
			round++;
			amount= dice.Roll();
			if (playerA.getAmount()- amount<1)
				playerA.plus(amount);
			else playerA.sub(amount);
			amount= dice.Roll();
			if (playerB.getAmount()- amount<1)
				playerB.plus(amount);
			else playerB.sub(amount);
			if (playerA.getAmount()==1 || playerB.getAmount()==1)
				break;
			
		} while(playerA.getAmount()!=1 || playerB.getAmount()!=1);
		System.out.println(playerA.getAmount());
		System.out.println(playerB.getAmount());
		System.out.println(round);
	}

}
