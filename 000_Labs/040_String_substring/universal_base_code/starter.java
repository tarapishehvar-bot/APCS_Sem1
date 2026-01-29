/*
 *	Author: Tara Pishehvar
 *  Date: 12/4/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word.");
		String word = sc.nextLine();
		System.out.println("Letter by Letter: ");
		for (int i = 0; i<word.length(); i++){
			System.out.println(i+" "+word.substring(i,i+1));
		}
		


		
	}
}
