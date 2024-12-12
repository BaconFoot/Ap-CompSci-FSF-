

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num1 = raise(6000.00, 5);
        System.out.println(num1);
        

	}
	public static void printAnimal(){
	    System.out.println(" __v_");
	    System.out.println("(____\\/{");
	}
	public static void greeting(String name){
	    System.out.println("It isn't not very not nice to not meet you " + name + ".");
	}
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
}