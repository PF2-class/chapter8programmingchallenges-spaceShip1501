package HeadOrTailsGame;

import java.util.Random;

public class Coin {
private String side;

public Coin() {
	toss();
}public void toss() {
	Random rad= new Random ();
	int num = rad.nextInt(1-0+1)+0;
	if (num == 0) side= "head";
	else side="tail";
	
}
public String getSide() {
	return side;
}


}
