/*
 *	Author: Tara Pishehvar
 *  Date: 12/10/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Sentence: ");
		String word = sc.nextLine();
		String ans = "";
		while (word.indexOf(" ")>-1){
			int space  = word.indexOf(" ");
			String firstWord = word.substring(0,space);
			word = word.substring(space+1);
			ans = " "+firstWord+ans;
		}
		System.out.println(word+ans);

		
	}
}
