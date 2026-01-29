/*
 *	Author: Tara Pishehvar
 *  Date: 9/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to create a range for your random number"); 
		System.out.print("Please enter an integer: "); 
		int one = sc.nextInt();
		System.out.print("Please enter another integer (bigger than the first one): "); 
		int two = sc.nextInt();
		while (one>two){
			System.out.println("Your second number has to be bigger than your first number!");
			System.out.print("Please enter another integer bigger than "+one+" : "); 
			two = sc.nextInt();
		}
		if (one<two){
		System.out.println("Your range is "+one+" to "+two);
		System.out.println("Here are five numbers generated in that range:");
		System.out.print((int)(Math.random()*(two-one)+one)+", ");
		System.out.print((int)(Math.random()*(two-one)+one)+", ");
		System.out.print((int)(Math.random()*(two-one)+one)+", ");
		System.out.print((int)(Math.random()*(two-one)+one)+", ");
		System.out.println((int)(Math.random()*(two-one)+one));
		}
		
	}
}
