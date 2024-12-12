/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String name;
	int age;
	String villan;
	
	public Spiderman() {
		name = "Miles Morales";
		age = 13;
		villan = "King Pin";
	}
	public Spiderman(String x){
		name = x;
	}
	public Spiderman(String x, int y){
		name = x;
		age = y;
	}
	public Spiderman(String x, String z){
		name = x;
		villan = z;
	}
}
