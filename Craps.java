import java.util.*;

public class Craps {
	public static void main(String[] args) {
		//variables
		Scanner sc = new Scanner(System.in);
		String name;
		int firstRoll = 0;
		int secondRoll = 0;
		int currentRollDice1 = 0;
		int currentRollDice2 = 0;
		int currentRollsCombined = 0;
		int combinedRolls = 0;
		int point;
		char wantToPlay = 'Y';
		String temporary;
		
		//introduction
		System.out.println("Welcome to Craps!");
		System.out.print("Please enter your name: ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "! Let's play!");
		
		//checks if user wants to keep playing
		while(wantToPlay == 'Y') {
			//initial rolls
			firstRoll = ((int)(6*Math.random())) +1;
			secondRoll = ((int)(6*Math.random())) +1;
			combinedRolls = firstRoll + secondRoll;
			System.out.println("You have rolled " + firstRoll + " + " + secondRoll + " = " + combinedRolls);
			
			//checks if rolls give you a win or loss
			if(combinedRolls == 7 || combinedRolls == 11) {
				System.out.println("You win!");
			} else if (combinedRolls == 2 || combinedRolls == 3 || combinedRolls == 12) {
				System.out.println("You lose!");
			} else {
				//decalres the roll as point and keeps rolling until it rolls a 7 or the point
				point = combinedRolls;
				System.out.println(point + " is now the point!");
				currentRollDice1 = ((int)(6*Math.random())) +1;
				currentRollDice2 = ((int)(6*Math.random())) +1;
				currentRollsCombined = currentRollDice1 + currentRollDice2;
				while(currentRollsCombined != 7 && currentRollsCombined != point) {
					System.out.println("You have rolled a " + currentRollDice1 + " + " + currentRollDice2 + " = " + currentRollsCombined + ", keep rolling");
					currentRollDice1 = ((int)(6*Math.random())) +1;
					currentRollDice2 = ((int)(6*Math.random())) +1;
					currentRollsCombined = currentRollDice1 + currentRollDice2;
				}
	
				if(currentRollsCombined == point) {
					System.out.println("You have rolled a " + currentRollDice1 + " + " + currentRollDice2 + " = " + currentRollsCombined + ", you win!");
				} else if (currentRollsCombined == 7) {
					System.out.println("You have rolled a " + currentRollDice1 + " + " + currentRollDice2 + " = " + currentRollsCombined + ", you lose!");
				}
			}
			
			//asks the user to play again or not
			System.out.print("Would you like to play again (Y/N)?");
			temporary = sc.next();
			while(!(temporary.equals("Y")) && !(temporary.equals("N"))) {
				System.out.print("Please enter either Y or N: ");
				temporary = sc.next();
			}
			wantToPlay = temporary.charAt(0);
		}
		System.out.println("Goodbye, " + name + "!");
	}
}
