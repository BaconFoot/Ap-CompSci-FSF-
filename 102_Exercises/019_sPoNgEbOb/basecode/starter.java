/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String x = sc.nextLine();
		
		while(true){
			if(x.indexOf(" ") == -1){
				System.out.println(spongeCase(x));
				break;
			}
			int space = x.indexOf(" ");
			String word = x.substring(0,space);
			System.out.println(spongeCase(x + " "));
			x = x.substring(space+1);
		}
		
	}
	public static String spongeCase(String x){
		String newSentence = "";

		int space1 = x.indexOf(" ");
		String word1 = x.substring(0,space1);
		for(int i = 0; i < word1.length(); i++){
			if(i % 2 == 0){
			String letter1 = x.substring(i, i+1);
				String lower = letter1.toLowerCase();
				newSentence = newSentence + lower;
			}
			else if(i % 2 != 0){
				String letter2 = x.substring(i, i+1);
				String upper = letter2.toUpperCase();
				newSentence = newSentence + upper;
			}
		}
		return newSentence;
		
	}
	
}
