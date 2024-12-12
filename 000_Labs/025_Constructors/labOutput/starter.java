import pkg.*;
import java.util.Scanner;


class starter{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What would you like your role to be?: ");
        String daRole = sc.nextLine();
        
        myCharacter bob = new myCharacter(daRole);
        
        System.out.println("Your role is the " + bob.roles());
        System.out.println("You have " + bob.dext() + " points.");
        System.out.println("You have " + bob.smartness() + " points.");
        System.out.println("You have " + bob.rizz() + " points.");
        System.out.println("You have " + bob.fastness() + " points.");
    }
}