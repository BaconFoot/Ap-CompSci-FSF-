import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);


		System.out.println("Input a double ");
		double num1 = sc.nextDouble();
		
		System.out.println("Inout another double ");
		double num2 = sc.nextDouble();
		
		System.out.println(Math.max(num1,num2));
		
		System.out.println(Math.sqrt(num2));
		
		System.out.println(Math.pow(num1,num2));
		
		
	}
}

//1. Take in two double values (x,y) using Scanner from the user
//2. Output the max of the two values
//3. Output the Square Root of y
//4. Output the power of xy