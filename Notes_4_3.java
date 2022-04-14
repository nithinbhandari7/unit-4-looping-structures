public class Notes_4_3 {
	public static String makeInitials(String name) {
		//public - access modifier
		//static - class (as opposed to an instance) function
		//String - return type
		//String name - parameter list (what the function needs to do its job)
		int spaceIndex = name.indexOf(" ");
		String firstInitial = name.substring(0,1);
		String lastInitial = name.substring(spaceIndex+1, spaceIndex+2);
		
		return firstInitial + "." + lastInitial + ".";
	}
	
	public static String reverseString(String word) {
		String original = word;
		String reverse = "";
		
		for(int i = original.length()-1; i > -1; i--) {
			reverse = reverse + original.substring(i, i+1);
		}
		
		return reverse;
		
	}
	
	public static String makeAllInitials(String name) {
		String initials = "";
		boolean space = true;
		for(int i = 0; i < name.length(); i++) {
			if(space) {
				initials += name.substring(i, i+1) + ".";
			}
			
			if(name.substring(i, i+1).equals(" ")) {
				space = true;
			} else {
				space = false;
			}
		}
		
		return initials;
	}
	
	public static void main(String[] args) {
		//in this program, we are using main as a driver
		//driver - special class or function  used to test other classes/functions
		String fullName = "Nithin Bhandari";
		String initials = makeInitials(fullName);
		System.out.println(initials);
		
		String reversed = reverseString("pencil");
		System.out.println(reversed);
		
		String allInitials = makeAllInitials("Nithin Kumar Bhandari");
		System.out.println(allInitials);
	}
}
/*		
1. Write a function with the following header and precondition:
	//precondition: name contains exactly one space
	//returns a String with the first and last initials of name
	public static String makeInitials(String name)

	2. Write a function that accepts a String that represents a name.
	The function should return the initials of the name.
	The function should work whether the String represents a first and last name, 
	or first, middle, and last name.
	
	3. Write a function that accepts a String and returns the reverse 
	order of its parameter
*/