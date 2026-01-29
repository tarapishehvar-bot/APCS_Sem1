/*
 *	Author: Tara Pishehvar
 *  Date: 11/18/25
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int [100];
		toString(arr);
		max(arr);
		min(arr);
		average(arr);
		

	}
	public static void max(int [] arr){
		int max = arr[0];
		for (int i=0; i<arr.length; i++){
			if (arr[i]>max){
				max= arr[i];
			}
		}
		System.out.println("The maximum of 100 random numbers is "+max);
	}
	public static void min(int [] arr){
		int min = arr[0];
		for (int i=0; i<arr.length; i++){
			if (arr[i]<min){
				min= arr[i];
			}
		}
		System.out.println("The minumum of 100 random numbers is "+min);
	}
	public static void average(int [] arr){
		int total = 0;
		for (int i=0; i<arr.length; i++){
			total = total+arr[i];
		}
		System.out.println("The average of 100 random numbers is "+total/arr.length);
	}
	public static void toString(int [] arr){
		for (int i=0; i<arr.length; i++){
			arr[i] = (int)(Math.random()*100+1);
			System.out.println(arr[i]);
		}
		
	}
}
