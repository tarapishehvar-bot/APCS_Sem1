/*
 *	Author: Tara Pishehvar
 *  Date: 11/6/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] x = new int[10];
		int index = 0;
		int number= 9;
		while (index<10){
			x[index]=number;
			System.out.println(x[index]);
			number--;
			index++;
		}

		
	}
}
