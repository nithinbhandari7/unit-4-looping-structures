import java.util.Scanner;
import java.util.InputMismatchException;

public class Notes_4_1 
{
	public static void main(String[] args)
	{
		/*
		int num = 1;
		while(num < 11) {
			System.out.print(num++ + " ");
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int calories = 0;
		int totalCalories = 0;
		System.out.println("Please enter the amount of calories you ate today and enter -1 to get your total calories: ");
		calories = sc.nextInt();
		while(calories != -1) {
			totalCalories += calories;
			System.out.print("");
			calories = sc.nextInt();
		}
		System.out.println("Total calories: " + totalCalories);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int userNum;
		int tempNum = 0;
		int sum = 0;
		System.out.print("Please enter n: ");
		userNum = sc.nextInt();
		while(tempNum < userNum) {
			tempNum++;
			sum += tempNum;
		}
		System.out.println(sum);
		*/
		
		Scanner sc = new Scanner(System.in);
		boolean isGoodInput = false;
		int guess = -1, ran = (int)(Math.random()*10) + 1, numGuesses = 0;
		
		do {
			do {
				System.out.print("Enter a number from 1-10: ");
				try {
					guess = sc.nextInt();
					if(guess >= 1 && guess <=10) {
						isGoodInput = true;
					}
				}
				catch(InputMismatchException e) {
					sc.nextLine();
				}
			}while(!isGoodInput);
			
			if(guess > ran) {
				System.out.println("Too high");
			} else if (ran > guess) {
				System.out.println("Too low");
			} else {
				System.out.println("Correct");
			}
			numGuesses++;
		}while(guess != ran);
		System.out.println("It took you " + numGuesses + " guesses to get it correct.");
	}
}
	//try - should include whatever it is that you want to "try" to do (whatever
		//could cause the error)
	//catch - should include whatever code you want to execute if the error
		//does occur
/*
Looping (Iterative) Structure
 * 		iteration: one repetition of a loop
 * 
 * 		-while loop - when the number of iterations is not known
 * 				while(booleanStatement)
 * 				{
 * 					//code that will execute as long as the statement is true
 * 				}
 * 
 * 		-do-while loop - used when the number of iterations is not known, 
 * 				always executes at least once
 * 
 * 				do
 * 				{
 * 					//code that will execute as long as the statement is true
 * 				}
 * 				while(booleanStatement);
 * 
 * 		break; - exits a structure
 * 	
 * 		continue; - skips the remainder of the code in the body of a loop but 
 * 				tests the condition again

 * 		REMEMBER: the condition describes the situation in which you want the 
 * 			loop to continue iterating
 * 
 * /*
 * Define: local, scope, accumulator, counter
 
Tracing examples:
EXAMPLE 1 - what is the value of count after the code executes?
int count = 1;
while (count <= 10)
{
    count *= 2;
}
count = count - 10; 6


EXAMPLE 2 - What is the output of the following code segment?
int x = -5;
while (x < 0)
{
   x++;
   System.out.print(x + " ");
}  -4 -3 -2 -1 0

EXAMPLE 3 - What is the output of the following code segment?
int count = 1;
while (count < 8)
{
	System.out.println(count);
} 1 repeated



Programming examples
 1. write a loop that outputs the numbers 1-10
 2. calorie calculator - allow the user to enter the calorie count of the items 
  		they ate today. The user will specify he/she is done by entering -1
  		Define: sentinel value, temporary variable
 3. Prompt, and FORCE the user to enter a number from 1-10.  Check for range and type errors.
 4. Generate a random number from 1-10.  Continue to ask the user to enter a 
 	number from 1-10 until they guess the correct number.  As they guess, tell them 
 	if their guess was too high, too low, or correct.  Count (and output) how many
 	guesses it took the user to get it right.
 5. calculate the sum of the numbers from 1 to n (a user entered positive integer)
 
 */

//an ACCUMULATOR is a variable that changes either incrementally
	//or by a multiple of itself (sums, products)
	//general rule: initialize accumulators to the identity
	//of whatever operation is being performed (sum - 0, product - 1)

//counter variable: a special kind of variables that
	//tallies, counts, or keeps track of the number of times
	//something occurs

//local: a variable is considering LOCAL to the block of code
	//in which its declared, meaning it can only be used
	//in that block

//scope: a description of where a variable can be used

//example: here, the scope of i is LOCAL to the for loop