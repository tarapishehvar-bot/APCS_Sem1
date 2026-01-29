/*
 *	Author:  Tara Pishehvar
 *  Date: 1/15/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arr [][] = new int [2][2];
		System.out.println("The integer 2D array has " +arr.length+" rows and "+arr[0].length+" columns.");
		arr[0][0]=4;
		arr[0][1]=3;
		arr[1][0]=2;
		arr[1][1]=4;
		System.out.print("The 2D array is the following:");
		for (int i=0; i<arr.length;i++){
			System.out.println("");
			for (int j=0;j<arr[0].length; j++){
				System.out.print(arr[i][j]+" ");
			}
		}

		
	}
}
