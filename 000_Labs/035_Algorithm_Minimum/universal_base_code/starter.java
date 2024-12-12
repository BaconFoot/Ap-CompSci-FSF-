import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)(Math.random()*149)+51];
		int min = Integer.MAX_VALUE;
		int av = 0;
		int i = 0;
		int c = 0;
		int max = 0;
		
		while(i < arr.length){
			arr[i] = (int)(Math.random()*100)+1;
			av = av + arr[i];
			i++;
		}
		while(c < arr.length){
			if(arr[c] > max){
				max = arr[c];	
			}
			c++;
		}
		for(int b = 0; b < arr.length; b++){
			if(arr[b] < min){
				min = arr[b];
			}
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println(av/arr.length);
		System.out.println(arr.length);
	}
}
