import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an Alien Exchange Program!");
        System.out.println("Pick an Alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza. ");
        System.out.println("2. Bob, a blue alien who loves trees. ");
        System.out.println("3. Barne a purple tailed alien who eats butterflies. ");
	    System.out.println("Which alien would you like to choose? ");
	    int alien = sc.nextInt();
	    
	    if(alien == 1){
	        System.out.println("You have chosen Joe");
	        System.out.println("You've just moved into a new neighborhood and you want some pizza. ");
	        System.out.println("What type of pizza would you like? ");
	        
	    }
	    else if(alien == 2){
	        System.out.println("You have chosen Bob");
	       
	    }
	    else if(alien == 3){
	        System.out.println("You have chosen Barne");
	       
	    }
	    else{
	        System.out.println("You got James");
	        System.out.println("You just woke up, do you want to breathe? Type 1 for yes and 2 for no: ");
	        int breathe = sc.nextInt();
	        if(breathe == 1){
	            System.out.println("You discover that you are allergic to air and your die. Rip bozo.");
	        }
	        else if (breathe == 2){
	            System.out.println("You die from not breathing. Rip bozo. ");
	        }
	        else{
	            System.out.println("You died of a heartfailure. Try again. ");
	        }
	        
	    }
        
    }   
}