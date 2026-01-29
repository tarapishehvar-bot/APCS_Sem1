/*
 *	Author:  Tara Pishehvar
 *  Date: 10/27/25
*/

package pkg;
import java.util.*;

public class BankAccount {
	String owner;
	static int accountNumber= (int)(Math.random()*950+50);
	double balance;
	boolean isActive;
	int nextAccountNumber;
	
	public BankAccount(String o, double b){
		owner=o;
		nextAccountNumber=accountNumber ++;
		balance=b;
		isActive=true;
	}
	public BankAccount(String o){
		owner=o;
		nextAccountNumber=accountNumber++;
		balance=0;
		isActive=true;
	}
	public BankAccount(){
		owner="unknown";
		nextAccountNumber=accountNumber++;;
		balance=0;
		isActive=true;
	}
	// -------METHODS-------
	public void displayAccountInfo() {
		System.out.println("------Acount Info--------");
		System.out.println("Owner: "+owner);
		System.out.println("Account number: "+nextAccountNumber);
		System.out.println("Balance: "+balance);
		System.out.println("Status: Active");
		System.out.println("-----------------------");
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: "+balance);
	}
	public double getBalance(){
		return balance;
	}
	public void setOwner(String o){
		owner=o;
	}
	public String getOwner(){
		return owner;
	}
	public void deposit(double d){
		if (isActive){
			balance= balance+d;
		}
	}
	public void withdraw (double w){
		if ((isActive)&&(w<=balance)){
			balance= balance-w;
		}
	}
	public void closeAccount(){
		isActive =false;
	}
}