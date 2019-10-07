package FirstToOneGame;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice= new Dice();
		Player a= new Player(50,dice);
		Player b= new Player (50,dice);
		boolean test= false,  test2=false;
		do {
			test=a.Go();
			test2=b.Go();
			System.out.println(test +"  "+ test2);
			if (test) System.out.println("win: A" );
			if (test2) System.out.println("win: B" );
		} while (!test||!test2);

	}

}
