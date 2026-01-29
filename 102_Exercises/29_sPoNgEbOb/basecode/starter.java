/*
	Author: Tara Pishehvar
	Date: 1/12/26
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Please enter a word or phrase:");
		String sent = sc.nextLine();
		System.out.println("\nYour word/phrase as sPoNgE cAsE:");
		while (sent.indexOf(" ")>-1){
			String word = sent.substring(0,sent.indexOf(" "));
			System.out.print(change(word)+" ");
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		System.out.print(change(sent));
	}
	
	
		public static String change (String word){
			String ans = "";
			for (int j=0; j<word.length(); j++){
				String letter = word.substring(j,j+1);
				if (j%2 == 0){
					letter= letter.toLowerCase();
				}
				else {
					letter= letter.toUpperCase();	
				}
			 ans = ans+letter;
			}
			return ans; 
		}
	
}

	/*	for (int i=0; i<sent.length(); i++){
			int space = sent.indexOf(" ");
			String word="";
			if (space > -1){
				word  = sent.substring(i,space);
			}
			if (i!=0){
					System.out.print(" ");
			}
			for (int j=0; j<word.length(); j++){
				if (j%2 == 0){
					System.out.print((word.substring(j,j+1)).toLowerCase());
				}
				else {
					System.out.print((word.substring(j,j+1)).toUpperCase());	
				}
			}
			sent = sent.substring(space);
		}
		*/