/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static boolean isLeapYear(int year){
		boolean leapYear = false;
		if(year % 4 == 0){
			leapYear = true;	
		}
		else{
			leapYear = false;
		}
		return leapYear;
	}
	
	public static int getDigitSum(int number){
		int digit = 0;
		int actualSum = 0;
		int count = 0;
		while(count < 5){
			if(number % 5 == 0){
				if(number % 2 == 0){
					digit = 0;
					System.out.println("0");
				}
				else{
					digit = 5;
					System.out.println("5");
				}
			}
			else if(number % 10 == 8){
				digit = 8;
				System.out.println("8");
			}
			else if(number % 10 == 6){
				digit = 6;
				System.out.println("6");
			}
			else if(number % 10 == 4){
				digit = 4;
				System.out.println("4");
			}
			else if(number % 2 == 0){
				digit = 2;
				System.out.println("2");
			}
			else if(number % 10 == 9){
				digit = 9;
				System.out.println("9");
			}
			else if(number % 10 == 3){
				digit = 3;
				System.out.println("3");
			}
			else if(number % 10 == 7){
				digit = 7;
				System.out.println("7");
			}
			else{
				digit = 1;
				System.out.println("1");
			}
		
			actualSum = actualSum + digit;
			number = number / 10;
			count = count + 1;
		}
		return actualSum;
	}
	
	
	public static void printIfConsecutive(int x, int y, int z){
		if(x + 1 == y && y + 1 == z){
			System.out.println(x + " " + y + " " + z + " are consecutive.");
		}
		else{
			System.out.println(x + " " + y + " " + z + " aren't consecutive.");
		}
		
	}
	public static void main(String args[]) {
		// System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		// System.out.print("Enter a year: ");
		// int year = sc.nextInt();
		// System.out.println();
		// if(isLeapYear(year))
		// 	System.out.println(year + " is a leap year!");
		// else
		// 	System.out.println(year + " is not a leap year!");

		// System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		// System.out.println("----------------------------------------");
		// System.out.println("Enter a number");
		// int num1 = sc.nextInt();
		// System.out.println("Enter a number");
		// int num2 = sc.nextInt();
		// System.out.println("Enter a number");
		// int num3 = sc.nextInt();
		// System.out.println();
		// printIfConsecutive(num1, num2, num3);
		// System.out.println();
		// System.out.println("----------------------------------------");
	}
}
