/*
 *	Author: Tara Pishehvar
 *  Date: 11/13/25
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr = new int [20];
		int ranNum= (int)(Math.random()*10+1);
		System.out.println("There are 20 random numbers");
		int total = 0;
		for (int i=0; i<arr.length; i++){
			arr [i]= (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("The random number to look for is "+ranNum);
		for (int i=0; i<arr.length; i++){
			if (arr[i]==ranNum){
				System.out.println("Duplicate found at index "+i);
				total++;
			}
		}
		System.out.println("Total number of duplicates for " +ranNum+" is "+total);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		for (int i=0; i<arr.length-1; i++){
			if (arr[i]==arr[i+1]){
				System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+arr[i]);
			}
		}
	}
}
