import java.util.*;

public class Notes_4_2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		/*
		int row;
		int column;
		System.out.print("Please enter the number of rows: ");
		row = sc.nextInt();
		System.out.print("Please enter the number of columns: ");
		column = sc.nextInt();
		
		for(int i = 0; i < column; i++) {
			for(int v = 0; v < row; v++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		/*
		int base = 4;
		for(int i = 0; i < base; i++) {
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println(); 
		}
		*/
		
		int rows;
		int spaces;
		System.out.print("Please enter the number of rows: ");
		rows = sc.nextInt();
		spaces = rows-1;
			for(int j = 1; j < ((rows*2)); j+=2) {
				for(int i = spaces; i > 0; i-=1) {
					System.out.print(" ");
				}
				spaces-=1;
				for(int v = 0; v < j ; v++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			spaces = 1;
			for(int j = (rows*2) - 3; j > 0; j-=2) {
				for(int i = 0; i < spaces; i+=1) {
					System.out.print(" ");
				}
				spaces+=1;
				for(int v = 0; v < j ; v++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

/*
 * 	-for loop - used when the number of iterations is known 
 * 	(in either literal or variable form)
 * 			for(initialization; booleanStatement; update)
 * 			{
 * 
 * 			}
 */

/*
 * TRACING EXAMPLES
//example 1 - what is the exact output of the following 
for(int i = 0; i < 10; i++)
	System.out.println(i); 0 1 2 3 4 5 6 7 8 9

//example 2 - describe the output of the following
for(int i = 1; i <= 5; i++)
	System.out.println("Hello World"); 5 Hello World

//example 3
for(int i = 0; i <= 10; i += 2) 0 2 4 6 8 10
  System.out.println(i);

//example 4
for(int i = 0; i <= 100; i *= 2) repeats 0
  System.out.println(i);

//example 5
for(int i = 1; i <= 100; i *= 2) 1 2 4 8 16 32 64
  System.out.println(i);

//example 6
for int i = 1; i <= 10; i--)           
	System.out.println("Hello"); repeats Hello

 * 
 * PROGRAMMING EXAMPLES
 * Define: local, scope, accumulator, counter
 * 1. calculate n!
 * 2. calculate the summation of the series...
 * 3. add all the odd numbers from 0 to n together
 * 4. display the multiplication table of a given integer
 * 
 * Two d (nested) iteration:
 * 1. Draw a rectangle with user defined row and column numbers 
 * 		Define: nesting
 * 2. Draw an isosceles right triangle with user defined base
 * 3. challenge triangle
 * 4. Diamond

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :

                                                                                 
      *                                                                          
     ***                                                                         
    *****                                                                        
   *******                                                                       
  *********                                                                      
 ***********                                                                     
*************                                                                    
 ***********                                                                     
  *********                                                                      
   *******                                                                       
    *****                                                                        
     ***                                                                         
      *   
       
 * */


//local: a variable is considering LOCAL to the block of code
	//in which its declared, meaning it can only be used
	//in that block

//example: here, the scope of i is LOCAL to the for loop

/*
TRACING EXAMPLES
//example 1 - How many times does the following code print a *? 20
for(int i = 3; i < 8; i++)
{
   for(int y = 1; y < 5; y++)
   {
       System.out.print("*");
   }
   System.out.println();
} 

//example 2 - How many stars are printed out by the following loops? 

				How many times do the loops run? 50
for(int row = 0; row < 5; row++)
{
	for(int col = 0; col < 10; col++)
	{
		System.out.print("*");
	}
	System.out.println();
}

//example 3 - describe what the code below prints (what does it LOOK like)
for (int i = 2; i < 8; i++)
{
   for (int y = 1; y <= 5; y++)
   {
       System.out.print("*");
   }
   System.out.println();
   
} 6 by 5 box of stars, 6 down and 5 across
*/