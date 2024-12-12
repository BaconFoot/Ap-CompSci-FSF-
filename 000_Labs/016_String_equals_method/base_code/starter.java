import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What roles would you like to be: Wizard, Warrior or Rogue");
		String role = sc.nextLine();
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You're a Wizard harry");
		}	
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You're a Warrior");
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You're a Rogue");
		}
		else{
			System.out.println("You may have made a spelling error.");
		}
		

	}
}
