import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Cipher cypher = new Cipher();
		System.out.print("Please enter a cipher");
		String inputCypher = sc.nextLine();
		
		System.out.println(cypher.encode(inputCypher));

		int key = 0;
		System.out.println(cypher.keyedEncode(inputCypher,key));
		
		//Used a loop to check for the ciphers without keys
		 //int Key = 0;
   //      while (Key < 37){
   //         System.out.println(cypher.keyedEncode(inputCypher,Key)+"   "+ Key);
   //         Key++;		
		
   //      }
	}
}
