/*
 *	Author:  Tara Pishehvar
 *  Date: 9/30/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("What is your name? ");
		String x = sc.nextLine();
		System.out.print("How many times do you want your name printed: ");
		int y = sc.nextInt();
		int z= 0;
		while (z<y){
			System.out.println(x);
			z= z+1;
		}


		
	}
}
