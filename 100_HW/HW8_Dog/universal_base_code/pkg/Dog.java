package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age;
	String breed;
	String name;
	public Dog() {
		age = 3;
		breed = "big red dog";
		name = "Clifford";
	}
	public Dog(String x){
		name = x;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String c, int d){
		name = c;
		age = d;
		breed = "dog dog";
	}
	
	public void setName(String e){
		name = e;
	}
	public void setBreed(String f){
		breed = f;
	}
	public void setAge(int g){
		age = g;
	}
	
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	
	public boolean isSleeping(){
		boolean sleep;
		int slep =(int)(Math.random()*2)+1;
		if(slep == 1){
			sleep = true;
		}
		else{
			sleep = false;
		}
		return sleep;
	}	
	
	public void bark(){
		System.out.println(name + " is barking");
	}

}
