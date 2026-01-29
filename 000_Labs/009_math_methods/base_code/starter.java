/*
 *	Author:  Tara Pishehvar
 *  Date: 9/4/25
*/

import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		double ma = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		System.out.println("Maximum: "+ ma);
		double s = Math.sqrt(3 * 8 + 31 % 7);
		System.out.println("Square root: "+ s);
		double p = Math.pow(37 / 3, 35 % 21);
		System.out.println("Power: "+ p);
		double ex = Math.pow( 2,14%3);
		double root = Math.sqrt( 2*6);
		double m = Math.max(ex, root );
		System.out.println("Maximum: "+ m);
		
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Give me a decimal "); 
		double one= sc.nextDouble();
		System.out.print("Give me another decimal ");
		double two= sc.nextDouble();
		double biggest = Math.max(one,two);
		double square = Math.sqrt(two);
		double power = Math.pow(one,two);
		System.out.println("Max: "+biggest);
		System.out.println("Square root: "+square);
		System.out.println("Power: "+power);
		
		
	}
}
