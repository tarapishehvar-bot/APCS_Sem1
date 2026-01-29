/*
 *	Author:  Tara Pishehvar
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		int num = (int) (Math.random()*1000+1);
		System.out.println("Please enter an integer 1-1000: ");
		int guess = sc.nextInt();
		while (guess!=num){
			if (guess>num){
				System.out.println("Your number is too high, guess again");
			}
			if (guess<num){
				System.out.println("Your number is too low, guess again");
			}
			System.out.println("Please enter an integer 1-1000: ");
			guess = sc.nextInt();
		}
		if (guess==num){
			System.out.println("You guessed correctly, yay!");
		}


		
	}
}
