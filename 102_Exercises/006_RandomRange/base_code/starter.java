import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter another integer that is larger than the first integer : ");
		int num2 = sc.nextInt();
		
		int answer = num2 - num1;
		
		int random = (int) (Math.random()*answer)+num1;
		
		System.out.print("The random numbers being outputted are: ");
		System.out.println(random + ", ");
		int random1 = (int) (Math.random()*answer)+num1;
		System.out.println(random + ", ");
		int random2 = (int) (Math.random()*answer)+num1;
		System.out.println(random + ", ");
		int random3 = (int) (Math.random()*answer)+num1;
		System.out.println(random + ", ");
		int random4 = (int) (Math.random()*answer)+num1;
		System.out.println(random + ", ");
		
	}
}
