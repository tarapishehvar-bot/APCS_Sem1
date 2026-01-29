/*
 *	Author:  Tara Pishehvar 
 *  Date: 10/9/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence: ");
		String sent = sc.nextLine();
		System.out.println("Write a sentence: ");
		String sent2 = sc.nextLine();
		System.out.println("");
		toString(sent);
		toStringCombined(sent,sent2);
	}
	public static void toString(String a){
		System.out.println(a);
	}
	public static void toStringCombined(String a, String b){
		System.out.println(a+" "+b);
	}
}
