import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input an integer");
		int num1 = sc.nextInt();
		System.out.println("Input another integer");
		int num2 = sc.nextInt();
		
		//Even or odd check
		if(num1%2 != 0){
			System.out.println("Num1 is quite odd");
		}
		else{
			System.out.println("Num1 is even");
		}
		if(num2%2 != 0){
			System.out.println("Num2 is quite odd");
		}
		else{
			System.out.println("Num2 is even");
		}
		
		int DivBy3Pt1 = num1%3;
		int DivBy3Pt2 = num2%3;
		
		int DivBy4Pt1 = num1%4;
		int DivBy4Pt2 = num2%4;
		
		int DivBy5Pt1 = num1%5;
		int DivBy5Pt2 = num2%5;
		
		if(DivBy3Pt1 == 0 && DivBy4Pt1 == 0 && DivBy5Pt1 == 0){
			System.out.println("Num1 is divisible by 3, 4, and 5. ");
		}
		else{
			System.out.println("Num1 is not divisible by 3, 4, and 5. ");
		}
		
		if(DivBy3Pt2 == 0 && DivBy4Pt2 == 0 && DivBy5Pt2 == 0){
			System.out.println("Num2 is divisble by 3, 4, and 5. ");
		}
		else{
			System.out.println("Num2 is not divisible by 3, 4, and 5. ");
		}
		
		

	}
}
