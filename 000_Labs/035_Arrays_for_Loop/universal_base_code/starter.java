/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr= new int [1000];
		for (int index = 0; index < 1000; index++){
			arr [index]= (int)(Math.random()*100+1);
			System.out.println(arr[index]);
		}
		for (int index = 0; index < 1000; index++){
			System.out.println(arr[index]);
		}


		
	}
}
