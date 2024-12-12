import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something to be translated to pig latin");
		
		String sentence = sc.nextLine();
		String newSentence = "";
		while(true){
			if(sentence.indexOf(" ") == -1){
				sentence = pigLatin(sentence);
				newSentence = newSentence+sentence;
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			
			sentence = sentence.substring(space+1);
			word = pigLatin(word);
			newSentence = newSentence+word;
		}
		System.out.println(newSentence);
	}
	public static String pigLatin(String word){
		String firstLetter = (word.substring(0,1));
		String secondLetter = (word.substring(1,2));
		if(ifvowel(firstLetter) == true){
				word = word  + "-way ";
			}
		else{
			if(ifvowel(secondLetter) == true){
				word = word.substring(1,2) + word.substring(2) + "-" + firstLetter + "ay ";	
			}
			else{
				word =  word.substring(2,3) + word.substring(3) + "-" + firstLetter + secondLetter + "ay ";
			}
		}
		return word;
	}
	public static boolean ifvowel(String letter){
		boolean tf = false;
		if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("u") || letter.equals("o") || letter.equals("A") || letter.equals("E") || letter.equals("I") || letter.equals("O") || letter.equals("U")){
			tf = true;
			}
		else{
			tf = false;
		}
		return tf;
	}
}
