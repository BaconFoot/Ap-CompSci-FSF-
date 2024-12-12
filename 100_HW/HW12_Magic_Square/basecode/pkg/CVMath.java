package pkg;

public class CVMath {
    public static int findMid(int one, int two, int three) {
        return (one + two + three - Math.min(one, Math.min(two, three)) - Math.max(one, Math.max(two, three)));
    }

    // Function to find the nth special square
    public static int specialSquare(int num) {
        int counter = 0;  
        int numCounter = 1;  
        int ss = 1;  

        while (counter < num) {
            // Check if numCounter is a perfect square
            int squareRoot = (int) Math.sqrt(numCounter);
            if (squareRoot * squareRoot == numCounter) {
                // Calculate the sum of integers from 1 to numCounter
                int sum = (numCounter * (numCounter + 1)) / 2;
                
                // Check if the sum is equal to numCounter
                if (sum == numCounter) {
                    counter++;  // Found a special square, increment counter
                    ss = numCounter;  // Update ss to the current special square
                }
            }
            numCounter++;  // Increment numCounter to check the next number
        }

        return ss;  // Return the nth special square
    }
}