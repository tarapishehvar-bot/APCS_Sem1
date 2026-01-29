/*
 *	Author: Tara Pishehvar 
 *  Date: 10/24/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Tara ATM!");
		System.out.println("We're going to create a bank account! What info do we know?");
		System.out.println("1 - Nothing");
		System.out.println("2 - Owner");
		System.out.println("3 - Owner and Initial Deposit");
		int choice = sc.nextInt();
		String name = sc.nextLine();
		BankAccount x;
		while (true){
		if (choice==1){
			 x = new BankAccount();
			x.accountToString();
		}
		else if (choice ==2){
			System.out.println("");
			System.out.println("What is the name of the owner of this bank account?");
			name = sc.nextLine();
			 x = new BankAccount(name);
			x.accountToString();
		}
		else if (choice ==3){
			System.out.println("");
			System.out.println("What is the name of the owner of this bank account?");
			name = sc.nextLine();
			System.out.println("How much are you initally depositing into this account?");
			int amount = sc.nextInt();
			String y = sc.nextLine();
			 x = new BankAccount(name, amount);
			x.accountToString();
			
			
		}
		else {
			System.out.println("Account unsuccessfuly created!");
			break;
		}
		System.out.println("");
		System.out.println("Would you like to check your balance of this account? (yes/no)");
		String option = sc.nextLine(); 
		if (option.equals("yes") || option.equals("Yes") ){
			x.checkBalance();
	
		}
		else if (option.equals("no") || option.equals("No") ){
			System.out.println("Great! No balance checked.");
		
		}
		else {
			System.out.println("You don't like to listen to instructions :P");
		
		}
		System.out.println("");
		System.out.println("Thank you for visiting Tara ATM!");
		break;
	}
	}
}
