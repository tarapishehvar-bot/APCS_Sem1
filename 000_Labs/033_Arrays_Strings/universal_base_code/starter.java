/*
 *	Author:  Tara Pishehvar
 *  Date: 11/5/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String [] song = new String[10];
		song[0] ="I don't want a lot for Christmas" ;
		song [1]="There is just one thing I need";
		song [2]="I don't care about the presents underneath the Christmas tree";
		song [3]="I just want you for my own";
		song [4]="More than you could ever know";
		song [5]="Make my wish come true";
		song [6]="All I want for Christmas is you";
		song [7]="Yeah";
		song [8]="I don't want a lot for Christmas";
		song [9]="There is just one thing I need (and I)";
		int index = 0; 
		while (index<10){
			System.out.println(song[index]);
			index++;
		}
	
		
	}
}
