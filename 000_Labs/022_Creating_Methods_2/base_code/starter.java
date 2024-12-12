import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your base number: ");
        int a = sc.nextInt();
        System.out.print("Enter your exponent: ");
        int b = sc.nextInt();
        System.out.print(a + " to the power of " + b + " equals ");
        System.out.print(pow(a, b));

    }
     public static int pow(int a, int b){
        int num1 = a;
        while(b > 1){
            num1 = num1 * a;
            b = b - 1;
        }
        return num1;
    }

}



// 1. Create a new method named “pow”
// 2. This should act just like the Math.pow(x,y) function.
// a. It should give back the value of xy
// 3. It takes two integer parameters
// 4. It returns one integer
// Hint: Use what you learned from the while loop labs