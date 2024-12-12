import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me an integer: ");
		int num1 = sc.nextInt();
		System.out.println("Give me the same or different integer: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2){
			System.out.println("Congraduations your thinking is very repetitive. ");
		}
		else{
			System.out.println("Good job you printed 2 different integers! ");
		}
	}
}

