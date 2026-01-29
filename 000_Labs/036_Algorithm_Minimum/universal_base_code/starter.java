/*
 *	Author: Tara Pishehvar
 *  Date: 11/10/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int len = (int)(Math.random()*(201-51)+51);
		int [] arr = new int [len];
		int total = 0;
		int max = 0;
		int min = 0;
		for (int i = 0; i<arr.length; i++){
			arr [i] = (int)(Math.random()*100+1);
			total = total + arr[i];
			if (i==0){
				max= arr[i];
				min = arr[i];
			}
			if (arr[i]>max){
				max= arr[i];
			}
			if (arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("There are "+len+" elements");
		System.out.println("The average is "+total/arr.length);
		System.out.println("The minimum is "+min);
		System.out.println("The maximum is "+max);
		
		

		
	}
}
