/*
 *	Author: Tara Pishehvar
 *  Date: 10/26/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int number = sc.nextInt();
		printPrime(number);
	}
	
	
	public static void printPrime (int b ){
		int c =2;
		while (c<b){
		boolean check= checkPrime(c);
			if (check){
				System.out.println(c);
			}
			c++;
		}
	}
	
	public static boolean checkPrime (int a ){
	int x= a-1;
	while (a %x!=0){
			x--;
	}
	if (x==1){
		return true;
	}
	else{
	return false;
	}
}
}
