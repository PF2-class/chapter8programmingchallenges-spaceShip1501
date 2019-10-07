package FirstToOneGame;

import java.util.Random;

public class Dice {

	private int value;
		

	public Dice() {
		Roll();
		
	}public Dice (Dice b){
		Roll();
		
	}
	public void Roll() {
		Random radd= new Random();
		value = radd.nextInt(6)+1;
	}
	public int getValue() {
		return value;
	}

	}
