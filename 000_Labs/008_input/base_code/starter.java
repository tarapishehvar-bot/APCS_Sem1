/*
 *	Author:  Tara Pishehvar
 *  Date: 9/2/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String name = sc.nextLine();
		System.out.println("Your first name is "+name);
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("You are "+age+" years old");
		System.out.print("What is your birth month? ");
		String month = sc.nextLine();
		System.out.println("You were born in the month of "+month);
		System.out.print("What day were you born? ");
		int day = sc.nextInt();
		sc.nextLine();
		System.out.println("You were born on "+month+" "+day);
		System.out.print("How much is a buck fifty? ");
		double buck = sc.nextDouble();
		sc.nextLine();
		System.out.println("A buck fifty is $"+buck);
		
	
	}
}
