/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What would the width of the box to be?");
		int r= sc.nextInt();
		String s = sc.nextLine();
		System.out.println("What would the height of the box to be?");
		int c = sc.nextInt();
		s = sc.nextLine();
		String [][] arr= new String [r][c];
		System.out.print("What symbol would you like to use? ");
		s = sc.nextLine();
		for (int i =0; i<arr.length; i++){
			System.out.println("");
			for (int j =0; j<arr[0].length; j++){
				arr[i][j]=s;
				System.out.print(arr[i][j]);
			}
		}
		
	}
}
