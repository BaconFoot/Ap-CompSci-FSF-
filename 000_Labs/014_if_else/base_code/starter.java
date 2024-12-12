import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = (int)(Math.random()*1000)+1;
		System.out.println("Pick a number between 1-1000");
		int y = sc.nextInt();
		
		if(x == y){
			System.out.println("RNG carried fr. ");
		}
		else{
			System.out.println("Aw dang it. Try again.");
		}
		
	}
}
