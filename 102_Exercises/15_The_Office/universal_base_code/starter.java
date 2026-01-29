/*
 *	Author: Tara Pishehvar
 *  Date: 10/21/25
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(5);
		michael.employeeToString();
		System.out.print("Annual salary: ");
		System.out.println(michael.getAnnualSalary());
		System.out.println("");
		System.out.println("");
		
		Employee dwight = new Employee(1987,"Dwight" ,"Schrute",4416.66);
		dwight.raiseSalary(5);
		dwight.employeeToString();
		System.out.print("Annual salary: ");
		System.out.println(dwight.getAnnualSalary());
		System.out.println("");
		System.out.println("");
		
		Employee jim = new Employee(2474,"Jim", "Halpert",4416.66);
		jim.raiseSalary(5);
		jim.employeeToString();
		System.out.print("Annual salary: ");
		System.out.println(jim.getAnnualSalary());
		System.out.println("");
		System.out.println("");
		
		Employee pam = new Employee(2011,"Pam" ,"Beesly",2250.00);
		pam.raiseSalary(300);
		pam.employeeToString();
		System.out.print("Annual salary: ");
		System.out.println(pam.getAnnualSalary());
		System.out.println("");
		System.out.println("");
		
		Employee sophia = new Employee(1234,"Sophia" ,"Li",1000000.00);
		sophia.raiseSalary(4);
		sophia.employeeToString();
		System.out.print("Annual salary: ");
		System.out.println(sophia.getAnnualSalary());
		System.out.println("");
		System.out.println("");
		
	}
}
