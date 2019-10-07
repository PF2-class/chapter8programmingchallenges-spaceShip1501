package FirstToOneGame;

import java.util.Random;

public class Dice {



		Random radd= new Random();

	public Dice() {

	}public int Roll() {
		
		return radd.nextInt(6)+1;
	}

	}
