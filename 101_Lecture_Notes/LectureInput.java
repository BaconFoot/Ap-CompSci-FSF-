import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a name");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.print("Please enter an integer ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter another integer ");
        int num2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        
        System.out.println("What is your favorite food? ");
        String food = sc.nextLine();
        System.out.println(food);
        
	}
}