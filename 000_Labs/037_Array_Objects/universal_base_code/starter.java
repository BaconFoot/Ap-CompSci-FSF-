import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard [] wizards = new Wizard[100];
		Warrior [] warriors = new Warrior[100];
		
		for(int i = 0; i < 100; i++){
			wizards[i] = new Wizard();
			warriors[i] = new Warrior();
		}
		int warr = 0;
		int wiz = 0;
		boolean winner = true;
		while(winner == true){
			if(warr < 100 && wiz < 100){
				wizards[wiz].attack(warriors[warr]);
				if(warriors[warr].isDead() == true){
					warr++;
				}
				warriors[warr].attack(wizards[wiz]);
				if(wizards[wiz].isDead() == true){
					wiz++;
				}
			}
			if(warr >= 100){
				System.out.println("Wizards won with " + (100-wiz) + " left in their army. ");
				break;
			}
			if(wiz >= 100){
				System.out.println("Warriors won with " + (100-warr) + " left in their army. ");
				break;
			}
		}
	}
}