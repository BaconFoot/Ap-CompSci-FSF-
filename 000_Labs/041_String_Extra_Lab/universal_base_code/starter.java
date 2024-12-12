import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x = sc.nextLine();
		String newSentence = "";
		
		while(true){
            if(x.indexOf(" ") == -1){
                newSentence = x + " " + newSentence;
                break;
            }
            int space = x.indexOf(" ");
            String word = x.substring(0, space);
            x = x.substring(space+1);
            newSentence = word + " " + newSentence;
        }
		System.out.println(newSentence);
	}
}

