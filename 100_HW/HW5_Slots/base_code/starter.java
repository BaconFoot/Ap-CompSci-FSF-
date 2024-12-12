import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules: \n  a. If two numbers match, you double your money.\n  b. If three numbers match, you triple your money. \n  c. If none match, you lose your money. \n -------------------------------------------------- ");
		
		while(money>0){
			System.out.print("\nWould you like to play the slots? (Yes/yes/Y/y) : " );
			String gamble = sc.nextLine();
			if(gamble.equals("Yes") || gamble.equals("yes") || gamble.equals("Y") || gamble.equals("y")){
				int num1 = (int)(Math.random()*10)+1;
				int num2 = (int)(Math.random()*10)+1;
				int num3 = (int)(Math.random()*10)+1;
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = sc.nextInt();
				
				sc.nextLine();
				while(true){
					if(wager <= 0){
						System.out.println("You don't input negatives or zeros.");
					}
					else if(wager > money){
						System.out.println("Hey! You ain't got that money!");
						break;
					}
					else{
						break;
					}
				}
				System.out.println("\nGreat! Let's play!!! \nYour rolls are: ");
				System.out.println("\n________________");
				System.out.println("| " + num1 + " | " + num2 + " | " + num3 + " | \n________________" );
				if(num1 == num2 && num1 == num3){
					money = money * 3;
					System.out.println("Congradulations, you won the jackpot! ");
					System.out.println("You now have $" + money);
					}
				else if(num1 == num2 || num1 == num3 || num2 == num3){
					money = money * 2;
					System.out.println("You won! Your wager has doubled. ");
					System.out.println("You now have $" + money);
				}
				else if(num1 != num2 && num1 != num3){
					money = money - wager;
				}
				System.out.print("Aww dang it");
			}
			else if(gamble.equals("No") || gamble.equals("no") || gamble.equals("N") || gamble.equals("n")){
				System.out.println("What a shame. \n You walk out with $" + money);
				System.out.println("Come again!");
				break;
			}
		}
	}
}
