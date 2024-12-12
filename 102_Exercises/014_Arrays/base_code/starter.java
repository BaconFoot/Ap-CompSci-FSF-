/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// int [] arr = new int[1001];
		// int count = 0;	 
		// while(count < 1001){
		// 	arr[count] = (count + 1) * 3;
		// 	System.out.println(arr[count]);
		// 	count++;
		// }
		
		// int [] arr2 = new int[1001];
		// int count2 = 0;
		// while(count2 < 1001){
		// 	arr2[count2] = 1000 - count2;
		// 	System.out.println(arr2[count2]);
		// 	count2++;
		// }
		int [] arr = {5, 5, 7, 7, 7, 2, 9, 9};
		// for(int i=0; i < arr.length; i++){
		// 	System.out.println(arr[i] + " " + arr[i+1]);
		// }
		int x = 8;
		// for(int i=0; i < arr.length; i++){
		// 	if(x == arr[i]){
		// 		System.out.println(i);
		// 	}
		// }
		int a = 0;
		for(int i = 0; i < arr.length-1; i++){
			a = i+1;
			if(arr[i] == arr[a]){
				System.out.println("Dupe at " + i + " and " + a);
			}
		}
	}
}
