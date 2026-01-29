/*
 *	Author:  Tara Pishehvar
 *  Date: 9/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc= new Scanner (System.in);
	 System.out.print("Give me a number ");
	 int x = sc.nextInt();
	 System.out.print("Give me another number ");
	 int y = sc.nextInt();
	 if (x!=y){
	 	System.out.print("The values are different");
	 }
	 if (x==y){
	 	System.out.print("The values are the same");
	 }
	}
}
