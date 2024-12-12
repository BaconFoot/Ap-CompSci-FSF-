import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer");
		int num1 = sc.nextInt();
		int count = 0;
		checkPrime(num1);
		printPrimes(num1);
		
			
	}	
	public static boolean checkPrime(int x){
		boolean isPrime = false;
		int count = 0;
		int y = x - 1;
		if(x == 2){
			count = x;
			isPrime = true;
		}
		while(count < x - 2){
			int prime = x % y;
			if(prime != 0){
				y = y - 1;
				count = count + 1;
				isPrime = true;
				}
			if(prime == 0){
				isPrime = false;
				break;
				}
		}
		if(isPrime == true){
			System.out.println( x + " is prime");
		} 
		return isPrime;
	}
	public static void printPrimes(int y){
		int count = 2;
		int z = y - 1;
		while(count < y){
			checkPrime(z);
			count = count + 1;
			z = z - 1;
		}
			
		}
}



