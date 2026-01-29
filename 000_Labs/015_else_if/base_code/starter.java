/*
 *	Author:  Tara Pishehvar
 *  Date:9/10/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print ("Guess an integer (1-1000) ");
		int y = sc.nextInt();
		int x = (int)(Math.random()*999+1);
		if (y>x){
			System.out.print("Your number is too high");
		}
		else if (y<x){
			System.out.print("Your number is too low");
		}
		else if (y==x){
			System.out.print("You guessed right");		}
	}
}
