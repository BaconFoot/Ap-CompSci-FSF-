import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String word1 = sc.nextLine();
		
		System.out.println("Enter another Strings");
		String words = sc.nextLine();
		System.out.println("This is using the methods");
		toString(word1);
		toStringCombined(word1, words);
	}
	public static void toString(String whatever){
		System.out.println(whatever);
		
	}
	public static void toStringCombined(String someString1, String someString2){
		System.out.println(someString1 + " " + someString2);
	}
	
}


// Lab - Methods
// 1. Create a toString method in your starter.java
// 2. The function itself should print out whatever String is
// given to the user.
// 3. This method should have 1 String parameter
// 4. It should return nothing
// Continued
// 1. Create a second method called toStringCombined.
// 2. The function itself should print out two given Strings side
// by side with a space in between.
// 3. Takes 2 String parameters
// 4. It should return nothing.