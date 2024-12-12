import java.util.Scanner;
import java.util.Random;

class Character{
	String role = new String("Wizard");
	int Strength = 2;
	int Dexterity = 2;
	int IQ = 10;
	int Charisma = 5;
	
}

class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
	
		System.out.println("Your role is " + myCharacter.role);
		System.out.println("Your strength trait is " + myCharacter.Strength);
		System.out.println("Your dexterity trait is " + myCharacter.Dexterity);
		System.out.println("Your IQ trait is " + myCharacter.IQ);
		System.out.println("Your Charisma trait is " + myCharacter.Charisma);
		
		


		
	}
}
