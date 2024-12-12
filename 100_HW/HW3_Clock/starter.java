import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day of the week is it?");
		System.out.println("1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6= Saturday, and 7=Sunday");
		int num1 = sc.nextInt();
		
		if(num1 < 6 && num1 >= 1){
			System.out.println("It's a weekday. Wake up at 7 am. ");
		}
		else if(num1 == 6 || num1 == 7){
			System.out.println("It's a weekend. You can wake up at 10 am. ");
		}
		else{
			System.out.println("Invalid response. ");
		}

	}
}
