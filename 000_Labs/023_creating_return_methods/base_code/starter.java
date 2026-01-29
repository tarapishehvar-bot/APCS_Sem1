/*
 *	Author:  Tara Pishehvar
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number: ");
		int base = sc.nextInt();
		System.out.println("What is your exponent number: ");
		int exp = sc.nextInt();
		int answer = pow(base, exp);
		System.out.println("Your answer is: "+answer);

		
	}
	public static int pow(int a, int b){
		int x = 0;
		int y= 1;
		while (x<b){
		y= y*a;
		x=x+1;
		}
		return y; 
	}
}
