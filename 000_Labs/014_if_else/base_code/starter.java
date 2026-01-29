/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Guess an integer (1-100) ");
		int y = sc.nextInt();
		int x = (int)(Math.random()*99+1);
		if (y==x){
			System.out.print("Your guessed right");
		}
		if (y!=x){
			System.out.print ("Guess again ");
			y = sc.nextInt();
		}
	}
}
