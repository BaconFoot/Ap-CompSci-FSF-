/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpery", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee kevin = new Employee(1972, "Kevin", "Malone", 4166.66);
		
		michael.raiseSalary(5);
		dwight.raiseSalary(5);
		jim.raiseSalary(5);
		pam.raiseSalary(10);
		kevin.raiseSalary(100);
		
		michael.getSalary();
		dwight.getSalary();
		jim.getSalary();
		pam.getSalary();
		kevin.getSalary();
		
		michael.employeeToString();
		System.out.println("Michael's Annual Salary is $" + michael.getAnnualSalary());

		dwight.employeeToString();
		System.out.println("Dwight's Annual Salary is $" + dwight.getAnnualSalary());

		jim.employeeToString();
		System.out.println("Jim's Annual Salary is $" + jim.getAnnualSalary());
				
		pam.employeeToString();
		System.out.println("Pam's Annual Salary is $" + pam.getAnnualSalary());

		kevin.employeeToString();
		System.out.println("Kevin's Annual Salary is $" + michael.getAnnualSalary());
	}
}
