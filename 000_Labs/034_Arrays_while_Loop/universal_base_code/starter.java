/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int []arr= new int [1000];
		int index = 0 ;
		while (index <1000){
			arr [index]= (int)(Math.random()*100+1);
			index ++;
		}
		index = 0 ;
		while (index<1000){
			System.out.println(arr[index]);
			index++;
		}


		
	}
}
