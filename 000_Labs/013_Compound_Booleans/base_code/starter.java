import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer ");
		int num1 = sc.nextInt();
		System.out.println("Enter another integer ");
		int num2 = sc.nextInt();
		System.out.println("Enter another different integer");
		int num3 = sc.nextInt();

		
		int num4;
		int num5;
		
		if(num1 > num2 && num1 > num3){
			num4 = num1;
			System.out.println(num4 + " is the biggest integer");
		}
		if(num2 > num1 && num2 > num3){
			num4 = num2;
			System.out.println(num4 + " is the biggest integer");
		}
		if(num3 > num1 && num3 > num2){
			num4 = num3;
			System.out.println(num4 + "is the biggest integer");
		}
		
		if(num1 < num2 && num1 < num3){
			num5 = num1;
			System.out.println(num5 + " is the smallest integer");
		}
		if(num2 < num1 && num2 < num3){
			num5 = num2;
			System.out.println(num5 + " is the smallest integer");
		}
		if(num3 < num1 && num3 < num2){
			num5 = num3;
			System.out.println(num5 + " is the smallest integer");
		}
	}
}
