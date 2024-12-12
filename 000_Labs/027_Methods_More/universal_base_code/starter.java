import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        // Your code goes below here
        Scanner sc = new Scanner(System.in);
        Role bob = new Role();
        
        System.out.println("What is your role? The wizard, the rogue, or the warrior?: ");
        String User = sc.nextLine();
        bob.setRole(userRole);
        
        System.out.println("Enter your Dexterity");
        int User2 = sc.nextInt();
        bob.setDex(userDext);
        
        System.out.println("Enter your Charisma");
        int User3= sc.nextInt();
        bob.setCharisma(userRizz);
        
        System.out.println("Enter your intelegence");
        int User4 = sc.nextInt();
        bob.setIntel(userIQ);
        
        System.out.println("Enter your Strength");
        int User5 = sc.nextInt();
        bob.setStrength(userStrength);
        
        System.out.println(bob.setAll(userRole,userDext,userRizz,userIQ,userStrength));
        bob.myToString();


    }
}