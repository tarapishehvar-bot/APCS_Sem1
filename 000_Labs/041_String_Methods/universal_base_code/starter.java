/*
 *	Author:  Tara Pishehvar
 *  Date: 12/4/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and last name with a space in the middle.");
		String word = sc.nextLine();
		int x= word.indexOf(" ");
		if (x>0){
		System.out.println("The last name is: "+word.substring(x+1));
		}
		else{
			System.out.println("You didn't enter a space!");
		}

		
	}
}
