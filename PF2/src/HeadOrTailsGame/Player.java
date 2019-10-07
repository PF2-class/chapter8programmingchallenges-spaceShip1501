package HeadOrTailsGame;

public class Player {
private String name;
private int point;
private Coin coin;
public String getName() {
	return name;
}
public int getPoint() {
	return point;
}
public Coin getCoin() {
	return coin;
}
public Player(String name) {
	super();
	this.name = name;
	this.point = 0;
	this.coin = new Coin ();
}public boolean Go (String guess) {
	boolean win=false;
	if (guess.equalsIgnoreCase(coin.getSide())) {
		point++;
		System.out.println(coin.getSide());
		System.out.printf("Your %s is %d point \n ",name, point);}
	else {point--;
	System.out.println(coin.getSide());
	System.out.printf("Your %s is %d point \n ",name, point);}
	if (point==5) win=true;
	return win;
}

}
