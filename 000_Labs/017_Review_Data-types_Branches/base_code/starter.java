import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello. What is your name? ");
		String name = sc.nextLine();
		System.out.println("What is your title? ");
		String title = sc.nextLine();
		System.out.println("What roles would you like to be: Wizard, Warrior or Rogue");
		String role = sc.nextLine();
		int points = 20;
		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("You're a Wizard " + title + " harry");
		}	
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("You're a Warrior " + title + " " + name);
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("You're a Rogue " + title + " " + name);
		}
		else{
			System.out.println("You may have made a spelling error. Start again. ");
			System.exit(0);
		}
		System.out.println("You have 20 points you can put into the following stats. Buffness, Speed, IQ, and Rizz");
		System.out.println("You may put a max of 10 points into each trait. ");
		System.out.println("How many points would you like to put into buffness? ");
		int buffnessPoints = sc.nextInt();
		points = points - buffnessPoints;
		if(buffnessPoints <= 10 && buffnessPoints >= 0){
			System.out.println("You put " + buffnessPoints + " points into buffness");
			System.out.println("You now have " + points + " remaining to spend.");
		}
		else if(buffnessPoints > 10){
			System.out.println("You have inputed a number that is greater than 10 which is not allowed. ");
			System.exit(0);
		}
		else{
			System.out.println("You have inputted an invalid option. ");
			System.exit(0);
		}
		System.out.println("How many points would you like to put into Speed? ");
		int spedPoints = sc.nextInt();
		points  = points - spedPoints;
		if(spedPoints <= 10 && spedPoints >= 0){
			System.out.println("You put " + spedPoints + " points into Speed");
			System.out.println("You now have " + points + " remaining to spend");
		}
		else if(spedPoints > 10){
			System.out.println("You have inputed a number that is greater than 10 which is not allowed. ");						
			System.exit(0);
		}
		else{
			System.out.println("You have inputed an invalid option. ");
			System.exit(0);
		}
		System.out.println("How many points would you like to put for IQ? ");
		int smartness = sc.nextInt();
		points = points - smartness;
		if(points < 0){
			System.out.println("You have used too many points. ");
			System.exit(0);
		}
		if(smartness <= 10 && smartness >= 0){
			System.out.println("You put " + " points into IQ. ");
			System.out.println("You now have " + " points remaining. ");
		}
		else if(smartness > 10){
			System.out.println("You inputed a number greater than 10 which is invalid. ");
		}
		else{
			System.out.println("You have inputed an invalid option. ");
		}
		System.out.println("How many points would you like to put into Rizz");
		int rizzard = sc.nextInt();
		points = points - rizzard;
		if(points < 0){
			System.out.println("You have used too many points. ");
			System.exit(0);
		}
		
		if(rizzard < 10 && rizzard >= 0){
			System.out.println("You put " + rizzard + " points into Rizz");
			System.out.println("You have " + points + " leftover points. ");
		}
		else if(rizzard > 10){
			System.out.println("Your input is greater than 10 which is invalid. ");
			System.exit(0);
		}
		else if(rizzard == 10){
			System.out.println("You put 10 points into Rizz. You have w rizz. ");
		}
		else{
			System.out.println("Your have entered an invalid inpout. ");
			System.exit(0);
		}
		System.out.println("Hello " + title + " " + name + "." );
		System.out.println("You are a " + role + " with " + buffnessPoints + " buffness points, " + spedPoints + " speed points, " + smartness + " IQ points, and most importantly " + rizzard + " Rizz points. ");
	}
}
