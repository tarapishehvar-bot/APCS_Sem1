/*
 *	Author:  Tara Pishehvar
 *  Date: 1/15/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many rows would you like for your 2D array?");
		int row = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int col = sc.nextInt();
		int arr [] []= new int [row][col];
		System.out.println("---------------------------------------");
		double sum=0;
		for (int i =0; i<arr.length; i++){
			for (int j = 0; j<arr[0].length; j++){
				arr[i][j]=(int)(Math.random()*9+1);
				System.out.print(arr[i][j]+" ");
				sum +=arr[i][j];
			}
			System.out.println(" ");
		}
		System.out.println("---------------------------------------");
		double rowSum = 0;
		System.out.println("What row would you like to get the average of?");
		int r = sc.nextInt();
		for (int i = 0; i<arr[0].length; i++){
			rowSum+=arr[r][i];
		}
		System.out.println("The average of the 2D array is "+sum/(arr.length*arr[0].length));
		System.out.println("The row average is "+rowSum/arr[0].length);


		
	}
}
