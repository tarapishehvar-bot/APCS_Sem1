/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int accountNumber= (int)(Math.random()*950+50);
	double balance;
	boolean isActive;
	static int nextAccountNumber = accountNumber;

	// -------CONSTRUCTORS-------
	public BankAccount(String o, double b){
		owner=o;
		accountNumber= nextAccountNumber++;
		balance=b;
		isActive=true;
	}
	public BankAccount(String o){
		owner=o;
		accountNumber= nextAccountNumber++;
		balance=0;
		isActive=true;
	}
	public BankAccount(){
		owner="unknown";
		accountNumber=nextAccountNumber++;;
		balance=0;
		isActive=true;
	}
	// -------METHODS-------
	public void accountToString() {
		System.out.println("------Acount Info--------");
		System.out.println("Owner: "+owner);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Status: Active");
		System.out.println("-----------------------");
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: "+balance);
	}
}