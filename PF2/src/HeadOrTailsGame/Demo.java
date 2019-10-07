package HeadOrTailsGame;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
        Player one = new Player("Jabba");
        Player two = new Player("Han Solo");
        boolean test = false, test2 = false;
        do{
            System.out.println("Player n1 guess. Heads or tails?");
            test = one.Go(keyboard.nextLine());
            System.out.println("Player n2 guess. Heads or tails?");
            test2 = two.Go(keyboard.nextLine());
            System.out.println(one+"\n"+two);
            if(test)
                System.out.println("The winner is "+one.getName());
            if(test2)
                System.out.println("The winner is "+two.getName());
        }while(!(test || test2));
	}

}
