/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int num1 = (int) (Math.random()*1000) + 1;
		while(true){
			System.out.println("Pick a number 1-1000");
			int num2 = sc.nextInt();
			if(num1 != num2){
				if(num2 > 1000 || num2 < 1){
				System.out.println("Please enter a number between 1-1000");
				}
				if(num2 < num1){
					System.out.println("Try guessing higher. ");
				}
				else if(num2 > num1){
					System.out.println("Try guessing lower. ");
				}
				else{
					System.out.println("RNG carried fr");
					
				}
			}
			else if(num1 == num2){
				break;
			}
			
			
		}	
		System.out.println("Congrats you got it!");
	}
}