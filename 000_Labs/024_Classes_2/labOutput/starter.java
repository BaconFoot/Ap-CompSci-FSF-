import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        myCharacter bob = new myCharacter();
        
        System.out.println("Your role is the " + bob.roles());
        System.out.println("You have " + bob.dext() + " points.");
        System.out.println("You have " + bob.smartness() + " points.");
        System.out.println("You have " + bob.charisma() + " points.");
        System.out.println("You have " + bob.fastness() + " points.");
        
        
	}
}