/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the dog's name? ");
		String dogName = sc.nextLine();
		
		System.out.println("What is " + dogName + "'s age?");
		String dogAge = sc.nextLine();
		
		Dog dogpool = new Dog(dogName, dogAge);
		Dog doge = new Dog("Doge", "Golden Retriever");
		
		dogpool.isSleeping();
		doge.isSleeping();
		
		if(dogpool.isSleeping() == true){
			System.out.println(dogName + " is sleeping");
			System.out.println("Doge does nothing");
		}
		else{
			dogpool.bark();	
			doge.bark();
		}
		
		
		


	}
}
