package FirstToOneGame;

public class Player{
private int amount;

public int getAmount() {
	return amount;
}


public Player(int amount) {
	super();
	this.amount = amount;
}

public Player(Player b){
	this.amount= b.amount;
}public void plus(int newAmount) {
	this.amount+= newAmount;
}public void sub(int newAmount) {
	this.amount-= newAmount;
}

}
