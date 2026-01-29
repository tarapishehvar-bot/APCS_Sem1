/*
 *	Author:  Tara Pishehvar
 *  Date: 10/22/25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

		BankAccount b = new BankAccount();
		b.accountToString();
		BankAccount x = new BankAccount("Tara Li");
		x.accountToString();
		BankAccount y = new BankAccount("Sophia Pishehvar",676767.67);
		y.accountToString();
		BankAccount z = new BankAccount("Angela Kim",22222222.22);
		z.accountToString();
	}
}
