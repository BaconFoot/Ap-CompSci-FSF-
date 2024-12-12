/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first and last name with a space between the two. ");
		String word = sc.nextLine();
		String temp = "Temp";
		
		for(int i = 0; i < word.length(); i++){
			temp = word.substring(i,i+1);
			if(temp.equals(" ")){
				System.out.print("The last name is:" + word.substring(i+1));
			}
		}
	}
}
