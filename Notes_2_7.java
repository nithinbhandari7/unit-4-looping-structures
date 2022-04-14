import java.util.Scanner;
/*
The String Class
https://apstudents.collegeboard.org/ap/pdf/ap-computer-science-a-java-quick-reference_0.pdf

char charAt(int) - returns a char at the index of the int passed; you must pass
			a valid index
			
int indexOf(char) - returns the index of the first occurrence of the character in the 
					String, -1 if the character doesnt occur in the String
int indexOf(String)

int compareTo(String) - returns an int; a negative number if the calling object (this)
				is considered "less than" the argument passed, 0 if the two are considered
				to be equal, and a positive number if the calling object is considered
				"greater than" the argument passed
				exercise: "rank" the following Strings in order from "least" to "greatest"
				Banana, Watermelon, apple, banana, grape, grapes, orange
				
String substring(int) - returns the substring from the index of the int parameter to 
				the end of the String
				
String substring(int, int) - returns the substring from the index of the 
				first parameter (INCLUSIVE) to the index of the second parameter (EXCLUSIVE)
				
int length() - returns an int that is the number of characters in the String

*/
public class Notes_2_7 
{
	public static void main(String[] args)
	{
		String greeting = "what's up";
		
		int l = greeting.length();
		System.out.println(l); //9
		
		//print each character in the greeting string, one character per line
		
		
		System.out.println(greeting.charAt(0)); //w
		System.out.println(greeting.charAt(greeting.length())); //index out of bounds
		System.out.println(greeting.charAt(greeting.length() - 1)); //p

		int index = greeting.indexOf('a');
		System.out.println(index); //2
		int index2 = greeting.indexOf("at");
		System.out.println(index2); //2
		int index3 = greeting.indexOf("ta");
		System.out.println(index3); //-1
		
		String sub1 = greeting.substring(3);
		System.out.println(sub1); //t's up
		String sub2 = greeting.substring(2, 5);
		System.out.println(sub2); //at'
		
		String sub3 = greeting.substring(3, greeting.length());//t's up
		
		String animal1 = "Dog", animal2 = "Giraffe";
		System.out.println(animal1.compareTo(animal2));	// -
		System.out.println(animal2.compareTo(animal1)); // +
		System.out.println(animal1.compareTo("Dog")); // 0
		
		/*	
		Scanner sc = new Scanner(System.in);
		
		String a = "monkey";
		String aa = "monkeys";
		String b = "Tiger";
		String B = "tiger";
		String c = "elephant";
		
		System.out.println(a.compareTo(a));	// 0
		System.out.println(a.compareTo(b));	// +
		System.out.println(b.compareTo(a));	// -
		System.out.println(a.compareTo(c));	// +
		System.out.println(b.compareTo(c));	// -
		System.out.println(b.compareTo(B));	// -
		System.out.println(aa.compareTo(a));// +
		
		int length = a.length();
		System.out.println(length);   // 6
		
		String sub1 = a.substring(3);
		String sub2 = b.substring(2, 5);
		
		System.out.println(sub1);  //key
		System.out.println(sub2);  //ger
		
		sub1 = a.substring(a.length());	//""

		System.out.println(sub1 + "grape");		//grape
		
		sub1 = a.substring(a.length() + 1);	//out of bounds
		sub2 = a.substring(3, a.length() + 1);	//out of bounds
		
		sub1 = a.substring(3, 3);	//""
		System.out.println(sub1 + "grape");//grape
		
		boolean truth;
		String first = "Hello";
		String second = "Hello";
		String third = new String("Hello");
		String fourth = sc.next();	//assume the user enters "Hello"
		
		truth = first == second;
		System.out.println(truth);	//true
		
		truth = first == third;
		System.out.println(truth);	//false
		
		truth = second == third;
		System.out.println(truth);	//false
		
		truth = first == fourth;
		System.out.println(truth); //false
		
		char firstLetter = a.charAt(0);					//m
		char lastLetter = a.charAt(a.length() - 1);		//y
		char doesThisWork = a.charAt(a.length());		//out of bounds
		*/
	}
}