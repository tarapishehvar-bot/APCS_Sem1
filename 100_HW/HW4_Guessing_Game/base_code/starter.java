/*
 *	Author: Tara Pishehvar
 *  Date: 9/16/25
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("The goal of the game is to guess the word with two hints");
		System.out.println("It's a planet in out solar system!");
		System.out.print("What is your guess? ");
		String word = sc.nextLine();
		if ((word.equals("Earth")) || (word.equals("earth"))){
			System.out.println("You guessed right!");
		}
		else{
			System.out.println("Unfortunately that is wrong, here's another hint!");
			System.out.println("It's the only planet with humans on it!");
			System.out.print("What is your guess? ");
			word = sc.nextLine();
			if ((word.equals("Earth")) || (word.equals("earth"))){
			System.out.println("You guessed right!");
			}
			else{
				System.out.print("The answer was Earth, better luck next time");
			}
		}	
		
			
		
		
		}
}
