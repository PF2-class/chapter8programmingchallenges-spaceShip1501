package FirstToOneGame;

public class Player{
private int amount;
private Dice dice;

public int getAmount() {
	return amount;
}


public Player(int amount, Dice dice) {
	super();
	this.amount = amount;
	this.dice= new Dice(dice);
	
}

public Player(Player b){
	this.amount= b.amount;
}public boolean Go() {
boolean win = false;
  dice.Roll();
if(amount - dice.getValue()==1){
    amount -= dice.getValue();
    win = true;
}
else if(amount - dice.getValue()<1)
    amount += dice.getValue();
else
    amount -= dice.getValue();
return win;
}
}
