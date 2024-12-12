import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[100];
		for(int a = 0; a < arr.length; a++){
			arr[a] = (int)(Math.random()*100)+1;
		}
		toStringArray(arr);

		System.out.println("The average of 100 random numbers is: " + getArrayAverage(arr));
		System.out.println("The maximum value of 100 random numbers is: " + getArrayMax(arr));
		System.out.println("The minimum value of 100 random number is: " + getArrayMin(arr));
	}
	public static void toStringArray(int []arr){
		for(int a = 0; a < arr.length; a++){
			System.out.println(arr[a]);
		}
	}
	public static int getArrayAverage(int []arr){
		int av = 0;
		for(int a = 0; a < arr.length; a++){
			av = av + arr[a];
		}
		return av/arr.length;
	} 
	public static int getArrayMax(int []arr){
		int max = 0;
		for(int a = 0; a < arr.length; a++){
			if(arr[a] > max){
				max = arr[a];
			}
		}
		return max;
	}
	public static int getArrayMin(int [] arr){
		int min = Integer.MAX_VALUE;
		for(int a = 0; a < arr.length; a++){
			if(arr[a] < min){
				min = arr[a];
			}
		}
		return min;
	}
}
