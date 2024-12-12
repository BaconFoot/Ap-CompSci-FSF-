/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
	// Your code goes below here
	PooleDwarf d1 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d2 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d3 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d4 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d5 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d6 = new PooleDwarf(randName(), (int) (Math.random()*10));
	PooleDwarf d7 = new PooleDwarf(randName(), (int) (Math.random()*10));
	int i = 0;
	if(d1.isSameName(d2.getName())){
		i++;
	}
	if(d1.isSameName(d3.getName())){
		i++;
	}
	if(d1.isSameName(d4.getName())){
		i++;
	}
	if(d1.isSameName(d5.getName())){
		i++;
	}
	if(d1.isSameName(d6.getName())){
		i++;
	}
	if(d1.isSameName(d7.getName())){
		i++;
	}
	
	if(i == 0){
		System.out.println(i + " dwarf have the same name "+ d1.getName());
	}
	else{
		System.out.println((i + 1) + " dwarfs have the same name "+ d1.getName());
	}
	}
}