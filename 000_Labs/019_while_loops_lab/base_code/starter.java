/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("How many times would you like me to print out your name? ");
		int nameCount = sc.nextInt();
		int count = 0;
		
		while(count < nameCount){
			System.out.println(name);
			count = count +1;
		}



		
	}
}
